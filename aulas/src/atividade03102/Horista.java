package atividade03102;

public class Horista extends Funcionario{
	private double precoHora, horasTrabalhadas;
	
	public double calcularSalario() {
		precoHora = Double.parseDouble("Digite precoHora: ");
		horasTrabalhadas = Double.parseDouble("Digite horasTrabalhadas: ");

		return salario = precoHora * horasTrabalhadas;
	}
}
