package aula2410;

public class UsaPedido {

	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.numero = 100;
		p.dataEmissao = "24/10/2025";
		p.addItem("Sabão em pó", 10, 14.99f);
		p.addItem("Sabonete", 20, 2.99f);
		p.addItem("Deter Gente", 14, 5.99f);
		
		p.mostrar();
	}

}
