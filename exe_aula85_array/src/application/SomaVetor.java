package application;

import java.util.Scanner;

public class SomaVetor {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	Boolean pass = false;
	Integer n = 0;
	Double sum = 0.0;
	
	while (!pass) {
		System.out.println("Digite quantos número você irá digitar "
				+ "(max: 10):");
		n = leitor.nextInt();
		
		if (n > 10) {
			pass = false;
		} else {
			pass = true;
		}
	}
	
	Double[] number = new Double[n];
	
	for(int i = 0; i < number.length; i++) {
		System.out.println("Digite um número: ");
		number[i] = leitor.nextDouble();
		
		System.out.printf("%.1f ", number[i]);
		
		sum += number[i];
	}
	
	System.out.printf("Soma: %.1f \n", sum);
	Double avg = sum / number.length; 
	System.out.printf("Média: %.1f \n", avg);
	
	leitor.close();
}
}
