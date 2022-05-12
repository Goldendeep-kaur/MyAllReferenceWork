package Service;

import java.util.Scanner;

import model.LibraryPojo;

public class FaciltyMemberLogin implements LoginService  {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);

		String facultyUsername;
	    String facultyPassword;

	    facultyUsername = "Admin";
	    facultyPassword = "Admin123";

	    Scanner facultyInput1 = new Scanner(System.in);
	    System.out.println("**************************************");
	    System.out.println("Enter Username : ");
	    String facultyName =  facultyInput1.next();
	    System.out.println("");
	    System.out.println("**************************************");
	    Scanner facultyInput2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    String facultyUPassword = facultyInput2.next();
	    System.out.println("");
	    System.out.println("**************************************");
	    if (facultyName.equals(facultyUsername) && facultyUPassword.equals(facultyPassword)) {

	        System.out.println("You Are Successfully LogIn! Welcome!");
	    }
	    else if(facultyName.equals("")) {
	    	System.out.println("Enter Valid User Name:");
	    }

	    else if(facultyUPassword.equals("")) {
	    	System.out.println("Please enter Valid Password:");
	    }
	    else if (facultyName.equals(facultyUsername)) {
	        System.out.println("Invalid Password!");
	    } else if (facultyUPassword.equals(facultyPassword)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!");
	    }

	}

	@Override
	public LibraryPojo adminLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibraryPojo userLogin() {
		// TODO Auto-generated method stub
		return null;
	}


	}


