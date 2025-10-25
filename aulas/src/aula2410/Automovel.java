package aula2410;

public class Automovel implements Motor, Turbo, Porta{
	public void acelerar() {
		System.out.println("Acelera o motor do automovel");
	}
	public void frear() {
		System.out.println("Freia  o motor do automovel");
	}
	public void ligar() {
		System.out.println("Liga o motor do automovel");
	}
	public void desligar() {
		System.out.println("Desliga o motor do automovel");
	}
	public void mostrar() {
		System.out.println("Mostrando automovel");
	}
	@Override
	public void acionar() {
		System.out.println("Turbo do automovel acionado");
	}
	@Override
	public void resetar() {
		System.out.println("Turbo do automovel resetado");
	}
	@Override
	public void abrir() {
		System.out.println("A porta do automovel foi aberta");
	}
	@Override
	public void fechar() {
		System.out.println("A porta do automovel foi fechada");
	}
}
