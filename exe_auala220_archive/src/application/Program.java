package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();

		products.add(new Product("TV LED", 1290.99, 1));
		products.add(new Product("Video Game Chair", 350.50, 3));
		products.add(new Product("Iphone X", 900.00, 2));
		products.add(new Product("Samsung Galaxy", 850.00, 2));

		String createDirPath = "c:\\temp";

		boolean success = new File(createDirPath + "\\out").mkdir();
		System.out.println("Directory created sucessfully: " + success);

		String path = "c:\\temp\\out\\summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
 
			for (Product product : products) {
				bw.write(product.getName());
				bw.write(", ");
				bw.write(product.totalPrice().toString());
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
		
		sc.close();

	}
}
