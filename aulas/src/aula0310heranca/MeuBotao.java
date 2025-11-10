package aula0310heranca;

import java.awt.Color;

import javax.swing.JButton;

public class MeuBotao extends JButton{
	public MeuBotao(String titulo) {
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setText(titulo);
	}
}
