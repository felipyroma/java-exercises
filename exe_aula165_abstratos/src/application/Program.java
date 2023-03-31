package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payer;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Payer> payer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		Integer numberPayers = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= numberPayers; i++) {
			System.out.println("Tax payer #" + i + " data");
			
			System.out.println("Individual or company? (i/c)");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			if (option == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Anual Incomes: ");
				Double anualIncomes = sc.nextDouble();
				
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				
				payer.add(new Individual(name, anualIncomes, healthExpenditures));

			} else if (option == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Anual Incomes: ");
				Double anualIncomes = sc.nextDouble();
				
				System.out.print("Number of employees: ");
				Integer employeesNumber = sc.nextInt();
				sc.nextLine();
				
				payer.add(new Company(name, anualIncomes, employeesNumber));
			}
		}
		
		System.out.println(" ");
		System.out.println("TAXES PAID");
		for (Payer obj : payer) {
			System.out.println(
					String.format("%s: $%.2f", obj.getName(), obj.taxPaid()));
		}
		
		Double sum = 0.0;
		for (Payer obj : payer) {
			sum += obj.taxPaid();
		}
		
		System.out.println(" ");
		System.out.println("Total taxes: $" + sum);
		
		sc.close();
	}
}
