package Presentation;

import java.util.Scanner;

import Service.LoginService;
import Service.LoginServiceImpl;

public class LMSystemMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		LoginService loginService=new LoginServiceImpl();
		System.out.println("*****************************************************");
		System.out.println("LIBRARY MANAGEMENT SYSTEM!!");
		System.out.println("");
		System.out.println("*****************************************************");
		System.out.println("1: Librarian/ Admin.");
		System.out.println("2: User/Admin.");
		System.out.println("3: Exit.");
		System.out.println("Select an appropriate option:");
		System.out.println("");
		//System.out.println("*****************************************************");
		int option=scan.nextInt();
		System.out.println("");
		System.out.println("*****************************************************");
		switch(option) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println("");
			System.out.println("*****************************************************");
			System.out.println("");
			System.out.println("Thank You for using Library Management System.See You Again!!");
			System.out.println("*****************************************************");
		default:
		}
		
	}

}
