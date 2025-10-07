package atividade0310;

import javax.swing.JOptionPane;

public class Casa extends Imovel{
	private float tamanhoQuintal;

	public String toString() {
		return super.toString() + " Casa [tamanhoQuintal=" + tamanhoQuintal + "]";
	}
	public void sendData() {
		super.sendData();
		tamanhoQuintal = Float.parseFloat(JOptionPane.showInputDialog("Digite o tamanho do quintal: "));
	}
	
}
