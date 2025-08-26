package aula1508;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GuiMes extends JFrame{
	//ctrl + shift + o    importar tudo que falta importar no seu codigo
	private JButton btMostrar, btSair;
	private JTextField tfMes, tfResultado;
	//criar a tela
	public GuiMes() {
		setTitle("Código de meses");
		setBounds(200,200,600,400);
		setResizable(false);
		btMostrar = new JButton("Mostrar");
		btSair = new JButton("Sair");
		tfMes = new JTextField();
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		setLayout(null);
		btMostrar.setBounds(180,100,200,25);
		tfMes.setBounds(90,50,400,25);
		tfResultado.setBounds(90,150,400,25);
		btSair.setBounds(180,200,200,25);

		add(btMostrar);
		add(tfMes);
		add(tfResultado);
		add(btSair);

		btMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = tfMes.getText();
				int mes = Integer.parseInt(s);
				if(mes<Constantes.MES_MINIMO || mes>Constantes.MES_MAXIMO) {
					JOptionPane.showMessageDialog(btMostrar, "Mes inválido");
				}else {
					if(mes==1) {
						tfResultado.setText("Janeiro");
					}
				}
			}
		});
		
		btSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		GuiMes janela = new GuiMes();
		janela.setVisible(true);
	}

}
