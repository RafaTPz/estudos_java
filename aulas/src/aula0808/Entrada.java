package aula0808;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Informe n1: ");
		String b = JOptionPane.showInputDialog("Informe n2: ");
		double n1 = Double.parseDouble(a);
		double n2 = Double.parseDouble(b);
		JOptionPane.showMessageDialog(null, "Soma: "+(n1+n2));
	}

}
