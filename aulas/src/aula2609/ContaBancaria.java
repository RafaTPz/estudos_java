package aula2609;

import javax.swing.JOptionPane;

public class ContaBancaria {
	private int numero;
	public String titular; // não encapsulado
	private double saldo;
	private final double LIMITE_PARA_SAQUE = 1000;

	/**
	 * retorna o estado atual do objeto em tipo String
	 */
	public String toString() {
		return "["+numero+";"+titular+";"+saldo+"]";
	}

	//se não tiver toString é retornado o código hash do arquivo

	public static boolean fazerPix(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
		
		//da pra brincar tentando fazer transaction
		double total = contaOrigem.saldo + contaDestino.saldo;
		contaOrigem.sacar(valor);
		contaDestino.depositar(valor);
		double total2 = contaOrigem.saldo + contaDestino.saldo;
		if(total == total2) {
			return true;
		}else {
			return false;
		}
	}


	/*
	 * em um ambiente encapsulado é possível definir regras de negócio
	 */


	/**
	 * Recebe um valor positivo e o adiciona ao saldo;
	 * @param valor - valor a ser depositado
	 */
	public void depositar(double valor) {
		if(valor>0) {
			saldo += valor;
		}
	}

	/**
	 * Retorna o valor presente no saldo de sua conta bancária.
	 * @return o saldo
	 */
	public double consultarSaldo() {
		return saldo;
	}
	/**
	 * Recebe um valor para ser debitado do saldo de sua conta bancária
	 * @param valor - o valor a ser sacado
	 * @return a mensagem de status
	 */
	public String sacar(double valor) {
		String retorno = "Saque realizado com sucesso";
		if(valor<=LIMITE_PARA_SAQUE) {
			if(saldo>=valor) {
				saldo -= valor;
			}else {
				retorno = titular + " você não possui esta quantia, retire um número menor.";
			}
		}else {
			retorno = titular + " o seu limite para saque é "+ LIMITE_PARA_SAQUE;
		}
		return retorno;
	}
	/**
	 * Armazena o número da conta que deve ser superior a 0.
	 * @param n - numero definido
	 */
	public void definirNumero(int n) {
		if(n>0) {
			numero = n;
		}
	}
	/**
	 * Retorna o valor atual do número da conta bancária sem tratamento.
	 * @return o valor
	 */
	public int pegarNumero() {
		return numero;
	}

}
