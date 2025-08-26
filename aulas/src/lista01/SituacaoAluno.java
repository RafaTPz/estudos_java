package lista01;

import javax.swing.JOptionPane;

public class SituacaoAluno {

	public static void main(String[] args) {
		float media,numero = 0;
		String inputt;
		int QTD_NOTAS = 2;
		for(int n = 1;n<=QTD_NOTAS;n++) {
			inputt = JOptionPane.showInputDialog("Digite a nota "+n+": ");
			numero += Float.parseFloat(inputt);
		}
		media = numero/QTD_NOTAS;
		
		if(media < 5) 
		{
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		else if (media >=5 && media <7) 
		{
			JOptionPane.showMessageDialog(null, "Recuperação");
		}
		else if(media >=7)
		{
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		
	}

}
