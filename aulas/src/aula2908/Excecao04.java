package aula2908;

import javax.swing.JOptionPane;

public class Excecao04 {

	public static void main(String[] args) {
		
		for(int a=1;a<=10;a++) {
			System.out.println(a);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Falha: "+ e);

			}
		}

	}

}
