package aula2208;

public class String06 {

	public static void main(String[] args) {
		String s = "Programação Orientada a Objetos", n = "1,2,3,4,5,6,7,8,9,0";

		String[] palavras = s.split(" "), numeros = n.split(",");
		for(String x:palavras) {

			System.out.println(x);
		}
		System.out.println();
		for(String x:numeros) {

			System.out.println(x);
		}
	}
}

