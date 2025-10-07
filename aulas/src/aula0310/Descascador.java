package aula0310;

public class Descascador {
	public static void agir(Fruta f) {
		f.descascar();
	}
	public static void main(String[] args) {
		//Banana b = new Banana();
		//Abacaxi a = new Abacaxi();
		//Melancia m = new Melancia();
		Fruta f = new AbacaxiReal();
		agir(f);

	}
}
