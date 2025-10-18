package aula1710;

public class UsaAutomovel {

	public static void main(String[] args) {
		Pneu p1 = new Pneu(); p1.aro="15";p1.marca="Pirelli";
		Pneu p2 = new Pneu(); p1.aro="15";p1.marca="Pirelli";
		Pneu p3 = new Pneu(); p1.aro="15";p1.marca="Pirelli";
		Pneu p4 = new Pneu(); p1.aro="15";p1.marca="Pirelli";


		Som s = new Som();
		s.potencia = "500w";
		Motor m = new Motor();
		m.potencia = "200cv";
		Automovel a1 = new Automovel("Shelby Mustang", m,s);
		a1.addPneu(p1);
		a1.addPneu(p2);
		a1.mostrar();
		a1.addPneu(p3);
		a1.addPneu(p4);
		a1.mostrar();
		Automovel a2 = new Automovel("Ferrari California",m,s);
		a2.mostrar();
	}

}
