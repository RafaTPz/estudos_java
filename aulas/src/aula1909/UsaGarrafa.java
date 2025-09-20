package aula1909;

public class UsaGarrafa {

	public static void main(String[] args) {
		Garrafa g = new Garrafa();
		g.material = "vidro";
		g.abrir();
		g.encherGarrafa();
		g.mostrar();
		System.out.println(g.consumir(100));
		g.mostrar();
		g.esvaziarGarrafa();
		g.fechar();
		g.mostrar();

	}

}
