package aula1710agregcomp;

public class UsaSala {

	public static void main(String[] args) {
		Sala s = new Sala();
		s.descricao = "sala de estar";
		s.lampada1.ligar();
		s.lampada2.ligar();
		s.lampada1.visualizar();
		s.lampada2.visualizar();
		s.ar.ligar();
		s.ar.visualizar();
	}

}
