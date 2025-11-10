package atividade0310;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsaImovel extends JFrame {

	private JButton btCasa, btApartamento, btChacara;

	public UsaImovel() {

		setBounds(100,100,300,200);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		btCasa = new JButton("Casa");
		add(btCasa);
		btApartamento = new JButton("Apartamento");
		add(btApartamento);
		btChacara = new JButton("Chácara");
		add(btChacara);

		btCasa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Imovel i = new Casa();
				i.sendData();
				JOptionPane.showMessageDialog(btCasa, i.toString());
			}
		});
		btApartamento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Imovel i = new Apartamento();
				i.sendData();
				JOptionPane.showMessageDialog(btApartamento, i.toString());
			}
		});
		btChacara.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Imovel i = new Chacara();
				i.sendData();
				JOptionPane.showMessageDialog(btChacara, i.toString());
			}
		});
	}

	public static void main(String[] args) {
		UsaImovel u = new UsaImovel();
		u.setVisible(true);
	}
}
