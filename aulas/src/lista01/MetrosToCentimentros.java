package lista01;

import javax.swing.JOptionPane;

public class MetrosToCentimentros {

	public static void main(String[] args) {
		String metros;
		float centimetros;
		metros = JOptionPane.showInputDialog("Digite um valor em metros: ");
		centimetros = Float.parseFloat(metros) * 100;
		JOptionPane.showMessageDialog(null, centimetros + " centímetros.");
	}

}
