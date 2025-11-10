package aula1710agregcomp;

public class UsaCasamento {

	public static void main(String[] args) {
		Homem h = new Homem();
		h.nome = "Sérgio";
		
		Mulher m = new Mulher();
		m.nome = "Ivone";
		
		Casamento c = new Casamento();
		c.cerimonialista = "Pedro Denny Re";
		c.data = "21/01/1995";
		c.homi= h;
		c.muie = m;
		c.mostrar();
	}

}
