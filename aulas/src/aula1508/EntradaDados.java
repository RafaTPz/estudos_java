package aula1508;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Digite o mes: ");

		if(s.equals("")){
			System.out.println("Vazio");
		}else {
			System.out.println("Não vazio");
		}
		if(s!=null) {
			if(!s.equals("")) {
				int mes = Integer.parseInt(s);
				String mesExtenso = "";
				switch(mes) {
				case 1:mesExtenso = "janeiro";break;
				case 2:mesExtenso = "fevereiro";break;
				case 3:mesExtenso = "março";break;
				default:mesExtenso = "desconhecido";
				}
				JOptionPane.showMessageDialog(null,mesExtenso);
			}
		}else {
			System.out.println("O valor é desconhecido");
		}
	}
}


