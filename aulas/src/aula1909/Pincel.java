package aula1909;

public class Pincel {
	//atributos(propriedades -> estado do objeto
	
	public String cor;
	public double preco;
	public int tamanho;
	//define o que o objeto é
	//os métodos realizam ações sobre os dados do objeto
	//métodos definem o comportamento de um objeto
	
	/**
	 * Apresenta em tela o estado atual do objeto
	 */
	public void mostrar() {
		System.out.println("cor: "+cor);
		System.out.println("tamanho: "+tamanho);
		System.out.println("preço: "+preco);

	}
	
	public void limpar() {
		cor = "";
		preco = 0;
		tamanho = 12;
	}
	
	public void abrirTampa() {
		System.out.println("A tampa do pincel foi aberta!");
	}
	public void fecharTampa() {
		System.out.println("A tampa do pincel foi fechada!");
	}
}
