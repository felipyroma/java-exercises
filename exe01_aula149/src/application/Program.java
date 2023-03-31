package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entitites.Department;
import entitites.HourContract;
import entitites.Worker;
import entitites.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner leitor = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = leitor.nextLine();
		
		System.out.println("Enter worker's data: ");
		
		System.out.print("Name: ");
		String name = leitor.nextLine();
		
		System.out.print("Level: ");
		String status = leitor.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary = leitor.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(status), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker?");
		Integer contractNumber = leitor.nextInt();
		
		for (int i = 0; i < contractNumber; i++) {
			System.out.println("Enter contract #" + i + 1 + " data");
			
			System.out.print("Date (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(leitor.next());
			
			System.out.print("Value per hour: ");
			Double vph = leitor.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hours = leitor.nextInt();
			
			HourContract hourContract = new HourContract(contractDate, vph, hours);
			
			worker.addContract(hourContract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/yyyy) ");
		String dateIncome = leitor.next();
		
		int month = Integer.parseInt(dateIncome.substring(0, 2));
		System.out.println(month);
		
		int year = Integer.parseInt(dateIncome.substring(3));
		System.out.println(year);
		
		System.out.print("Name: " + worker.getName());
		System.out.print("\nDepartment: " + worker.getDepartment().getName());
		System.out.print("\nIncome for " + dateIncome + ": " + String.format(" %.2f", worker.income(year, month)));
		
		leitor.close();
	}
}
