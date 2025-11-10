package aula2609encapsulamento;

public class UsaAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Pedro Denny Re";
		a.ra = "10519012901";
		a.idade = 19;
		
		System.out.println(Aluno.gravar(a));
	}

}
