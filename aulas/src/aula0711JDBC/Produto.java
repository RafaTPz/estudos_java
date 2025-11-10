package aula0711JDBC;

public class Produto {
	private int codigo;
	private String nome;
	private int qtdeEstoque;
	private double preco;

	public Produto() {
		
	}
	
	public Produto(int codigo, String nome, int qtdeEstoque, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtdeEstoque = qtdeEstoque;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", qtdeEstoque=" + qtdeEstoque + ", preco=" + preco
				+ "]";
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
