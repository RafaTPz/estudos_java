package aula1909;

public class Word01 extends Thread{

	String texto = "Apostila de Python";

	public void run() {
		Impressora.imprimir(texto);
	}

}
