package aula1909;

public class Word02 extends Thread{

	String texto = "Apostila de Java";

	public void run() {
		Impressora.imprimir(texto);
	}

}
