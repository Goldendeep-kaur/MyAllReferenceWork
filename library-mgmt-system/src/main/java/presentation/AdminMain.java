package presentation;

import java.util.List;
import java.util.Scanner;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.AdminPojo;
import model.NewUserPojo;
import service.AdminService;
import service.AdminServiceImpl;
import service.CreateServiceImpl;
import service.CreateUserService;

public class AdminMain {

	public static void main(String[] args) {
		
		CreateUserService newUserService = new CreateServiceImpl();
		Scanner scan= new Scanner(System.in);
		
		Scanner sc= new Scanner(System.in);
		CreateUserService  createUserService= new CreateServiceImpl();
		
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
				NewUserPojo newUserPojo1= new NewUserPojo();
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
				System.out.println("Please enter User Type as (only 2 as this is only for users) : ");
				newUserPojo1.setUserType(scan.nextInt());
				System.out.println("************************************");
				
				NewUserPojo newUserPojo =null;
				 try {
					 newUserPojo=newUserService.addUser(newUserPojo1);
					//NewUserPojo newUserPojo = newUserService.addUser(newUserPojo1);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
					break;
				}
				 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				 System.out.println("Congratulations your Account Created Successfully: \n User ID:\t"+ "\t"+newUserPojo1.getUserId()+"\n  User First Name:"+ "\t"+newUserPojo1.getUserFName()+"\n User Last Name:"+ "\t"+newUserPojo1.getUserLName()+"\n Your Username: "+ "\t"+newUserPojo1.getUserName()+"\n Your Password:"+ "\t"+newUserPojo1.getPassword()+"\n User Type: "+ "\t"+newUserPojo1.getUserType());
				 System.out.println("Now you can Login to use the services From Library Management system.!!");
				 System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				 break;
			case 2:
				System.out.println("This will be Login window and it is under process yet!!!");
				break;
			case 3:
				System.out.println("********************************************");
				System.out.println("Thank you for being part of our system.");
				System.out.println("********************************************");
				System.exit(0);
			default:
			}
			
			CreateUserService  createUserService1= new CreateServiceImpl();
			
			
			char process='y';
			while(process=='y') {
				System.out.println("*******************************************");
				System.out.println("Welcome To Login Window");
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("1. View.");
				System.out.println("2. Login.");
				System.out.println("3. Exit.");
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("Please enter your option :");
				int option =scan.nextInt();
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				switch(option) {
				
				case 1:
					List<NewUserPojo> everyUser;
					try {
						everyUser=newUserService.getAllUsers();
						
					} catch (EmptyCatelogException e ) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						System.out.println(e.getMessage());
						break;
					}catch(SystemException e){
						System.out.println(e.getMessage());
						break;
					}

					
					
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("User Id\tUser Frist Name\t User Last Name\tUser Name\tPassword\t User Type");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					everyUser.forEach((person)->System.out.println(person.getUserId()+"\t"+person.getUserFName()+"\t"+person.getUserLName()+"\t"+person.getUserLName()+"\t"+person.getPassword()+"\t"+person.getUserType()));
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Do you want to continue?(y/n)");
					process=scan.next().charAt(0);
					break;
				case 2:
					System.out.println("I am Under Process just wait for me.");
					break;
				case 3:
					System.out.println("********************************************");
					System.out.println("Thank you for being part of our system.");
					System.out.println("********************************************");
					System.exit(0);
					default:
					
				}
			}
			
			System.out.println("********************************************");
			System.out.println("Thank you for being part of our system.");
			System.out.println("********************************************");
			System.exit(0);
			
		}

	}

}
