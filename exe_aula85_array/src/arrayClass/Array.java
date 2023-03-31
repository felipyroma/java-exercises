package arrayClass;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Boolean pass = false;
		Integer n = 0;
		
		while (!pass) {
			System.out.println("Quantos alunos serão digitados? (max: 10)");
			n = leitor.nextInt();
			
			if(n > 10) {
				pass = false;
			} else {
				pass = true;
			}
		}
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("\nDigite o nome da pessoa: ");
			String name = leitor.next();
			
			System.out.println("Digite a primeira nota da pessoa: ");
			Double n1  = leitor.nextDouble();
			
			System.out.println("Digite a primeira segunda da pessoa: ");
			Double n2  = leitor.nextDouble();
			
			pessoa[i] = new Pessoa(name, n1, n2);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < pessoa.length; i++) {
			Double avg = pessoa[i].avaliar();
			
			if (avg > 6) {
				System.out.println(pessoa[i].getName());
			}
		}
		
		leitor.close();
	}
}
