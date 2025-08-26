package lista01;

import javax.swing.JOptionPane;

public class ParesImpares {

	public static void main(String[] args) {
		final int QUANTIDADE_NUMEROS = 10, DIVISIVEL_POR = 2;
		int numero;
		String[] impares = new String[QUANTIDADE_NUMEROS], pares = new String[QUANTIDADE_NUMEROS];

		for (int n=0;n<QUANTIDADE_NUMEROS;n++) 
		{
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "+(n+1)+":"));
			if(numero % DIVISIVEL_POR == 0) 
			{
				pares[n] = Integer.toString(numero);
				//tive de pesquisar essa função pois estava retornando 
				//erro ao tentar colocar int no array
			}
			else
			{
				impares[n] = Integer.toString(numero);
			}
		}
		for(String s:pares) 
		{
			if(s != null) System.out.println("Número par: "+ s);
		}
		for(String s:impares) 
		{
			if(s != null) System.out.println("Número ímpar: "+ s);
		}


	}

}


