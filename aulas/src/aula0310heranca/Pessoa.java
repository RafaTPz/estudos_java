package aula0310heranca;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	private int numero;
	protected String nome;
	
	public void digitar() {
		numero = Integer.parseInt(JOptionPane.showInputDialog("Número a ser digitado: "));
		nome = JOptionPane.showInputDialog("Nome a ser digitado: ");
	}
	
	public void mostrar() {
		System.out.println(numero);
		System.out.println(nome);
	}

}
