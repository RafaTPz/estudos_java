package aula1209;

public class Impressora {
	/**
	 * Imprime sempre a mesma mensagem em tela
	 */
	public static void imprimir() {
		System.out.println("Apostila de java");
	}
	/**
	 * Imprime em tela o argumento recebido pelo parâmetro
	 * @param texto
	 */
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	/**
	 * Imprime em tela o argumento recebido pelo parâmetro texto, pela quantidade de vezes recebida como argumento pelo parâmetro quantidadeVezes
	 * @param texto
	 * @param quantidadeVezes
	 */
	public static void imprimir(String texto, int quantidadeVezes) {
		for(int i = 1; i<=quantidadeVezes;i++) {
			System.out.println(texto);
		}
	}
	/**
	 * Imprime em tela o argumento recebido pelo parâmetro texto, para imprimir em caixa alta, foneça o argumento "alta" para o parâmetro de caixa, ou qualquer outra coisa para imprimir em minúsculo.
	 * @param texto
	 * @param caixa
	 */
	public static void imprimir(String texto, String caixa) {
		if(caixa.equalsIgnoreCase("alta")) {			
			System.out.println(texto.toUpperCase());
		}else {
			System.out.println(texto.toLowerCase());
		}
	}
}
