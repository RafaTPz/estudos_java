package atividade0310;

import javax.swing.JOptionPane;

public class Chacara extends Imovel{
	private boolean possuiPiscina;
	private float metragemDaCasa;
	
	public String toString() {
		super.toString();
		return super.toString() + " Chacara [possuiPiscina=" + possuiPiscina + ", metragemDaCasa=" + metragemDaCasa + "]";
	}
	public void sendData() {
		super.sendData();
		possuiPiscina = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite se possui piscina('True' para verdadeiro ou 'False' para falso): "));
		metragemDaCasa = Float.parseFloat(JOptionPane.showInputDialog("Digite a metragem da casa: "));
	}
	
	
}
