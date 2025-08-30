package aula2908;

import javax.swing.JOptionPane;

public class Excecao01 {

	public static void main(String[] args) {
		//exception checked -> em tempo de compilação
		//exception unchecked -> "runtime", em tempo de execucao	
		int n = Integer.parseInt(JOptionPane.showInputDialog("Idade? "));

		//Thread.sleep(1000); //exceção checked
		//descomentar para ver o erro checked acima


		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			JOptionPane.showMessageDialog(null, "Erro");
		}
	}

}
