package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class login {
	private String userName;
	private String passWord;
	protected ArrayList<String> userNames=new  ArrayList<String>();
	protected ArrayList<String> passWords=new ArrayList<String>();
	
	public login() {
		userNames.add("admin");
		passWords.add("admin");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
}
