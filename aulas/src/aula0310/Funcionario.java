package aula0310;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica{
	
	private double salario;
	
	public void digitar()
	{
		super.digitar();
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário a ser digitado: "));
	}
	
	public void mostrar() 
	{
		super.mostrar();
		System.out.println(salario);
	}
}
