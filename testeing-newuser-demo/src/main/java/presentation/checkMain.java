package presentation;

import java.util.Scanner;

import exception.SystemException;
import model.UserPojoo;
import service.UserService;
import service.UserServiceImpl;

public class checkMain {

	public static void main(String[] args) {
		UserService newUser= new UserServiceImpl();
		Scanner scan= new Scanner(System.in);
		char proceed='y';
		while(proceed=='y') {
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("");
			System.out.println("LIBRARY MANAGEMENT SYSTEM");
			System.out.println("");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("");
			System.out.println("1. Create Account/User!!");
			System.out.println("2. Login.");
			System.out.println("3. Exit.");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("Please enter your choice :");
			int choice= scan.nextInt();
			
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			switch(choice) {
			
			case 1:
				UserPojoo newUserPojo1= new UserPojoo();
				System.out.println("**************************************");
				System.out.println("");
				System.out.println("Please enter your First Name :");
				scan.nextLine();
				newUserPojo1.setUserFName(scan.nextLine());
				System.out.println("**************************************");
				System.out.println("Please enter your Last Name :");
				newUserPojo1.setUserLName(scan.nextLine());
				System.out.println("**************************************");
				System.out.println("Please Enter Username :");
				newUserPojo1.setUserName(scan.nextLine());
				System.out.println("***************************************");
				System.out.println("Please enter the password for username :");
				newUserPojo1.setPassword(scan.nextLine());
				System.out.println("***************************************");
				
				
				System.out.println("***************************************");
				System.out.println("Please enter User Type as : ");
				System.out.println("***************************************");
				System.out.println("1. Admin");
				System.out.println("2. User");
				System.out.println("***************************************");
				System.out.println(" Enter your Option :");
				int userOption= Integer.parseInt(scan.nextLine());
				System.out.println("************************************");
				if(userOption==1) {
					newUserPojo1.setUserType("Admin");
				}else if(userOption==2) {
					newUserPojo1.setUserType("User");
				}
				
				UserPojoo newUserPojo2=null;
				try {
					newUserPojo2= newUser.addUser(newUserPojo1);
				} catch (SystemException e) {
					System.out.println("********************************");
					System.out.println("Sorry Your request cannot process at this time.");
					System.out.println("Please try again later");
					System.out.println("********************************");
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("Successful...");
				 System.out.println("user id :"+newUserPojo2.getUserId()+"\n  User First Name:"+newUserPojo2.getUserFName()+"\n User Last Name:"+newUserPojo2.getUserLName()+"\n Your Username: "+newUserPojo2.getUserName()+"\n Your Password:"+newUserPojo2.getPassword()+"\n User Type :"+newUserPojo2.getUserType());
				 break;
			case 2:
				UserPojoo loginPojo1= new UserPojoo();
				
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("This will be Login window and it is under process yet!!!");
				
				System.out.println("Enter your username :");
				scan.nextLine();
				loginPojo1.setUserName(scan.nextLine());
				System.out.println("Enter your password :");
				loginPojo1.setPassword(scan.nextLine());
				
				UserPojoo returnLoginUser=null;
				try {
					returnLoginUser= newUser.validateLogin(loginPojo1);
				} catch (SystemException e) {
					System.out.println("********************************");
					System.out.println("Sorry Your request cannot process at this time.");
					System.out.println("Please try again later");
					System.out.println("********************************");
					System.out.println(e.getMessage());
					break;
				}
				
				String uType= returnLoginUser.getUserType();
				if(uType!=null && uType.equals("Admin")) {
					System.out.println("*************");
					System.out.println("Admin Login Successfully!!!!!!");
					
					//menu for admin here
					System.out.println("Admin menu");
					System.out.println("***************");
					break;
				}
				else if(uType!=null && uType.equals("User")) {
					System.out.println("*************");
					System.out.println("User Login Successfully!!!!!!");
					
					//menu for admin here
					System.out.println("User menu");
					System.out.println("***************");
					break;
				}
				
				else if(uType==null) {
					System.out.println("*************");
					System.out.println("Login Failed");
					System.out.println("**************");
					break;
				} break;
				
			case 3:
				System.out.println("********************************************");
				System.out.println("Thank you for being part of our system.");
				System.out.println("********************************************");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid option");
				continue;
			}
		}

	}

}
