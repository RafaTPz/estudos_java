package aula2410;

public class UsaVida {

	public static void main(String[] args) {
		Fisio f = new Pessoa();
		Vida.viver(f);
		Fisio a = new Animal();
		Vida.viver(a);
		
		Fisio et = new ET();
		Vida.viver(et);
	}

}
