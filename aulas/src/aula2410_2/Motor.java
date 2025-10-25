package aula2410_2;

public abstract class Motor {
	//classe tem mais flexibilidade que uma interface
	//se voce precisa apenas de metodos crie uma interface, se precisar de mais coisas crie uma classe abstrata
	public int codigo;
	public String fabricante;
	public double preco;
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void acelerar();
	public abstract void frear();
	
	public void esfriar() {
		System.out.println("Esfriando");
	}
	
}
