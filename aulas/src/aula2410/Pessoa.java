package aula2410;

public class Pessoa implements Fisio {

	@Override
	public void comer() {
		System.out.println("Pessoa come");
	}

	@Override
	public void beber() {
		System.out.println("Pessoa bebe");
	}

	@Override
	public void dormir() {
		System.out.println("Pessoa dorme");
	}

}
