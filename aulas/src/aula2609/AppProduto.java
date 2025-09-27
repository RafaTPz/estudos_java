package aula2609;

public class AppProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();

		p1.setCodigo(1);
		Produto.empresa = "Fatec";
		System.out.println(p1);

		Produto p2 = new Produto();
		p2.setCodigo(2);

		//p2.setCodigo(p1.getCodigo());
		// teste maluco ignoras ^

		System.out.println(p2);
	}

}
