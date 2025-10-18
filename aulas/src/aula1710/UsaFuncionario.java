package aula1710;

public class UsaFuncionario {
	
	public static void main(String[] args) {
		Cargo c = new Cargo();
		c.id = 100;
		c.nome = "Programador";
		Funcionario f = new Funcionario();
		f.id = 1;
		f.nome = "Pedro";
		f.cargo = c; //acontece a associação entre os objetos
		f.mostrar();
		
		Funcionario f2 = new Funcionario();
		f2.id = 2;
		f2.nome = "Lucas";
		f2.cargo = c; //acontece a associação entre os objetos
		f2.mostrar();
	}

}
