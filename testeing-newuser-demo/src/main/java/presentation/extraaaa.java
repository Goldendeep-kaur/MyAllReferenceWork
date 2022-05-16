//package presentation;
//
//public class extraaaa {
//	package presentation;
//
//	import java.util.List;
//	import java.util.Scanner;
//
//	import exception.EmptyCatelogException;
//	import exception.SystemException;
//	import model.AdminPojo;
//	import model.NewUserPojo;
//	//import model.NewUserPojo;
//	import service.AdminService;
//	import service.AdminServiceImpl;
//	//import service.CreateServiceImpl;
//	//import service.CreateUserService;
//	import service.CreateServiceImpl;
//	import service.CreateUserService;
//
//	public class AdminMain {
//
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			
//			/***************************************************************************************/
//			
//			CreateUserService newUserService = new CreateServiceImpl();
//			//Scanner scan= new Scanner(System.in);
//			CreateUserService  createUerService= new CreateServiceImpl();
//			char process='y';
//			while(process=='y') {
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				System.out.println("");
//				System.out.println("LIBRARY MANAGEMENT SYSTEM");
//				System.out.println("");
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				System.out.println("");
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				System.out.println("");
//				System.out.println("CREATE or LOGIN process");
//				System.out.println("");
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				
//				System.out.println("1. Create Account/User!!");
//				System.out.println("2. Login.");
//				System.out.println("3. Exit.");
//				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//				System.out.println("");
//				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//				System.out.println("Please enter your choice :");
//				int choice= scan.nextInt();
//				switch(choice) {
//				case 1:
//					char sucess='y';
//					if(sucess=='y')
//					{
//					NewUserPojo newUserPojo1= new NewUserPojo();
//					System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//					System.out.println("");
//					System.out.println("Please enter your First Name :");
//					scan.nextLine();
//					newUserPojo1.setUserFName(scan.nextLine());
//					System.out.println("************************************");
//					System.out.println("Please enter your Last Name :");
//					newUserPojo1.setUserLName(scan.nextLine());
//					System.out.println("*************************************");
//					System.out.println("Please Enter Username :");
//					newUserPojo1.setUserName(scan.nextLine());
//					System.out.println("**************************************");
//					System.out.println("Please enter the password for username :");
//					newUserPojo1.setPassword(scan.nextLine());
//					System.out.println("***************************************");
//					System.out.println("Please enter User Type as (only 2 as this is only for users) : ");
//					newUserPojo1.setUserType(scan.nextInt());
//					System.out.println("************************************");
//					
//					AdminService adminService = new AdminServiceImpl();
//					
//					NewUserPojo newUserPojo=null;
//					try {
//					newUserPojo= newUserService.addUser(newUserPojo1);
//				}catch(SystemException e){
//					System.out.println(e.getMessage());
//					break;
//				}
//					System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//					System.out.println("Successfull!!!!!");
//					System.out.println("######################################");
//					
//					if(sucess=='y') {
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
//					}
//					
//
//					char proceed = 'y';
//					while (proceed == 'y') {
//						System.out.println("iam here!!!!");
//						System.out.println("************************************");
//						System.out.println("");
//						System.out.println("Library Management System");
//						System.out.println("");
//						System.out.println("************************************");
//						System.out.println("1. View All Books.");
//						System.out.println("2. View my All Issued Books .");
//						System.out.println("3. View All Returned Books.");					
//						System.out.println("4. Exit");
//						System.out.println("************************************");
//						System.out.println("Please Choose an Option:  ");
//						int option = scan.nextInt();
//						System.out.println("************************************");
////					System.out.println("************************************");
////					System.out.println("Do you want to continue?(y/n)");
////					process = scan.next().charAt(0);
//					
//					break;
//					
//					}
//					
//					}else {
//						System.out.println("######################################");
//						System.out.println("************************************");
//						System.out.println("Please try again later.");
//					}
//					
//					System.out.println("######################################");
//					System.out.println("************************************");
//					System.out.println("Do you want to continue?(y/n)");
//					process = scan.next().charAt(0);
//				case 2:
//					break;
//					
//				case 3:
//					System.out.println("************************************");
//					System.out.println("Thaank you. See you again!!!!");
//					
//					break;
//					
//				case 4:
//					System.out.println("***********************");
//					System.out.println("Thank you for using Library Management function");
//					System.out.println("************************");
//					System.exit(0);
//					default:
//			}
//
//				System.out.println("***********************");
//				System.out.println("Thank you for using Library Management function");
//				System.out.println("************************");
//				System.exit(0);
//			/***************************************************************************************/
//			
//	//	
//			AdminService adminService = new AdminServiceImpl();
//
//			char proceed = 'y';
//			while (proceed == 'y') {
//				System.out.println("************************************");
//				System.out.println("");
//				System.out.println("Library Management System");
//				System.out.println("");
//				System.out.println("************************************");
//				System.out.println("1. View All Books.");
//				System.out.println("2. Add New Book To The System.");
//
//				System.out.println("3. Delete a Book From System");
//				System.out.println("4. Update a Book Details.");
//				System.out.println("5. Exit");
//				System.out.println("************************************");
//				System.out.println("Please Choose an Option:  ");
//				int option = scan.nextInt();
//				System.out.println("************************************");
//				switch (option) {
//				case 1:
//					List<AdminPojo> everyBook;
//					try {
//						everyBook = adminService.getAllBooks();
//
//					} catch (EmptyCatelogException e) {
//						System.out.println(e.getMessage());
//						break;
//					} catch (SystemException e) {
//						System.out.println(e.getMessage());
//						break;
//					}
//
//					System.out.println("************************************");
//					System.out.println("Book Id\t Book ISBN\t Book Name\t Book Publisher\t Book Quantity");
//					System.out.println("************************************");
//					everyBook.forEach((item) -> System.out.println(item.getBookId() + "\t" + item.getBookIsbn() + "\t"
//							+ item.getBookName() + "\t" + item.getBookPublisher() + "\t" + item.getBookQuantity()));
//					System.out.println("************************************");
//					System.out.println("Do you want to continue?(y/n)");
//					proceed = scan.next().charAt(0);
//					break;
//
//				case 2:
//					AdminPojo newAdminPojo = new AdminPojo();
//					System.out.println("Please enter new Book ISBN(numeric only):");
//					scan.nextLine();
//					newAdminPojo.setBookIsbn(scan.nextInt());
//					scan.nextLine();
//					System.out.println("Please enter new Book Name:");
//					// scan.nextLine();
//					newAdminPojo.setBookName(scan.nextLine());
//					System.out.println("Please enter Publisher Name of new Book:");
//					newAdminPojo.setBookPublisher(scan.nextLine());
//					System.out.println("Please enter Quantity of books :");
//					newAdminPojo.setBookQuantity(scan.nextInt());
//					AdminPojo adminPojo = null;
//					try {
//
//						adminPojo = adminService.addBook(newAdminPojo);
//					} catch (SystemException e) {
//						System.out.println(e.getMessage());
//						break;
//					}
//					System.out.println("**************************");
//					System.out.println("New Book added successfully !\n Book Id id :" + adminPojo.getBookId());
//					System.out.println("***************************");
//					System.out.println("************************************");
//					System.out.println("Do you want to continue?(y/n)");
//					proceed = scan.next().charAt(0);
//					break;
//
//				case 3:
//					System.out.println("Please enter Book Id to be Removed from Catelog :");
//					int bookId = scan.nextInt();
//					AdminPojo getAdminPojo = null;
//					try {
//						getAdminPojo = adminService.getABook(bookId);
//					} catch (SystemException e1) {
//
//						System.out.println(e1.getMessage());
//						break;
//					}
//					if (getAdminPojo == null) {
//						System.out.println("*********************");
//						System.out.println("Book Id Does not Exist. Please enter a valid ID");
//						System.out.println("***********************");
//
//					}
//
//					else {
//						System.out.println("*******************");
//						System.out.println("Book to be removed....");
//						System.out.println("Book ID :" + getAdminPojo.getBookId());
//						System.out.println("Book ISBN:" + getAdminPojo.getBookIsbn());
//						System.out.println("Book Name:" + getAdminPojo.getBookName());
//						System.out.println("Publisher Name:" + getAdminPojo.getBookPublisher());
//						System.out.println("Quantity :" + getAdminPojo.getBookQuantity());
//						System.out.println("***************************");
//						System.out.println("Are you sure you want to remove this book? (y/n)");
//						char answer = scan.next().charAt(0);
//						System.out.println("*********************");
//						if (answer == 'y') {
//							try {
//								adminService.deleteBook(bookId);
//							} catch (SystemException e) {
//								System.out.println(e.getMessage());
//								break;
//							}
//							System.out.println("Book removed from Catelog");
//						} else {
//							System.out.println(("Book is not remevod from Catelog!"));
//						}
//
//						System.out.println(("***********************"));
//					}
//					System.out.println("************************************");
//					System.out.println("Do you want to continue?(y/n)");
//					proceed = scan.next().charAt(0);
//					break;
//
//				case 4:
//					System.out.println("Please enter Book ID to be update:");
//					int updateBookId = scan.nextInt();
//					AdminPojo updateAdminPojo = null;
//					try {
//						updateAdminPojo = adminService.getABook(updateBookId);
//					} catch (SystemException e) {
//
//						System.out.println(e.getMessage());
//						break;
//					}
//
//					if (updateAdminPojo == null) {
//						System.out.println("*********************");
//						System.out.println("Book Id doen not exists.\n Please try with VALID id.");
//						System.out.println("***********************");
//						break;
//					} else {
//						System.out.println("********************");
//						System.out.println("Book to be updated....");
//						System.out.println("***************************");
//						System.out.println("Book Id :" + updateAdminPojo.getBookId());
//						System.out.println("Book ISBN :" + updateAdminPojo.getBookIsbn());
//						System.out.println("Book Name :" + updateAdminPojo.getBookName());
//						System.out.println("Book Publisher :" + updateAdminPojo.getBookPublisher());
//						System.out.println("Book Quantity :" + updateAdminPojo.getBookQuantity());
//						System.out.println("****************");
//
//						// only update ISBN
//						System.out.println("Please enter new quantity for book :");
//						updateAdminPojo.setBookQuantity(scan.nextInt());
//						try {
//							adminService.updateBook(updateAdminPojo);
//						} catch (SystemException e) {
//							System.out.println(e.getMessage());
//							break;
//						}
//						System.out.println("***********************");
//						System.out.println("Book Quantity updated Successfully");
//						System.out.println("************************");
//						System.out.println("************************************");
//						System.out.println("Do you want to continue?(y/n)");
//						proceed = scan.next().charAt(0);
//						break;
//					}
//				case 5:
//					System.out.println("***********************");
//					System.out.println("Thank you for using Library Management function");
//					System.out.println("************************");
//					System.exit(0);
//				default:
//				}
//			}
//			System.out.println("***********************");
//			System.out.println("Thank you for using Library Management function");
//			System.out.println("************************");
//			System.exit(0);
//
//		}
//		}}
//
//}
