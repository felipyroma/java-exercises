package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class CadastroConta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria cc1;
		
		System.out.println("Digite o número da sua conta: ");
		Integer numberAccount = sc.nextInt();
		
		System.out.println("Digite o seu nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Existe um depósito inicial? (s/n)");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.println("Digite o valor inicial: ");
			Double inicialDeposite = sc.nextDouble();
			
			cc1 = new ContaBancaria(numberAccount, name, inicialDeposite);
		} else {
			cc1 = new ContaBancaria(numberAccount, name);
		}
		
		
		System.out.printf(""
				+ "Conta %d. Olá, %s! O seu saldo em conta é de: %.2f \n",
				cc1.getNumberAccount(), cc1.getName(), cc1.getSaldo());
		
		System.out.print("Digite o valor do saque: \n");
		Double saque = sc.nextDouble();
		cc1.sacar(saque);
		
		System.out.println("Saldo atual: " + cc1.getSaldo());
		
		System.out.println("Digite o valor do depósito: ");
		Double deposito = sc.nextDouble();
		cc1.depositar(deposito);
		
		System.out.println("Saldo atual: " + cc1.getSaldo());
		
		cc1.setName("Miguel");
		

		
		sc.close();
		
	}
}
