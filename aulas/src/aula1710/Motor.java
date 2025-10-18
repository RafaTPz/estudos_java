package aula1710;

public class Motor {
	private boolean status ;
	public String potencia;

	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}
	public void visualizar() {
		System.out.println(status);
	}
}
