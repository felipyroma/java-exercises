package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		cursos
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		Integer qtd;
		
		System.out.print("Quantos estudantes para o curso A?: ");
		qtd = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < qtd; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		
		System.out.print("Quantos estudantes para o curso B?: ");
		qtd = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < qtd; i++) {
			int number = sc.nextInt();
			b.add(number);
		}	
		
		System.out.print("Quantos estudantes para o curso C?: ");
		qtd = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < qtd; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		
		Set<Integer> ordering = new HashSet<>();
		ordering.addAll(a);
		ordering.addAll(b);
		ordering.addAll(c);
		
		System.out.print("Total de estudantes: " + ordering.size());
		
		
		sc.close();
	}
}
