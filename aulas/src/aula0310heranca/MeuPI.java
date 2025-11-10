package aula0310heranca;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeuPI extends JFrame {
	private JButton btOriginal;
	private MeuBotao btPersonal; 
	
	public MeuPI() {
		setBounds(100,100,300,200);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		btOriginal = new JButton("Original");
		btPersonal = new MeuBotao("Personal");
		add(btOriginal);
		add(btPersonal);
		
		btPersonal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btPersonal, "Oie");
			}
		});
	}

	public static void main(String[] args) {
		MeuPI m = new MeuPI();
		m.setVisible(true);
	}
}
