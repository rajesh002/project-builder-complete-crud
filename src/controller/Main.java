package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
import java.util.Map.Entry;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import businesslogic.Registration;
import businesslogic.checkUser;
import dao.AirConditioner;
import dao.Category;
import dao.Refrigerator;
import dao.Televisions;
import dao.UserDAO;
import dao.WashingMachine;
import dao.digitalCameras;
import dao.laptops;
import dao.mobiles;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int itemSelection,BrandSelection,ModelSelection,role,adminChoice,brandNum,modelNum,price,totalAmount=0;
		String phoneNumber;
		int removeModel;
		boolean detailsExist=false,isValid=false;
		String userChoice,userName,passWord,confirmPassword,modelName,newUser;
		LinkedHashMap<String,Integer> result=new LinkedHashMap<String,Integer>();
		
		// Creating Objects for all products
		
		Category Ctgry=new Category();
		Refrigerator refig=new Refrigerator(); 
		WashingMachine washMachne=new WashingMachine();
		Televisions tv=new Televisions();
		mobiles mb=new mobiles();
		AirConditioner ac=new AirConditioner();
		laptops lp=new laptops();
		digitalCameras digCam=new digitalCameras();
	
		
		
	    System.out.println("---------Welcome to Electronic Store---------");	
		System.out.println("	1.Admin		");
		System.out.println("	2.SignUp	");
		System.out.println("	3.Login		");
		role=sc.nextInt();
		sc.nextLine();
		
		
		
		
		
		
		// Admin Operations
		
		if(role==1){
			
			//Checking Is it Admin or not
			
			do 
			{
			System.out.println("Enter Your Username: ");
			userName=sc.next();
			System.out.println("Enter Your PassWord: ");
			passWord=sc.next();
			checkUser chkUsr= new checkUser(userName,passWord);
			if(chkUsr.admin()) {
				detailsExist=true;
			}
			}while(!detailsExist);
			
			

			// It is Admin can perform below operations 
			
				System.out.println("	Admin Login Sucessfully		");
				do {
				System.out.println("	1.Add Items 		");
				System.out.println("	2.Remove Items		");
				adminChoice=sc.nextInt();
				sc.nextLine();
				
				
				switch(adminChoice) {
					
							//Adding items to store
				case 1:
						Ctgry.displayCategory();
						System.out.println("Select item where you want to add new model");
						brandNum=sc.nextInt();
						sc.nextLine();
						
						// Based on user choice add the model to particular brand
						
						switch(brandNum) {
						// Searching  for user Selected item
						case 1:
							refig.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.nextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							refig.addModel(modelName,price,modelNum);
							refig.displayModels(modelNum);
							System.out.println("New model added Sucessfully");
							break;
							
						case 2:
		
							washMachne.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.hasNextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							washMachne.addModel(modelName,price,modelNum);
							washMachne.displayModels(modelNum);
							System.out.println("New model added Sucessfully	");
							break;
							
						case 3:
							
							tv.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.nextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							tv.addModel(modelName,price,modelNum);
							tv.displayModels(modelNum);
							System.out.println("New model added Sucessfully	");
							break;
							
						case 4:

							mb.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.nextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							mb.addModel(modelName,price,modelNum);
					        mb.displayModels(modelNum);
							System.out.println("New model added Sucessfully	");
							break;
							
						case 5:
							ac.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.nextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							ac.addModel(modelName,price,modelNum);
							ac.displayModels(modelNum);
							System.out.println("New model added Sucessfully");
							break;
							
						case 6:
							lp.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.nextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							lp.addModel(modelName,price,modelNum);
							lp.displayModels(modelNum);
							System.out.println("New model added Sucessfully	");
							break;
							
						case 7:
							digCam.displayBrands();
							System.out.println("select brand where you want to add new model");
							modelNum=sc.nextInt();
							sc.nextLine();
							System.out.println("Please enter name of the new model");
							modelName=sc.nextLine();
							System.out.println("Set price for the new model");
							price=sc.nextInt();
							sc.nextLine();
							digCam.addModel(modelName,price,modelNum);
							digCam.displayModels(modelNum);
							System.out.println("New model added Sucessfully	");
							break;
						}
						break;
						
					//Removing item from the store 
			case 2:

				Ctgry.displayCategory();
				System.out.println("Select item where you want remove model");
				brandNum=sc.nextInt();
				sc.nextLine();
				
				// Based on user choice remove the model to particular brand
				
				switch(brandNum) {
						// Searching  for user Selected item
				case 1:
					
					refig.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					refig.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					refig.removeModel(modelNum,removeModel);
					refig.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
					
				case 2:

					washMachne.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					washMachne.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					washMachne.removeModel(modelNum,removeModel);
					washMachne.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
					
				case 3:
					
					tv.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					tv.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					tv.removeModel(modelNum,removeModel);
					tv.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
					
					
				case 4:

					mb.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					mb.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					mb.removeModel(modelNum,removeModel);
					mb.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
					
				case 5:

					ac.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					ac.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					ac.removeModel(modelNum,removeModel);
					ac.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
					
				case 6:
					
					lp.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					lp.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					lp.removeModel(modelNum,removeModel);
					lp.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
					
				case 7:
					
					digCam.displayBrands();
					System.out.println("select brand where you want remove model");
					modelNum=sc.nextInt();
					sc.nextLine();
					digCam.displayModels(modelNum);
					System.out.println("select model which you want to remove");
					removeModel=sc.nextInt();
					sc.nextLine();
					digCam.removeModel(modelNum,removeModel);
					digCam.displayModels(modelNum);
					System.out.println(" model removed Sucessfully");
					break;
				}
			}
			System.out.println("Are you want to continue : yes/no");
			userChoice=sc.nextLine();			
		  }while(userChoice.equals("yes"));
	    System.out.println("Thank you");
        }	

		
				
		// For new user Registration
				
		else if(role==2) {
			do {
			System.out.println("Enter new userName");
			newUser = sc.next();
			System.out.println("Enter password:");
			passWord=sc.next();
			System.out.println("Confirm Password");
			confirmPassword=sc.next();
			Registration Rgn=new Registration(newUser,passWord,confirmPassword);
				if(Rgn.checkUserDetails()) {
				isValid=true;
				UserDAO userdao=new UserDAO();
				userdao.signUp(newUser,passWord);
				System.out.println("Congratulations your account was created");
				}
			}while(!(isValid));
		}
	   
		
		
		// For Existing login users
		 
		if(role==3 || role==2) {
			// User Validation
			do 
			{
			UserDAO userdao=new UserDAO();
			System.out.println("Enter Your Username: ");
			userName=sc.next();
			System.out.println("Enter Your PassWord: ");
			passWord=sc.next();
			if(userdao.loginUser(userName,passWord))
				detailsExist=true;
			}while(!detailsExist);
			
			
			do {
			//Display the items on the category class
			
			System.out.println("Select item	which you want to buy");
			Ctgry.displayCategory();         
			itemSelection =sc.nextInt();
			switch(itemSelection) {
			
			//Creating object for refrigerator class and display brands
			
				case 1:
					 
					refig.displayBrands();
					BrandSelection =sc.nextInt();
					refig.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(refig.getModel(ModelSelection),refig.getPrice(ModelSelection));
					break;
					
			//Creating object for WashingMachine class and display brands
					
				case 2:
					
					washMachne.displayBrands();
					BrandSelection =sc.nextInt();
					washMachne.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(washMachne.getModel(ModelSelection),washMachne.getPrice(ModelSelection));
					break;
					
			//Creating object for Television class and display brands
					
				case 3:
					
					tv.displayBrands();
					BrandSelection =sc.nextInt();
					tv.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(tv.getModel(ModelSelection),tv.getPrice(ModelSelection));
					break;
					
			//Creating object for MObiles class and display brands
					
				case 4:
					
					mb.displayBrands();
					BrandSelection =sc.nextInt();
					mb.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(mb.getModel(ModelSelection),mb.getPrice(ModelSelection));
					break;
					
			//Creating object for AirConditioner class and display brands	
					
				case 5:
					
					ac.displayBrands();
					BrandSelection =sc.nextInt();
					ac.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(ac.getModel(ModelSelection),ac.getPrice(ModelSelection));
					break;
					
			//Creating object for laptop class and display brands
					
				case 6:
					
					lp.displayBrands();
					BrandSelection =sc.nextInt();
					lp.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(lp.getModel(ModelSelection),lp.getPrice(ModelSelection));
					break;
					
			//Creating object for digitalCameras class and display brands
					
				case 7:
					
					digCam.displayBrands();
					BrandSelection =sc.nextInt();
					digCam.displayModels(BrandSelection);
					ModelSelection =sc.nextInt();
					sc.nextLine();
					result.put(digCam.getModel(ModelSelection),digCam.getPrice(ModelSelection));
					break;
					
					
			}
			System.out.println("Are you want to continue the shopping :yes/no");
			userChoice=sc.nextLine();
			}while(userChoice.equals("yes"));
			
			//Reading Delivery Details
			
			System.out.println("Please enter delivery details: ");
			System.out.println("Enter Your Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Your Phone Number:");
			phoneNumber=sc.next();
			sc.nextLine();
			System.out.println("House No:");
			String houseNo = sc.next();
			sc.nextLine();
			System.out.println("Street:");
			String street = sc.nextLine();
			System.out.println("Enter Your State:");
			String state = sc.nextLine();
			System.out.println("Enter Your City:");
			String city = sc.nextLine();
			System.out.println("Enter Your PinCode:");
			String pincode = sc.next();
			sc.nextLine();
			   
			//Pdf Generation
			
			 Document document = new Document();
		      try
		      {
		         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("orderDetails.pdf"));
		         document.open();
		         document.add(new Paragraph("Order Details: \n"));
		         for (Entry<String, Integer> entry : result.entrySet()) {
			            document.add(new Paragraph(entry.getKey() + "------------------------------" +entry.getValue()+"\n")); 
			            totalAmount+=entry.getValue();
					}
		         document.add(new Paragraph("___________________________________________________________"));
		         document.add(new Paragraph(" Total amount is                                           "+totalAmount));
		         document.add(new Paragraph("____________________________________________________________"));
		         document.add(new Paragraph("Delivery To :\n"));
		         document.add(new Paragraph("          "+name+"\n"));
		         document.add(new Paragraph("          "+phoneNumber+"\n"));
		         document.add(new Paragraph("          "+houseNo+"\n"));
		         document.add(new Paragraph("          "+street+"\n"));
		         document.add(new Paragraph("          "+state+"\n"));
		         document.add(new Paragraph("          "+city+"\n"));
		         document.add(new Paragraph("          "+pincode+"\n"));
		         document.close();
		         writer.close();
		      } catch (DocumentException e)
		      {
		         e.printStackTrace();
		      } catch (FileNotFoundException e)
		      {
		         e.printStackTrace();
		      }
		      
		      // Sending Text message
		    //  Sms send=new Sms();
		     // send.sendSms(totalAmount,phoneNumber);
		      
			System.out.println("Your order is confirmed \n  payment mode : Cash On Delivery ");
			}
		/*else
			System.out.println("Choice the correct option");	*/
		sc.close();
		}
}



