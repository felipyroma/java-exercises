package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá, mundo!");
		/*
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		
		System.out.println(
				String.format("%.2f", x));
		
		System.out.println(
				String.format("%.4f", x));
		
		/* configura o local para US, ou o separador será . 
		Locale.setDefault(Locale.US);
		
		System.out.println(
		
		
		
				String.format("%.4f", x));
		*/
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais"
				, nome, idade, renda);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		/*
		 * x = leitor.next().charAt(0);
		 */
		
		
		// objetos e classes podem ser chamadas e dps instanciadas
		Scanner n, s;
		s = new Scanner(System.in);
		n = new Scanner(System.in);
		
		
		s.close();
		n.close();
		


	}

}
