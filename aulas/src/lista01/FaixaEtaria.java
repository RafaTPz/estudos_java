package lista01;

import javax.swing.JOptionPane;

public class FaixaEtaria {

	public static void main(String[] args) {
		int idade;
		String input = JOptionPane.showInputDialog("Digite a sua idade: ");
		idade = Integer.parseInt(input);

		if(idade >=0 && idade <=3) 
		{
			JOptionPane.showMessageDialog(null, "Bebê");
		}
		else if(idade >3 && idade <=12) 
		{
			JOptionPane.showMessageDialog(null, "Criança");
		}	
		else if(idade >12 && idade <=18) 
		{
			JOptionPane.showMessageDialog(null, "Adolescente");
		}	
		else if(idade >18 && idade <=70) 
		{
			JOptionPane.showMessageDialog(null, "Adulto");
		}
		else if(idade >70 && idade <=120) 
		{
			JOptionPane.showMessageDialog(null, "Terceira idade");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Indeterminado");
		}

	}

}
