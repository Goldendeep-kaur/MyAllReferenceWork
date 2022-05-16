//package presentation;
//
//import java.util.List;
//import java.util.Scanner;
//
//import exception.EmptyCatelogException;
//import exception.SystemException;
//import model.AdminPojo;
//import model.NewUserPojo;
//import service.AdminService;
//import service.AdminServiceImpl;
//import service.CreateServiceImpl;
//import service.CreateUserService;
//
//public class usermain {
//
//	public static void main(String[] args) {
//		
//		CreateUserService newUserService = new CreateServiceImpl();
//		Scanner scan= new Scanner(System.in);
//		
//		Scanner sc= new Scanner(System.in);
//		CreateUserService  createUerService= new CreateServiceImpl();
//		char process='y';
//		while(process=='y') {
//			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//			System.out.println("");
//			System.out.println("Testing Unit for new user");
//			System.out.println("");
//			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//			System.out.println("");
//			System.out.println("1. Create Account/User!!");
//			System.out.println("2. Login.");
//			System.out.println("3. Exit.");
//			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//			System.out.println("");
//			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//			System.out.println("Please enter your choice :");
//			int choice= scan.nextInt();
//			switch(choice) {
//			case 1:
//				
//				NewUserPojo newUserPojo1= new NewUserPojo();
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				System.out.println("");
//				System.out.println("Please enter your First Name :");
//				scan.nextLine();
//				newUserPojo1.setUserFName(scan.nextLine());
//				System.out.println("************************************");
//				System.out.println("Please enter your Last Name :");
//				newUserPojo1.setUserLName(scan.nextLine());
//				System.out.println("*************************************");
//				System.out.println("Please Enter Username :");
//				newUserPojo1.setUserName(scan.nextLine());
//				System.out.println("**************************************");
//				System.out.println("Please enter the password for username :");
//				newUserPojo1.setPassword(scan.nextLine());
//				System.out.println("***************************************");
//				System.out.println("Please enter User Type as (only 2 as this is only for users) : ");
//				newUserPojo1.setUserType(scan.nextInt());
//				System.out.println("************************************");
//				
//				
//				
//				NewUserPojo newUserPojo=null;
//				try {
//				newUserPojo= newUserService.addUser(newUserPojo1);
//			}catch(SystemException e){
//				System.out.println(e.getMessage());
//				break;
//			}
//				
//				default:
//			}
//			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//			System.out.println("Successfull!!!!!");
//			System.out.println("######################################");
//			
//			
//			AdminService adminService = new AdminServiceImpl();
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				System.out.println("");
//				System.out.println("######################################");
//				
//				char sucess='y';
//				if(sucess=='y')
//				{
//				
//				while (sucess == 'y') {
//					System.out.println("************************************");
//					System.out.println("");
//					System.out.println("Library Management System");
//					System.out.println("");
//					System.out.println("************************************");
//					System.out.println("1. View All Books.");
//					System.out.println("2. All Issued Books for You.");
//					System.out.println("3. All Returned Books By you.");
//					System.out.println("4. Exit.");					
//					System.out.println("************************************");
//					System.out.println("Please Choose an Option:  ");
//					int option = sc.nextInt();
//					System.out.println("************************************");
////				
//					switch (option) {
//					case 1:
//						List<AdminPojo> everyBook;
//						try {
//							everyBook = adminService.getAllBooks();
//
//						} catch (EmptyCatelogException e) {
//							System.out.println(e.getMessage());
//							break;
//						} catch (SystemException e) {
//							System.out.println(e.getMessage());
//							break;
//						}
//
//						System.out.println("************************************");
//						System.out.println("Book Id\t Book ISBN\t Book Name\t Book Publisher\t Book Quantity");
//						System.out.println("************************************");
//						everyBook.forEach((item) -> System.out.println(item.getBookId() + "\t" + item.getBookIsbn() + "\t"
//								+ item.getBookName() + "\t" + item.getBookPublisher() + "\t" + item.getBookQuantity()));
//						System.out.println("************************************");
//						System.out.println("Do you want to continue?(y/n)");
//						process = scan.next().charAt(0);
//						break;
//						
//					case 2:
//						
//						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//						System.out.println("Isue books");
//						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//						List<AdminPojo> everyBook1 = null;
//						try {
//							everyBook = adminService.getAllBooks();
//
//						} catch (EmptyCatelogException e) {
//							System.out.println(e.getMessage());
//							break;
//						} catch (SystemException e) {
//							System.out.println(e.getMessage());
//							break;
//						}
//
//						System.out.println("************************************");
//						System.out.println("Book Id\t Book ISBN\t Book Name\t Book Publisher\t Book Quantity");
//						System.out.println("************************************");
//						everyBook1.forEach((item) -> System.out.println(item.getBookId() + "\t" + item.getBookIsbn() + "\t"
//								+ item.getBookName() + "\t" + item.getBookPublisher() + "\t" + item.getBookQuantity()));
//						System.out.println("************************************");
//						System.out.println("Do you want to continue?(y/n)");
//						process = scan.next().charAt(0);
//						break;
//						
//						//break;
//					case 3:
//						System.out.println("retur boooks");
//						break;
//						
//					case 4:
//						System.out.println("***********************");
//						System.out.println("Thank you for using Library Management function");
//						System.out.println("************************");
//						System.exit(0);
//						default :
//							
//					}
//				break;
//				
//				}}else {
//					System.out.println("######################################");
//					System.out.println("************************************");
//					System.out.println("Please try again later.");
//				}
//				
//				System.out.println("######################################");
//				System.out.println("************************************");
//				System.out.println("Do you want to continue?(y/n)");
//				process = scan.next().charAt(0);
//			case 2:
//				break;
//				
//			case 3:
//				System.out.println("************************************");
//				System.out.println("Thank you. See you again!!!!");
//				
//				break;
//		}
//
//	}
//
//	}
//	}
