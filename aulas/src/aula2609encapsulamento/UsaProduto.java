package aula2609encapsulamento;

public class UsaProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		Produto p1 = new Produto(1, "s", 2.34, false, 's');  // método construtor
		System.out.println(p1);
		p.setCodigo(1);
		p.setNome("Sabonete");
		p.setTipo('S');
		p.setValor(2.34);
		p.setNovo(true);
		System.out.println(p);


	}

}
