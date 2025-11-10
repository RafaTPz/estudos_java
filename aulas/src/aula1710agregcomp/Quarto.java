package aula1710agregcomp;

public class Quarto {
	public String descricao;
	public Lampada lampada;
	public ArCondicionado ar;
	
	public Quarto() {
		lampada = new Lampada();
		ar = new ArCondicionado();
	}
}
