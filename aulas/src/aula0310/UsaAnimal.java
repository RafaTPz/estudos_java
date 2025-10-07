package aula0310;

public class UsaAnimal {

	public static void main(String[] args) {
		Gato gt = new Gato();
		Galinha gl = new Galinha();
				
		gt.beber();
		gl.beber();
		
		Animal a = new Gato(); // esquisito, polimorfismo
		
		a.beber();
		a.comer();
	}

}
