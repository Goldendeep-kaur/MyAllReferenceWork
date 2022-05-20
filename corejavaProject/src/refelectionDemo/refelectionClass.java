package refelectionDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class refelectionClass {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	
			System.out.println("Please enter the class which you want to introspect");
			String className= scan.nextLine();
		
		try {
			Class userFile= Class.forName(className);
			Constructor[] userFileCons= userFile.getConstructors();
			for(Constructor eachConstructor: userFileCons) {
				//eachConstructor.getName();
				System.out.println(eachConstructor.getName());
			}
			System.out.println("------------------");
			Method[] myMethod=userFile.getMethods();
			for(Method eachMethodFun:myMethod) {
				System.out.println( eachMethodFun);
			}
			
			Method[] declareMyMethods=userFile.getDeclaredMethods();
			for(Method eachdeclareMethod:declareMyMethods){
				System.out.println(eachdeclareMethod);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
