package aula1710agregcomp;

public class Funcionario {
	public int id;
	public String nome;
	public Cargo cargo;

	public void mostrar() {
		System.out.println(id);
		System.out.println(nome);
		if(cargo != null) {
			System.out.println(cargo.id);
			System.out.println(cargo.nome);
		}
	}
}
