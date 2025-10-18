package aula1710;

import java.util.ArrayList;
import java.util.List;

public class UsaCargo {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.id = 1;
		f1.nome = "Paulo";
		Funcionario f2 = new Funcionario();
		f2.id = 2;
		f2.nome = "Ana";
		Funcionario f3 = new Funcionario();
		f3.id = 3;
		f3.nome = "Murilo Bionico";
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add(f1);
		listaFuncionarios.add(f2);
		listaFuncionarios.add(f3);
		Cargo c = new Cargo();
		c.id = 100;
		c.nome = "Teologo";
		c.listafuncionarios = listaFuncionarios; // adiciona a lista de funcionarios ao Cargo
	}

}
