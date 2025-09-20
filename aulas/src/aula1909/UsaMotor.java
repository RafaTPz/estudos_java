package aula1909;

public class UsaMotor {

	public static void main(String[] args) {
		Motor m = new Motor();
		m.mostrar();
		m.ligar();
		m.mostrar();
		for(int i=1;i<=100;i++) {
			m.acelerar();
		}
		m.mostrar();
		for(int i=100;i>=0;i++) {
			m.frear();
		}
		m.mostrar();
	}

}
