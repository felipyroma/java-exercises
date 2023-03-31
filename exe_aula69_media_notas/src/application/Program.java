package application;

public class Program {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("rodrigo");
		
		aluno.n1 = 8.0;
		aluno.n2 = 9.0;
		aluno.n3 = 6.0;	
		
		aluno.avaliar(aluno.n1, aluno.n2, aluno.n3);
	
	}
}

