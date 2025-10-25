package aula2410;

public interface Motor {
	//Interfaces contém apenas especificações
	
	//todos os metodos de uma classe são por natureza publicos e abstratos
	public abstract void ligar();
	void desligar();
	void acelerar();
	void frear();
	
	//algo abstract sempre será um conceito, não pode ser utilizado diratamente... terá de implementa-lo
}
