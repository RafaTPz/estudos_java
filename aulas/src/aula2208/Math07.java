package aula2208;

public class Math07 {

	public static void main(String[] args) {
		String[] alunos = {"Eduardo","Jorge","Cleiton","Pedro","Furgeri","Beatriz","Larissa"};
		int qtde = alunos.length;
		
		int n = (int)(Math.random()*qtde);
		System.out.println(alunos[n]);
	}

}
