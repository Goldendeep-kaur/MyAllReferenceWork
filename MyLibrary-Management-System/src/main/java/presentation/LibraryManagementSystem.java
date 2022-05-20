package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.ReturnedBooksPojo;
import Pojo.IssuBooksPojo;
import Pojo.AdminViewPojo;
import Pojo.BooksPojo;
import Pojo.UserPojoo;
import service.AdminViewService;
import service.AdminViewServiceImpl;
import service.BookService;
import service.BookServiceImpl;
import service.IssueBookService;
import service.IssueBooksServiceImpl;
import service.ReturnBookService;
import service.ReturnBookServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class LibraryManagementSystem {

	public static void main(String[] args) {

		UserService newUser = new UserServiceImpl();
		AdminViewService admService = new AdminViewServiceImpl();
		UserPojoo loginPojo1 = new UserPojoo();
		BookService newBookService = new BookServiceImpl();
		BooksPojo updateBookPojo = null;
		BookService newBookService1 = new BookServiceImpl();
		IssuBooksPojo borrowBookPojo = new IssuBooksPojo();
		IssueBookService issueBk = new IssueBooksServiceImpl();
		ReturnBookService retBookServ= new ReturnBookServiceImpl();
		Scanner scan = new Scanner(System.in);
		char proceed = 'y';
		while (proceed == 'y') {
			System.out.println("==============================================");
			System.out.println("== LIBRARY MANAGEMENT SYSTEM ==");
			System.out.println("==============================================");
			System.out.println("");
			System.out.println("1. Create Account/User!!");
			System.out.println("2. Login.");
			System.out.println("3. Exit.");
			System.out.println("==============================================");
			System.out.println("");
			System.out.println("==============================================");
			System.out.println("Please enter your choice :");
			int choice = scan.nextInt();
			System.out.println("==============================================");
			switch (choice) {
			case 1:
				UserPojoo newUserPojo1 = new UserPojoo();
				System.out.println("==============================================");
				System.out.println("");
				System.out.println("Please enter your First Name :");
				scan.nextLine();
				newUserPojo1.setUserFName(scan.nextLine());
				System.out.println("==============================================");
				System.out.println("Please enter your Last Name :");
				newUserPojo1.setUserLName(scan.nextLine());
				System.out.println("==============================================");
				System.out.println("Please Enter Username :");
				newUserPojo1.setUserName(scan.nextLine());
				System.out.println("==============================================");
				System.out.println("Please enter the password for username :");
				newUserPojo1.setPassword(scan.nextLine());
				System.out.println("==============================================");

				System.out.println("==============================================");
				System.out.println("Please enter User Type as : ");
				System.out.println("==============================================");
				System.out.println("1. Admin");
				System.out.println("2. User");
				System.out.println("==============================================");
				System.out.println(" Enter your Option :");
				int userOption = Integer.parseInt(scan.nextLine());
				System.out.println("==============================================");
				if (userOption == 1) {
					newUserPojo1.setUserType("Admin");
				} else if (userOption == 2) {
					newUserPojo1.setUserType("User");
				}

				UserPojoo newUserPojo2 = null;
				try {
					newUserPojo2 = newUser.addUser(newUserPojo1);
				} catch (SystemException e) {
					System.out.println("-------------------------------------");
					System.out.println("Sorry Your request cannot process at this time.");
					System.out.println("Please try again later");
					System.out.println("-------------------------------------");
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("Successful...");
				System.out.println("==============================================");
				System.out.println("user id :" + newUserPojo2.getUserId() + "\n  User First Name:"
						+ newUserPojo2.getUserFName() + "\n User Last Name:" + newUserPojo2.getUserLName()
						+ "\n Your Username: " + newUserPojo2.getUserName() + "\n Your Password:"
						+ newUserPojo2.getPassword() + "\n User Type :" + newUserPojo2.getUserType());
				System.out.println("==============================================");
				break;
			case 2:

				System.out.println("********************************");
				System.out.println("**  Login Portal  **");
				System.out.println("********************************");
				System.out.println("Enter your username :");
				scan.nextLine();
				System.out.println("********************************");
				loginPojo1.setUserName(scan.nextLine());
				System.out.println("Enter your password :");
				loginPojo1.setPassword(scan.nextLine());
				UserPojoo returnLoginUser = null;
				try {
					returnLoginUser = newUser.validateLogin(loginPojo1);
				} catch (SystemException e) {
					e.printStackTrace();
					System.out.println("-----------------------------------------------");
					System.out.println("Sorry Your request cannot process at this time.");
					System.out.println("Please try again later");
					System.out.println("-----------------------------------------------");
					System.out.println(e.getMessage());
					break;
				}

				String uType = returnLoginUser.getUserType();
				if (uType != null && uType.equals("Admin")) {
					System.out.println("==============================================");
					System.out.println("Admin Login Successfully!!!!!!");
					System.out.println("*******************************************");
					System.out.println("******   Welcome Admin/ Librarian    ******");
					System.out.println("*******************************************");
					char opt = 'y';
					while (opt == 'y') {
						System.out.println("1. View All Users.");
						System.out.println("2. Add New Book.");
						System.out.println("3. Update Book.");
						System.out.println("4. Delete Book.");
						System.out.println("5. View All Books");
						System.out.println("6 Exit. ");
						System.out.println("==========================================");
						System.out.println("Please enter your option :");
						int AdminOpt = scan.nextInt();
						System.out.println("==========================================");
						switch (AdminOpt) {
						case 1:
							List<AdminViewPojo> person1;
							try {
								person1 = admService.getAllUsers();
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}
							System.out.println("==============================================");
							System.out.println(
									"User Id\tUser Frist Name\t User Last Name\tUser Name\tPassword\t User Type");
							System.out.println("==============================================");
							person1.forEach(
									(person) -> System.out.println(person.getUserId() + "\t" + person.getUserFName()
											+ "\t" + person.getUserLName() + "\t" + person.getUserLName() + "\t"
											+ person.getPassword() + "\t" + person.getUserType()));
							System.out.println("==============================================");
							break;

						case 2:

							BooksPojo newBookPojo = new BooksPojo();
							System.out.println("");
							System.out.println("==============================================");
							System.out.println("Enter new Book ISBN :");
							newBookPojo.setBookIsbn(scan.nextInt());
							System.out.println("==============================================");
							System.out.println("Enter book Name :");
							scan.nextLine();
							newBookPojo.setBookName(scan.nextLine());
							System.out.println("==============================================");
							System.out.println("Enter Publisher Name : ");
							newBookPojo.setBookPublisher(scan.nextLine());
							System.out.println("==============================================");
							System.out.println("Enter Quantity of Books :");
							newBookPojo.setBookQuantity(scan.nextInt());
							BooksPojo bookPojo = null;
							try {
								bookPojo = newBookService.addBook(newBookPojo);
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}
							System.out.println("===========================================");
							System.out.println("New Book Added Succesfully!!!\n Book Id is:" + bookPojo.getBookId());
							System.out.println("===========================================");
							break;

						case 3:
							System.out.println("==============================================");
							System.out.println("Please enter Book Id to be Updated :");
							int updateBookId = scan.nextInt();
							try {
								updateBookPojo = newBookService1.getABook(updateBookId);
							} catch (SystemException e2) {
								System.out.println(e2.getMessage());
								break;
							}
							if (updateBookPojo == null) {
								System.out.println("-------------------------");
								System.out.println("Book Id does not exist...");
								System.out.println("-------------------------");
								break;
							} else {
								System.out.println("============================");
								System.out.println("Book to be Updated>>>>>>");
								System.out.println("***********");
								System.out.println("Book Id :" + updateBookPojo.getBookId());
								System.out.println("Book ISBN :" + updateBookPojo.getBookIsbn());
								System.out.println("Book Name :" + updateBookPojo.getBookName());
								System.out.println("Book Publisher :" + updateBookPojo.getBookPublisher());
								System.out.println("Book Quantity :" + updateBookPojo.getBookQuantity());
								System.out.println("==============================================");
								System.out.println("Enter new Quantity of Books :");
								updateBookPojo.setBookQuantity(scan.nextInt());
								try {
									newBookService1.updateBook(updateBookPojo);
								} catch (SystemException e) {
									System.out.println(e.getMessage());
									break;
								}
								System.out.println("==============================================");
								System.out.println("Updated Successfully");
								System.out.println("==============================================");
							}

							break;

						case 4:
							System.out.println("Enter Book Id to remove :");
							int bookId = scan.nextInt();
							BooksPojo getBookPojo = null;
							try {
								System.out.println("i am in try");

								getBookPojo = newBookService.getABook(bookId);
							} catch (SystemException e1) {
								// TODO Auto-generated catch block
								System.out.println(e1.getMessage());
								break;
							}
							if (getBookPojo == null) {
								System.out.println("---------------------------------");
								System.out.println("Book Id does not exist. \n Please enter Valid Book Id!!");
								System.out.println("---------------------------------");
								break;
							} else {
								System.out.println("==============================================");
								System.out.println("Book to be removed....");
								System.out.println("==============================================");
								System.out.println("Book Id :" + getBookPojo.getBookId());
								System.out.println("Book ISBN :" + getBookPojo.getBookIsbn());
								System.out.println("Book Name :" + getBookPojo.getBookName());
								System.out.println("Book Publisher :" + getBookPojo.getBookPublisher());
								System.out.println("Book Quantity to Remove :" + getBookPojo.getBookQuantity());
								System.out.println("==============================================");
								System.out.println("Are you sure to remove this book?(y/n)");
								char reply = scan.next().charAt(0);
								if (reply == 'y') {
									try {
										newBookService.deleteBook(bookId);
									} catch (SystemException e) {
										System.out.println(e.getMessage());
										break;
									}
									System.out.println("Book removed from Library.....");
									System.out.println("==============================");
								} else {
									System.out.println(
											"There is some issue. \n This book can not removed now.\n Please try again later... ");
								}
								System.out.println("==============================================");
							}
							break;

						case 5:
							List<BooksPojo> everyBook = null;
							try {
								everyBook = newBookService.getAllBooks();
							} catch (EmptyCatelogException e) {
								System.out.println(e.getMessage());
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}
							System.out.println("==============================================");
							System.out.println("BOOK ID\tBOOK ISBN\tBOOK NAME\tBOOK PUBLISHER\tBOOK QUANTITY");
							System.out.println("==============================================");
							everyBook.forEach((book) -> System.out
									.println(book.getBookId() + "\t" + book.getBookIsbn() + "\t" + book.getBookName()
											+ "\t" + book.getBookPublisher() + "\t" + book.getBookQuantity()));
							System.out.println("==============================================");
							break;
						case 6:
							System.out.println("*************************************************");
							System.out.println("***  Thank you for being part of our system.  ***");
							System.out.println("*************************************************");
							System.exit(0);
							break;
						default:
							System.out.println("----------------------------------------");
							System.out.println("Please enter a valid option");
							continue;
						}

					}
				} else if (uType != null && uType.equals("User")) {

					System.out.println("===========================================");
					System.out.println("User Login Successfully!!!!!!");
					System.out.println("*******************************************");
					System.out.println("************   Welcome User    ************");
					System.out.println("*******************************************");
					char uOption = 'y';
					while (uOption == 'y') {
						System.out.println("1.View All Books.");
						System.out.println("2.Boorow Book");
						System.out.println("3. View All Issued Books.");
						System.out.println("4. All Returend Books by this user..");
						System.out.println("5.Return the Book");
						System.out.println("6. Exit");
						System.out.println("===========================================");
						System.out.println("Please enter your option :");
						int userOpt = scan.nextInt();
						System.out.println("===========================================");
						switch (userOpt) {
						case 1:
							List<BooksPojo> everyBook = null;
							try {
								everyBook = newBookService.getAllBooks();
							} catch (EmptyCatelogException e) {
								System.out.println(e.getMessage());
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}
							System.out.println("======================================================");
							System.out.println("BOOK ID\tBOOK ISBN\tBOOK NAME\tBOOK PUBLISHER\tBOOK QUANTITY");
							System.out.println("======================================================");
							everyBook.forEach((book) -> System.out
									.println(book.getBookId() + "\t" + book.getBookIsbn() + "\t" + book.getBookName()
											+ "\t" + book.getBookPublisher() + "\t" + book.getBookQuantity()));
							System.out.println("======================================================");

							break;
						case 2:

							System.out.println("Please enter Book Id:");
							scan.nextLine();
							borrowBookPojo.setBookId(scan.nextInt());
							System.out.println("Please enter your id here :");
							borrowBookPojo.setUserId(scan.nextInt());
							System.out.println("Please enter today's date(YYYY/MM/DD) :");
							scan.nextLine();
							borrowBookPojo.setIssuedDate(scan.nextLine());

							System.out.println("Enter how many days you need for that book(maximum 8 days):");
							borrowBookPojo.setTimePeriod(scan.nextInt());
							System.out.println("enter number of books you need :");
							borrowBookPojo.setBooksTotal(scan.nextInt());
							IssuBooksPojo newBorrowBook = null;
							try {
								newBorrowBook = issueBk.borrowBooks(borrowBookPojo);
							} catch (SystemException e1) {
								System.out.println(e1.getMessage());
							}
							System.out.println("-----------------------");
							System.out.println("New book addedd on your account!\n Issue Id :"
									+ newBorrowBook.getIssuedId() + "\n Book Id :" + newBorrowBook.getBookId());
							System.out.println("-----------------------");
							break;
						case 3:
							List<IssuBooksPojo> everyIssueBook = new ArrayList<IssuBooksPojo>();
							try {
								everyIssueBook = issueBk.getallIssueBooks(returnLoginUser.getUserId());
							} catch (EmptyCatelogException e) {
								System.out.println(e.getMessage());
							} catch (SystemException e) {
								System.out.println(e.getMessage());
							}
							System.out.println("----------------------------------");
							System.out.println(
									"ISSUE ID\t BOOK ID\t USER ID\tISSUE DATE\tTIME TO RETURN(DAYS)\tTotal Books");
							System.out.println("----------------------------------");
							everyIssueBook.forEach((iBook) -> System.out.println(iBook.getIssuedId() + "\t"
									+ iBook.getBookId() + "\t" + iBook.getUserId() + "\t" + iBook.getTimePeriod() + "\t"
									+ iBook.getIssuedDate() + "\t" + iBook.getBooksTotal()));
							System.out.println("----------------------------------");
							break;
						case 4:
							List<ReturnedBooksPojo> returnBooks=null;
							try {
								returnBooks=retBookServ.getAllReturnBooks(returnLoginUser.getUserId());
							} catch (EmptyCatelogException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								System.out.println(e.getMessage());
								break;
							} catch (SystemException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								System.out.println(e.getMessage());
								break;
							}
							System.out.println("----------------------------------");
							
							System.out.println("RETURN ID\tBOOK ID\t \tUSER ID\t\tRETURN DATE\t\t NUMBER OF BOOKS");
							returnBooks.forEach((books)->System.out.println(books.getReturnBookId()+"\t"+"\t"+books.getBookId1()+"\t"+"\t"+books.getUserId1()+"\t"+"\t"+books.getReturnDate()+"\t"+"\t"+books.getBooksTotal()));
							System.out.println("----------------------------------");
							break;
						case 5:
							System.out.println("----------------------------------");
							System.out.println("Enter Return id to return the book :");
							int returnBookId=scan.nextInt();
							ReturnedBooksPojo getbookPojo=null;
							try {
								getbookPojo= retBookServ.getAbook(returnBookId);
							} catch (SystemException e) {
								System.out.println(e.getMessage());
								break;
							}
							if(getbookPojo==null) {
								System.out.println("Book Id not Exist...");
								break;
							}else {
								System.out.println("----------------------------------");
								System.out.println("Book to return is :");
								System.out.println("Return id: "+getbookPojo.getReturnBookId());
								System.out.println("Book Id :"+getbookPojo.getBookId1());
								System.out.println("User Id :"+getbookPojo.getUserId1());
								System.out.println("Return Date:"+getbookPojo.getReturnDate());
								System.out.println("Number of books :"+getbookPojo.getBooksTotal());
								System.out.println("==================================");
								System.out.println("Are you ready to return books?(y/n) :");
								char answer= scan.next().charAt(0);
								if(answer=='y') {
									try {
										retBookServ.returnBooks(returnBookId);
									} catch (SystemException e) {
										System.out.println(e.getMessage());
										break;
									}
									System.out.println("----------------------------------");
									System.out.println("Book returned from your portal to library");
								}else {
									System.out.println("Book did not returened successfully......");
								}
							}
							
							break;
						case 6:
							System.out.println("*************************************************");
							System.out.println("***  Thank you for being part of our system.  ***");
							System.out.println("*************************************************");
							System.exit(0);
							break;
						default:
							System.out.println("*****************************************************");
							System.out.println("Please enter a valid option");
							continue;
						}
						
					}
				} else if (uType == null) {
					System.out.println("*************");
					System.out.println("Login Failed");
					System.out.println("**************");
					break;

				}
				break;
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
