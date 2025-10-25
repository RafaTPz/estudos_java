package aula2410;

public class Aviao implements Motor {

	@Override
	public void ligar() {
		System.out.println("Ligando o viãoooo");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o viãoooo");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando o viãoooo");
	}

	@Override
	public void frear() {
		System.out.println("Freiano o viãoooo");
	}

}
