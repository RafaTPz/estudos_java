package aula1710;

import java.util.List;
import java.util.ArrayList;


public class Automovel {
	public String modelo;
	public Motor motor;
	public Som som;
	public List<Pneu> pneus = new ArrayList<Pneu>();
	
	public Automovel(String modelo, Motor motor, Som som) {
		this.modelo = modelo;
		this.motor = motor;
		this.som = som;
	}
	
	public void addPneu(Pneu pneu) {
		pneus.add(pneu);
	}
	
	public void listarPneus() {
		for(Pneu p: pneus) {
			System.out.println(p.aro);
			System.out.println(p.marca);
		}
	}
	
	public void mostrar() {
		System.out.println(modelo);
		System.out.println("Potencia do motor: " + motor.potencia);
		System.out.println("Potencia do som: " + som.potencia);
		listarPneus();
	}
}
