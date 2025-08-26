package lista01;

import javax.swing.JOptionPane;

public class MediaBimestral {

	public static void main(String[] args) {
		float media,numero = 0;
		String inputt;
		int QTD_NOTAS = 3;
		for(int n = 1;n<=QTD_NOTAS;n++) {
			inputt = JOptionPane.showInputDialog("Digite a nota "+n+": ");
			numero += Float.parseFloat(inputt);
		}
		media = numero/QTD_NOTAS;
		JOptionPane.showMessageDialog(null,"A média foi: "+media);
	}

}
