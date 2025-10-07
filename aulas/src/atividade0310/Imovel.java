package atividade0310;

import javax.swing.JOptionPane;

public abstract class Imovel {
	private String descricao;
	private String endereco;
	private double preco;
	
	public String toString() {
		return "Imovel [descricao=" + descricao + ", endereco=" + endereco + ", preco=" + preco + "]";
	}
	
	public void sendData() {
		descricao = JOptionPane.showInputDialog("Digite a descricao: ");
		endereco = JOptionPane.showInputDialog("Digite o endereço: ");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
	}
	
	
}
