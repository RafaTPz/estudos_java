package atividade0310;

import javax.swing.JOptionPane;

public class Apartamento extends Imovel{
	private boolean possuiEscada;

	public String toString() {
		super.toString();
		return super.toString() + " Apartamento [possuiEscada=" + possuiEscada + "]";
	}
	
	public void sendData() {
		super.sendData();
		possuiEscada = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite se possui escada('True' para verdadeiro ou 'False' para falso): "));
	}
	
}
