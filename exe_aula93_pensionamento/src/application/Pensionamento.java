package application;

import java.util.Scanner;

import entities.Rent;

public class Pensionamento {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		Rent[] rent = new Rent[10];

		System.out.println("Quantas pessoas deseja cadastrar?");
		Integer n = leitor.nextInt();
		leitor.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome da pessoa: ");
			String name = leitor.nextLine();

			System.out.println("Digite o email da pessoa: ");
			String email = leitor.nextLine();

			System.out.println("Qual número de quarto deseja alugar?: ");
			Integer roomNumber = leitor.nextInt();
			leitor.nextLine();

			if (rent[roomNumber] != null) {
				System.out.println("Este quarto está ocupado!");
			} else {
				rent[roomNumber] = new Rent(name, email);
			}

		}

		System.out.println("Quartos ocupados:");

		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.printf("%d: %s, %s \n", i, rent[i].getName(), rent[i].getEmail());
			}
		}

//		for (Rent obj : rent) {
//			if (obj != null) {
//				System.out.printf("%s, %s \n", 
//						obj.getName(), obj.getEmail());
//			}
//		}

		leitor.close();

	}
}
