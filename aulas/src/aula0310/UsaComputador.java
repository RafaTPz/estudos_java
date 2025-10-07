package aula0310;

public class UsaComputador {

	public static void main(String[] args) {
		// por default o java ja herda as classes objects do Java
		Computador c = new Computador();
		c.descricao = "Computador de mesa";
		System.out.println(c.getClass());
		System.out.println(c.hashCode());
	}

}
