package aula2908;

import javax.swing.JOptionPane;

public class Excecao02 {

	public static void main(String[] args) {
		//exception checked -> em tempo de compilação
		//exception unchecked -> "runtime", em tempo de execucao

		try {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Idade? ")); //exception unchecked sendo tratada
			System.out.println("Parabéns, você digitou um valor inteiro");
		}catch(NumberFormatException erro) {
			System.out.println("Erro, você não digitou um valor inteiro "+erro);
		}
		finally {//a execucao sempre passa por aqui
			//liberar recursos
			JOptionPane.showMessageDialog(null, "Passou.");
		}

	}

}
