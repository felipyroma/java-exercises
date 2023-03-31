package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
				
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d2 = LocalDate.parse("14/03/2023", fmt);
		System.out.println(d2);
		
		Instant d = Instant.parse("2022-07-20T01:30:26-01:00");
		System.out.println(d);
		
		System.out.println("Digite a quantidade de linhas: ");
		Integer l = leitor.nextInt();
		
		System.out.println("Digite a quantidade de colunas: ");
		Integer c = leitor.nextInt();
		
		Integer numbers[][] = new Integer[l][c];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Digite os números");
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] =  leitor.nextInt();
			}
		}
		
		System.out.println("Digite o número que deseja ver a posição: ");
		Integer x = leitor.nextInt();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == x) {
					System.out.println("Position: " + i + "," + j);
				}
			}
		}
		
		leitor.close();

	
	}
}
