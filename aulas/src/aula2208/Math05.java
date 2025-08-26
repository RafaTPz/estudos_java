package aula2208;

public class Math05 {

	public static void main(String[] args) {
		String senha = "";
		int qtdeNumeros = 10;
		for(int i=1; i<=qtdeNumeros;i++) {
			int n = (int)(Math.random()*10);
			senha+=n;
		}
		System.out.println(senha);
	}

}
