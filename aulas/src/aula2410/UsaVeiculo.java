package aula2410;

public class UsaVeiculo {

	public static void main(String[] args) {
		Moto m = new Moto();
		Automovel au = new Automovel();
		Aviao av = new Aviao();
		
		m.ligar();
		m.acelerar();
		m.frear();
		m.desligar();
		
		av.ligar();
		av.acelerar();
		av.frear();
		av.desligar();
		
		au.abrir();
		au.ligar();
		au.acionar();
		au.acelerar();
		au.frear();
		au.resetar();
		au.desligar();
		au.fechar();
	}

}
