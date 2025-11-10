package aula1710agregcomp;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1,"Ana");
		Pessoa p2 = new Pessoa(2,"Lucas");
		Pessoa p3 = new Pessoa(3,"Daniel");
		Pessoa p4 = new Pessoa(4,"Eliana");
		Pessoa p5 = new Pessoa(5,"Sonia");
		Pessoa p6 = new Pessoa(6,"Carlos");
		
		p1.conjuge = p3;
		p3.conjuge = p1;
		p2.conjuge = p4;
		p4.conjuge = p2;
		
		p1.mostrar();
		System.out.println("----------------");
		p2.mostrar();
		System.out.println("----------------");
		p3.mostrar();
		System.out.println("----------------");
		p4.mostrar();
		System.out.println("----------------");
		p5.mostrar();
		System.out.println("----------------");
		p6.mostrar();
		System.out.println("----------------");
	}

}
