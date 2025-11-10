package aula2609encapsulamento;

public class Produto {
	public static String empresa; // static indica posse
	// static é da classe, não do objeto, todos objetos terão a mesma "empresa"
	//static é comum entre todos objetos
	private int codigo;
	private String nome;
	private double valor;
	private boolean novo;
	private char tipo;



	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", novo=" + novo + ", tipo=" + tipo + ", empresa=" + empresa + 
				"]";
	}

	public Produto() {
	}


	public Produto(int codigo, String nome, double valor, boolean novo, char tipo) {
		//super();
		this.codigo = codigo;
		this.nome = nome;
		setValor(valor);
		this.novo = novo;
		this.tipo = tipo;
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}
	public boolean isNovo() {
		return novo;
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}



}
