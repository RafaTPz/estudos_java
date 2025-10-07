package atividade03102;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	
	public double calcularSalario() {
		return Double.parseDouble(cpf);
	}
}
