package aula0808;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		if(args.length == 2) {
			//int n1 =	Integer.parseInt(args[0]);
			//int n2 =	Integer.parseInt(args[1]);
			//int soma = n1+n2;

			float n1 =	Float.parseFloat(args[0]);
			float n2 =	Float.parseFloat(args[1]);
			float soma = n1+n2;

			//System.out.println("O resultado da soma de " + n1 + " + " + n2 + " é: " + soma);
			//jop  syso  main (codigos mais rapidos de digitar)

			JOptionPane.showMessageDialog(null, "Resultados\nSoma: "+soma+ "\nSubtração: "+(n1-n2)+"\nMultiplicação: "+(n1*n2)+"\nDivisão: "+(n1/n2));

			// METODO PARSEINT RECEBE O VALOR TEXTO E DEVOLVE PARA INT 1 O VALOR INTEIRO
			// OS ARGUMENTOS ARGS[0] E ARGS[1] CONTINUARÃO SENDO TEXTO, MAS O VALOR DELES CONVERTIDOS PARA INTEIRO FOI ATRIBUIDO A UMA VARIAVEL QUE É INTEIRA

			//	System.out.println(args[0]);
			//	System.out.println(args[1]);
		}else {
			System.out.println("FORNEÇA DOIS ELEMENTOS!");
		}
	}
}
