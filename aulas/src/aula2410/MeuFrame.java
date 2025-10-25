package aula2410;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MeuFrame extends JFrame implements Botao, Caixa {
	
	public MeuFrame() {
		setTitle("Usando interfaces");
		setBounds(200,200,200,200);
		tf.setText("Ola");
		b.setText("Clicaaa");
		setLayout(new FlowLayout());
		add(tf);
		add(b);
	}
	
	public static void main(String[] args) {
		MeuFrame mf = new MeuFrame();
		mf.setVisible(true);
	}
}
