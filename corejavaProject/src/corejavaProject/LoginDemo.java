package corejavaProject;

import java.util.Scanner;

public class LoginDemo {
	static String fName;
	static String lName;
	static String userName;
	static String passWord;
	public static void maid(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter Your First Name: ");
		fName=scan.nextLine();
		System.out.println("Please Enter Your Last Name: ");
		lName=scan.nextLine();
		System.out.println("Please Enter Your User Name: ");
		userName=scan.nextLine();
		System.out.println("Please Enter Your Password: ");
		passWord=scan.nextLine();
		
	}

}
