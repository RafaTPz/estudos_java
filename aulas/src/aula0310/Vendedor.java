package aula0310;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario{

	private float comissao;
	
	public void digitar()
	{
		super.digitar();
		comissao = Float.parseFloat(JOptionPane.showInputDialog("Comissão a ser digitada: "));
	}
	
	public void mostrar() 
	{
		super.mostrar();
		System.out.println(comissao);
	}
}