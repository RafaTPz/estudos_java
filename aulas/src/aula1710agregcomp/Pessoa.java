package aula1710agregcomp;

public class Pessoa {
	public int id;
	public String nome;
	public Pessoa conjuge;
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public void mostrar() {
		System.out.println(id);
		System.out.println(nome);
		if(conjuge!=null) {
			System.out.println("Casado com: "+ conjuge.nome);
		}else {
			System.out.println("Solteiro(a)");
		}
	}
}
