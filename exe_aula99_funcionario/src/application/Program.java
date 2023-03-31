package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		Integer id = 0;

		System.out.print("Quantos funcionários serão cadastrados?: ");
		Integer n = leitor.nextInt();
		leitor.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("");
			System.out.printf("%d# Funcionário\n", i + 1);

			System.out.print("Digite o id do funcionário: ");
			id = leitor.nextInt();
			leitor.nextLine();

			while (hasId(list, id) != null) {
				System.out.print("Id inválido, tente novamente!\n");
				System.out.print("Digite o id do funcionário: ");
				id = leitor.nextInt();
				leitor.nextLine();
			}
			
			System.out.print("Digite o nome do funcionário: ");
			String name = leitor.nextLine();

			System.out.print("Digite o salário do funcionário: ");
			Double salary = leitor.nextDouble();
			
			Funcionario func = new Funcionario(id, name, salary);
			
			list.add(func);

//			list.add(new Funcionario(id, name, salary));
			
		}
		
		System.out.println("");
		System.out.print("Digite o id do funcionário que receberá um aumento: ");
		Integer idAumento = leitor.nextInt();
		
		Integer pos = hasId(list, idAumento);
		if (pos != null) {
			System.out.print("Qual a porcentagem que será acrescentada?: ");
			Double porcentagem = leitor.nextDouble();
			
			list.get(pos).aumentarSalario(porcentagem);
		} else {
			System.out.println("Número de Id não identificado!");
		}

//			Funcionario func = list.stream().filter(x -> x.getId() == id)
//					.findFirst().orElse(null);	

		for(Funcionario obj : list){
			System.out.printf("%d, %s, %.2f\n", obj.getId(), obj.getName(), obj.getSalary());
		}
		
		leitor.close();

}


	public static Integer hasId(List<Funcionario> list, Integer id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
