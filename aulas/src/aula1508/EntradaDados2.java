package aula1508;

import javax.swing.JOptionPane;

public class EntradaDados2 {

	public static void main(String[] args) {
		
		
		String s = JOptionPane.showInputDialog("Digite o mes: ");
		int mes = Integer.parseInt(s);
		
		if(mes>=Constantes.MES_MINIMO && mes<Constantes.MES_MAXIMO) {
			JOptionPane.showMessageDialog(null, "Valido");
		}else {
			JOptionPane.showMessageDialog(null, "Inválido");
		}
	}
}


