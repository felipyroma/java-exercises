package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {
	public static void main(String[] args) throws DomainException {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			acc.withdraw(amount);
			
			System.out.println("New balance: " + acc.getBalance());
			
			sc.close();
		}
		catch (DomainException e){
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
