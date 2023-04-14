package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> emp = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				emp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.println();
			System.out.println("Enter salary: ");
			Double salary = sc.nextDouble();
			
			System.out.println("Email of people whose salary is more than 2000.00: ");
			
			List<String> emails = emp.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail()).sorted()
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			System.out.println();

			
			System.out.println("Sum of salary of people whose name strats wuth 'M': ");
			
			Double sum = emp.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println(sum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
