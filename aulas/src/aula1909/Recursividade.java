package aula1909;

public class Recursividade {
	public static void main(String[] args) {
		System.out.println(somar(5));
	}
	
	/**
	 * retorna a soma de todos os inteiros compreendidos entre 1 e n
	 */
	public static int somar(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + somar(n-1);
		}
	}
}
