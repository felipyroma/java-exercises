package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		Integer numberProducts = sc.nextInt();
		
		for (int i = 1; i <= numberProducts; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported? (c/u/i)");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			if (type == 'i') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
				
			} else if (type == 'c') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				
				products.add(new Product(name, price));
				
			} else if(type == 'u') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				
				System.out.println("Price: ");
				Double price = sc.nextDouble();
				
				System.out.println("Manufactured date (dd/MM/yyyy): ");
				Date manufacturedDate = sdf.parse(sc.next());

				products.add(new UsedProduct(name, price, manufacturedDate));
			}
		}
		
		System.out.println("PRICE TAGS");
		for (Product obj : products) {
			System.out.println(obj.priceTag());
		}
		
		sc.close();
	}
}
