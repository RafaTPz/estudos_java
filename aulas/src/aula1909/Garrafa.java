package aula1909;

public class Garrafa {
	public String material;
	private int volume = 1000;

	/**
	 * A - aberta  | F - fechada
	 */
	private char status = 'A';

	/**
	 * Apresenta em tela o estado atual do objeto
	 */
	public void mostrar() {
		System.out.println("material: "+material);
		System.out.println("volume: "+volume+ " ml");
		System.out.println(status=='A'?"Aberta": status == 'F'? "Fechada": "Inválido");

	}

	public void abrir() {
		status = 'A';
	}
	public void fechar() {
		status = 'F';
	}

	public void encherGarrafa() {
		volume = 1000;
	}
	public void esvaziarGarrafa() {
		volume = 0;
	}
	public String consumir(int volumeV) {
		String r = "Consumo realizado com sucesso";
		if(volumeV < volume) {
			volume -= volumeV;
		}else {
			r = "Consumo não realizado, você está tentando beber mais do que a garrafa possui disponível!";
		}
		return r;
	}
}
