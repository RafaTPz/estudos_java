package aula0310;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String rg;
	
	@Override
	public void digitar()
	{
		super.digitar();
		cpf = JOptionPane.showInputDialog("CPF a ser digitado: ");
		rg = JOptionPane.showInputDialog("RG a ser digitado: ");
	}
	
	@Override
	public void mostrar() 
	{
		super.mostrar();
		System.out.println(cpf);
		System.out.println(rg);
	}
}
