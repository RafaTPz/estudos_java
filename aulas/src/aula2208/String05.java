package aula2208;

public class String05 {

	public static void main(String[] args) {
		String ra = "1050482423017";
		String unidade = ra.substring(0,3);
		String curso = ra.substring(3,6);
		String ano = "20"+ra.substring(6,8);
		String semestre = (ra.substring(8,9).equals("1") ? "Primeiro " : "Segundo ")+"semestre";
		System.out.println(ra);
		System.out.println(unidade);
		System.out.println(curso);
		System.out.println(ano);
		System.out.println(semestre);
	}

}
