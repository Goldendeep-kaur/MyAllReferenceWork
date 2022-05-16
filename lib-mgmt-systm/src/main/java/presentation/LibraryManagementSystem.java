package presentation;

import java.util.Scanner;

import exception.AppException;
import pojo.UserPojo;
import service.UserService;
import service.UserServiceImpl;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		Scanner scan= new Scanner(System.in);
		int option=0;
		
		 char proceed='y';
		while(proceed=='y') {
			System.out.println("******************************");
			System.out.println("");
			System.out.println("LIBRARY MANAGEMENT SYSTEM");
			System.out.println("");
			System.out.println("******************************");
			System.out.println("");
			System.out.println("1. Create Account/User!!");
			System.out.println("2. Login.");
			System.out.println("3. Exit.");
			System.out.println("******************************");
			System.out.println("Choose your option :");
			//int option= scan.nextInt();
			option= Integer.parseInt(scan.nextLine());
			//option= Integer.parseInt(scan.nextLine());
			
			
			switch(option) {
			case 1:
				UserPojo userPojo= new UserPojo();
				
				System.out.println("**************************************");
				System.out.println("");
				System.out.println("Please enter your First Name :");
				//scan.nextLine();
				userPojo.setUserFName(scan.nextLine());
				System.out.println("**************************************");
				System.out.println("Please enter your Last Name :");
				userPojo.setUserLName(scan.nextLine());
				System.out.println("**************************************");
				System.out.println("Please Enter Username :");
				userPojo.setUserName(scan.nextLine());
				System.out.println("***************************************");
				System.out.println("Please enter the password for username :");
				userPojo.setUserPassword(scan.nextLine());
				
				System.out.println("***************************************");
				System.out.println("Please enter User Type as : ");
				System.out.println("***************************************");
				System.out.println("1. Admin");
				System.out.println("2. User");
				System.out.println("***************************************");
				System.out.println(" Enter your Option :");
				//int userOption = scan.nextInt();
				int userOption= Integer.parseInt(scan.nextLine());
				//userPojo.setUserType(scan.nextInt());
				System.out.println("************************************");
				if(userOption==1) {
					userPojo.setUserType("Admin");
				}else if(userOption==2) {
					userPojo.setUserType("User");
				}
				
				UserPojo newUserPojo1=null;
				
				try {
					newUserPojo1= userService.createUserAccount(userPojo);
				} catch (AppException e) {
					System.out.println("********************************");
					System.out.println("Sorry Your request cannot process at this time.");
					System.out.println("Please try again later");
					System.out.println("********************************");
					System.out.println(e.getMessage());
					break;
				}
				 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				// System.out.println("Congratulations your Account Created Successfully: \n User ID:\t"+ userPojo.getUserId()+"\n  User First Name:"+userPojo.getUserFName()+"\n User Last Name:"+userPojo.getUserLName()+"\n Your Username: "+userPojo.getUserName()+"\n Your Password:"+userPojo.getUserPassword()+"\n"+userPojo.getUserType());
				 System.out.println("Successful...");
				 System.out.println("user id :"+newUserPojo1.getUserId());
				// System.out.println("Now you can Login to use the services From Library Management system.!!");
				 System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				 break;
				 
			case 2:
				UserPojo loginPojo= new UserPojo();
				System.out.println("*************************************");
				System.out.println("Enter your username :");
				loginPojo.setUserName(scan.nextLine());
				System.out.println("Enter your password :");
				loginPojo.setUserPassword(scan.nextLine());
				
				UserPojo loginUserPojo=null;
				try {
					loginUserPojo= userService.varifyUser(loginPojo);
				} catch (AppException e) {
					System.out.println("********************************");
					System.out.println("Sorry Your request cannot process at this time.");
					System.out.println("Please try again later");
					System.out.println("********************************");
					System.out.println(e.getMessage());
					break;
				}
				
				//As i took user type in integer
				String uType= loginUserPojo.getUserType();
				if(uType!=null && uType.equals("Admin")) {
					System.out.println("*************");
					System.out.println("Admin Login Successfully!!!!!!");
					
					//menu for admin here
					System.out.println("Goldyyyyyy");
					System.out.println("***************");
				}else if(uType!=null && uType.equals("User")) {
					
					System.out.println("*************");
					System.out.println("User Login Successfully!!!!!!");
					
					//menu for admin here
					System.out.println("Goldyyyyyy");
					System.out.println("***************");
				}else if(uType==null) {
					System.out.println("*************");
					System.out.println("Login Failed");
					System.out.println("**************");
				}break;
			case 3:
				System.out.println("********************************************");
				System.out.println("Thank you for being part of our system.");
				System.out.println("********************************************");
				System.exit(0);
//			case 3:
//				userService.exitApp();
//				System.out.println("********************************************");
//				System.out.println("Thank you for being part of our system.");
//				System.out.println("********************************************");
//				scan.close();
//				System.exit(0);
//				break;
				default:
					System.out.println("Please enter a valid Option");
					continue;
			}
		
		}

	}

}
