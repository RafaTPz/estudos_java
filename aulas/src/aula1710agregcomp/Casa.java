package aula1710agregcomp;

public class Casa {
	public Quarto quarto1,quarto2,quarto3;
	public Sala sala;
	public Cozinha cozinha;
	
	public Casa() {
		quarto1 = new Quarto();
		quarto2 = new Quarto();
		quarto3 = new Quarto();
		sala = new Sala();
		cozinha = new Cozinha();
	}
}
