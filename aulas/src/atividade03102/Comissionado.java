package atividade03102;

public class Comissionado extends Funcionario{
	private double totalVenda, taxaComissao;
	
	public double calcularSalario() {
		totalVenda = Double.parseDouble("Digite totalVenda: ");
		taxaComissao = Double.parseDouble("Digite taxaComissao: ");

		return salario = totalVenda * (taxaComissao / 100);
	}
}

