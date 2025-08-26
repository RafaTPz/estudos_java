package aula2208;

public class Math01 {

	public static void main(String[] args) {
		String s = "ola";
		s.charAt(0);
		int a = Math.abs(-10);
		System.out.println(a);
		int b = 3, c = 7, d = 5;
		int maior = Math.max(b, c);
		int maior3 = Math.max(Math.max(b, c), d);
		int menor = Math.min(b, c);
		System.out.println(maior);
		System.out.println(menor);
	}
	//método estáticos eu acesso a partir da classe, se eu acesso a partir de um objeto não é estático
}
