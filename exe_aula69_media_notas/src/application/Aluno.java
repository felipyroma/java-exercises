package application;

public class Aluno {
	String nome;
	Double n1;
	Double n2;
	Double n3;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public void avaliar(Double n1, Double n2, Double n3){
		Double notaFinal = (n1 + n2 + n3) / 3;
		
		String mensagem = notaFinal > 6.0? "Aprovado" : "Reprovado";
		
		System.out.println(mensagem);
		
		System.out.printf("Sua nota final foi de: %.2f", notaFinal);
	}
}
