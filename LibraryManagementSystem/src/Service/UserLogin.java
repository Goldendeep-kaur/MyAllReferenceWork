package Service;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName;
		String userPassword;
		
		userName="xyz";
		userPassword="Xyz12@";
		Scanner userInput1= new Scanner(System.in);
		System.out.println("**********************************************");
		System.out.println("Please Enter Your User Name Here:");
		String uName= userInput1.next();
		System.out.println("");
		System.out.println("**********************************************");
		Scanner userInput2= new Scanner(System.in);
		System.out.println("Enter Your Valid Password:");
		String uPassword= userInput2.next();
		System.out.println("");
		System.out.println("**********************************************");
		if(uName.equals(userName)&& uPassword.equals(userPassword)) {
			System.out.println("You Are Successfully LogIn.\t Please Enjoy Our Services!!");
		}
		else if(uName.equals("")) {
			System.out.println("Enter Valid User Name To Login Here:");
		}
		else if(uPassword.equals("")) {
			System.out.println("Enter Valid Password For Success:");
		}
		else if(uName.equals(userName)) {
			System.out.println("Invalid Password!");
		}
		else if (uPassword.equals(userPassword)) {
			System.out.println("Invalid User Name!");
		}
		else {
			System.out.println("Invalid UserName and Password.");
		}
		
		

	}

}
