package application;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantos números haverá na matriz?: ");
		Integer n = leitor.nextInt();
		
		Integer[][] matriz = new Integer[n][n];
		Integer negative = 0;
		
		for(int i = 0; i < matriz.length; i++) {
//			linhas
			System.out.println("---------------------");
			for(int j = 0; j < matriz[i].length; j++) {
				// colunas
				matriz[i][j] = leitor.nextInt();
				
				if(matriz[i][j] < 0) {
					negative++;
				}
			}
		}
		
		
		for(int i = 0; i < matriz.length; i++) {
//			linhas
			System.out.println("-------------------");
			System.out.printf("Linha %d\n", i);
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println("\nNúmeros negativos: " + negative);
		
		
		leitor.close();
		
	}
}
