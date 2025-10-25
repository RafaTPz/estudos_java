package aula2410;

public class Animal implements Fisio { //provider

	@Override
	public void comer() {
		System.out.println("Animal come");
	}

	@Override
	public void beber() {
		System.out.println("Animal bebe");
	}

	@Override
	public void dormir() {
		System.out.println("Animal dorme");
	}
}
