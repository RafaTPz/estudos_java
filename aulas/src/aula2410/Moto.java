package aula2410;

public class Moto implements Motor{

	@Override
	public void ligar() {
		System.out.println("Ligando a motinha");		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando a motinha");		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando a motinha");		
	}

	@Override
	public void frear() {
		System.out.println("Freiando a motinha");		
	}

}
