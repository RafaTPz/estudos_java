package aula1909;

public class Motor {
	private final int VELOCIDADE_MAXIMA = 100, VELOCIDADE_MINIMA = 0;
	private boolean status = false;
	private int velocidade = 0;

	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}

	public void mostrar() {
		System.out.println("Status: "+(status == true?"Ligado": "Desligado"));
		System.out.println("Velocidade: "+velocidade);
	}
	public void frear() {
		if(status) {
			if(velocidade>=VELOCIDADE_MINIMA) {
				velocidade--;
			}
		}
	}
	public void acelerar() {
		if(status) {
			if(velocidade<=VELOCIDADE_MAXIMA) {
				velocidade++;
			}
		}
		//System.out.println("velocidade:" +velocidade);
		//try {
		//	Thread.sleep(50);
		//} catch (InterruptedException e) {

		//}
	}
}
