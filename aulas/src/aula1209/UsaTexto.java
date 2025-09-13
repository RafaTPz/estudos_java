package aula1209;

import javax.swing.JOptionPane;

public class UsaTexto {

	public static void main(String[] args) {
		String s = "Eu amo Java!";
		Texto.inverter(s);

		String sEspelhado = Texto.espelhar(s);
		System.out.print(s + " ");
		System.out.println(sEspelhado);

		Texto.salvar(s, "C:/Users/Rafael/Desktop/Java/ProjetosJava/aulas/src/aula1209/arquivo.txt");
		Boolean resposta = Texto.save(s, "C:/Users/Rafael/Desktop/Java/ProjetosJava/aulas/src/aula1209/arquivo2.txt");
		if(resposta) {
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Deu ruim maninho :(");
		}
		JOptionPane.showMessageDialog(null, Texto.save(s, "C:/Users/Rafael/Desktop/Java/ProjetosJava/aulas/src/aula1209/","file.txt"));
	}

}
