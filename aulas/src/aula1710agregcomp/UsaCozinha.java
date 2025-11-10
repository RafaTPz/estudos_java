package aula1710agregcomp;

public class UsaCozinha {

	public static void main(String[] args) {
		Cozinha c = new Cozinha();
		c.lampada.ligar();
		c.lampada.visualizar();
		c.lampada.desligar();
		c.lampada.visualizar();
	}

}
