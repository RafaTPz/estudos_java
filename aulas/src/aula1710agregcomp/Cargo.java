package aula1710agregcomp;

import java.util.List;

public class Cargo {
	public int id;
	public String nome;
	//public Funcionario[] funcionarios; //opção1
	public List<Funcionario> listafuncionarios; //opção2


	public void mostrar() {
		System.out.println(id);
		System.out.println(nome);
		for(Funcionario f: listafuncionarios) {
			System.out.println(f.nome);
		}
	}
}
