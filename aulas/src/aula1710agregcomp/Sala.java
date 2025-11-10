package aula1710agregcomp;

public class Sala {
	public String descricao;
	public Lampada lampada1, lampada2;
	public ArCondicionado ar;
	
	//composição, as lâmpadas estão dentro da Sala e são criadas ao mesmo tempo que a sala.
	public Sala() {
		lampada1 = new Lampada();
		lampada2 = new Lampada();
		ar = new ArCondicionado();
	}
	//ao mesmo tempo que instancio a sala eu instancio as lampadas
}
