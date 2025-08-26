package aula2208;

public class String02 {

	public static void main(String[] args) throws InterruptedException {
		String aula = "Programação Orientada a Objetos";
		char letra = aula.charAt(3);
		//charAt recebe um indice e devolve um char
		//um metodo recebe, processa e devolve
		System.out.println(letra);

		for(int x=0; x < aula.length(); x++) {
			System.out.print(aula.charAt(x));
			Thread.sleep(500);
		}
		System.out.println();
		for(int x=aula.length()-1; x >= 0; x--) {
			System.out.print(aula.charAt(x));
			Thread.sleep(500);
		}
	}

}
