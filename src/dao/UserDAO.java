package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SignUp;
import model.login;
import utility.ConnectionManager;

public class UserDAO {
	
	public int signUp(String username,String pass) throws Exception {
		SignUp user=new SignUp();
		user.setUserName(username);
		user.setPassWord(pass);
		String INSERT_USERS_SQL = "INSERT INTO customer_data(username, password)VALUES(?,?)";

		int result = 0;
		try
		{
			Connection connection = ConnectionManager.getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1,user.getUserName());
			preparedStatement.setString(2,user.getPassWord());
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean loginUser(String username,String pass) throws Exception {
		login userdata=new login();
		userdata.setUserName(username);
		userdata.setPassWord(pass);
		boolean status = false;
		try{
			Connection connection = ConnectionManager.getConnection();
		
				// Step 2:Create a statement using connection object
		PreparedStatement pstmt = connection.prepareStatement("select * from customer_data where username = ? and password = ? ");
		
			pstmt.setString(1, userdata.getUserName());
			pstmt.setString(2, userdata.getPassWord());

			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			System.out.println(e);
		}
		return status;
	}

}
