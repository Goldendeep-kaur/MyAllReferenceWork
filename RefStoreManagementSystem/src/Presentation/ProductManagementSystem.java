package Presentation;

import java.util.List;
import java.util.Scanner;

import Model.ProductPojo;
import Service.ProductService;
import Service.ProductServiceImpl;

public class ProductManagementSystem {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		ProductService productService= new ProductServiceImpl();
		char proceed ='y';
		while(proceed=='y') {
			System.out.println("*************************************************");
			System.out.println("Product Management System");
			System.out.println("*************************************************");
			System.out.println("1. List of all Product.");
			System.out.println("2. Add a New Product.");
			System.out.println("3. Update a Product.");
			System.out.println("4. Delete a Product.");
			System.out.println("5. Exit!!");
			System.out.println("*************************************************");
			System.out.println("Please enter an Option.");
			int option= scan.nextInt();
			System.out.println("*************************************************");
			switch(option) {
			case 1: 
				List<ProductPojo> everyProduct= productService.getAllProducts();
				System.out.println("**************************************************************************");
				System.out.println("ID\t\tNAME\t\tDESCRIPTION\t\tCOST");
				System.out.println("**************************************************************************");
				everyProduct.forEach((item)->System.out.println(item.getProductId()+"\t"+"\t"+item.getProductName()+"\t"+"\t"+item.getProductDescription()+"\t"+"\t\t"+item.getProductCost()));
				System.out.println("***************************************************************************");
				System.out.println("Do You Want To Contonue?");
				proceed= scan.next().charAt(0);
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("***************************************************************************");
				System.out.println("Thank you For using Product Management System!! ");
				System.out.println("***************************************************************************");
				System.out.println(0);
				default:
			}
		}
		System.out.println("***************************************************************************");
		System.out.println("Thank you For using Product Management System!! ");
		System.out.println("***************************************************************************");
		//System.out.println(0);

	}

}
