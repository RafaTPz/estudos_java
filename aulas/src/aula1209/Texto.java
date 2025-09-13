package aula1209;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Texto {
	/**
	 * Recebe um texto e o imprime de forma espelhada
	 * @param t - texto recebido
	 */
	public static void inverter(String t) {
		for(int i = t.length()-1; i >= 0; i--) {
			System.out.print(t.charAt(i));
		}
		System.out.println();
	}
	/**
	 * Recebe um texto e o RETORNA de forma espelhada
	 * @param t - o texto recebido
	 * @return - o valor invertido;

	 */
	public static String espelhar(String t) {
		String retorno = "";
		for(int i = t.length()-1; i >= 0; i--) {
			retorno += (t.charAt(i));
		}
		return retorno;
	}

	/**
	 * Armazena o texto fornecido em um arquivo .txt
	 * @param t - o texto a ser armazenado
	 * @param path - o caminho e nome do arquivo
	 */
	public static void salvar(String t, String path) {
		try {
			PrintWriter pw = new PrintWriter(path);
			pw.print(t);
			pw.close();
			System.out.println("Arquivo armazenado com sucesso!");
		} catch (FileNotFoundException e) {
			System.out.println("Falha ao gravar o arquivo"+e);
		}
	}

	/**
	 * Armazena o texto fornecido em um arquivo .txt
	 * @param t - o texto a ser armazenado
	 * @param path - o caminho e nome do arquivo
	 * @return - true em caso de sucesso, false em caso de falha
	 */
	public static boolean save(String t, String path) {
		boolean r = false;
		try {
			PrintWriter pw = new PrintWriter(path);
			pw.print(t);
			pw.close();
			System.out.println("Arquivo armazenado com sucesso!");
			r = true;
		} catch (FileNotFoundException e) {
			System.out.println("Falha ao gravar o arquivo"+e);
		}
		return r;

	}

	/**
	 * Armazena em arquivo o texto fornecido
	 * @param t - o texto a ser armazenado
	 * @param path - o caminho que o arquivo será alocado
	 * @param fileName - o nome do arquivo
	 * @return - um texto informando o resultado
	 */
	public static String save(String t, String path, String fileName) {
		String r = "Arquivo salvo com sucesso!";
		try {
			PrintWriter pw = new PrintWriter(path+"/"+fileName);
			pw.print(t);
			pw.close();
			System.out.println(r);
		} catch (FileNotFoundException e) {
			r = "Falha ao gravar o arquivo"+e;
			System.out.println(r);
		}
		return r;
	}

	/**
	 * Retorna uma senha aleatório contendo digitos numéricos
	 * @param qtdeDigitos - a quantidade de digitos
	 * @return a senhacom digitos aleatórios
	 */
	public static String gerarSenha(int qtdeDigitos) {
		String senha = "";
		for(int i=1;i<=qtdeDigitos;i++) {
			senha+= (int)(Math.random()*10);
		}
		return senha;
	}
}
