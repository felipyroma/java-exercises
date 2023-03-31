package application;

import java.util.Scanner;

public class Negative {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Boolean pass = false;
		Integer n = 0;
		
		while (!pass) {
			System.out.println("Quantos números você irá digitar? (max: 10)");
			n = leitor.nextInt();
			
			if(n > 10) {
				pass = false;
			} else {
				pass = true;
			}
		}
	
		
		Integer[] number = new Integer[n];
		
		for(int i = 0; i < number.length; i++) {
			System.out.println("Digite um número: ");
			number[i] = leitor.nextInt();
		}
		
		System.out.println("Numeros negativos:");
		
		for(int i = 0; i < number.length ;i++) {
			if(number[i] < 0) {
				System.out.println(number[i]);
			}
		}
		
		leitor.close();
		
	}
}
