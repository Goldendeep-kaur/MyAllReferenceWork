package presentation;

import java.util.Scanner;

import exception.SystemException;
import model.AdminViewPojo;
import model.UserPojoo;
import service.AdminViewService;
import service.AdminViewServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class logintest {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		UserService userServe= new UserServiceImpl();
		AdminViewService admServ= new AdminViewServiceImpl();
		
		
		UserPojoo loginuser= new UserPojoo();
		
		System.out.println("enter username :");
		loginuser.setUserName(scan.nextLine());
		System.out.println("Enter password :");
		loginuser.setPassword(scan.nextLine());
		
		//UserPojoo returnlogin= null;
		UserPojoo returnlogin=null;
		try {
			returnlogin = userServe.validateLogin(loginuser);
			System.out.println("value="+returnlogin);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String uType= returnlogin.getUserType();
		System.out.println("uType="+uType);
		if(uType!=null && uType.equals("Admin")) {
			System.out.println("*************");
			System.out.println("Admin Login Successfully!!!!!!");
			char opt='y';
			while(opt=='y') {
				System.out.println("*******************************************");
				System.out.println("Welcome To Login Window");
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("1. View All Users.");
				System.out.println("2. Add New Book.");
				System.out.println("3. Update Book.");
		}

	}else if(uType!=null && uType.equals("User")) {
		
		System.out.println("user window");
		System.out.println("1. View all books.");
		System.out.println("2 View isuue books");
	}else if(uType==null) {
		System.out.println("LoginFailed");
	}
	}

}
