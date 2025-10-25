package aula2410;

public class UsaVeiculo2 {

	public static void main(String[] args) {
		Motor m = new Moto();
		Veiculo v = new Veiculo();
		m.ligar();
		
		m = new Aviao();
		m.ligar();
		
		m = new Automovel();
		
		m.acelerar();
		
		Turbo t = new Automovel();
		
		t.acionar();
		System.out.println("----");
		v.utilizar(t);
	}

}
