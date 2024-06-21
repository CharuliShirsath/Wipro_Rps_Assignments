package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class Jdbc_Practice {

public static void main(String[] args) throws Exception {
	Product1 dao = new Product1();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter option: 1. Add Product 2. Update Product 3. Delete Product 4.List Products");
	int option = sc.nextInt();
	
	switch(option) {
		case 1:
			System.out.println("Enter product details (id, name, price):");
			int id = sc.nextInt(); sc.nextLine();
			String name = sc.nextLine();
			int price = sc.nextInt();
			dao.addProduct(id, name, price);
		break;
		case 2:
			System.out.println("Enter product id to update:");
			id = sc.nextInt(); sc.nextLine();
			System.out.println("Enter new name:");
			name = sc.nextLine();
			System.out.println("Enter new price:");
			price = sc.nextInt();
			dao.updateProduct(id, name, price);
		break;
		case 3:
			System.out.println("Enter product id to delete:");
			id = sc.nextInt();
			dao.deleteProduct(id);
		break;
		case 4:
			List<String> products = dao.listProducts();
			for(String product : products) {
				System.out.println(product);
			}
		break;
		
		default:
			System.out.println("Invalid option");
			break;
		}
	sc.close();

}
		
}
	
