package aula1909;

public class AppPincel {
	public static void main(String[] args) {
		Pincel p1 = new Pincel();
		Pincel p2 = new Pincel();
		Pincel p3 = new Pincel();
		p1.mostrar();
		p1.cor = "vermelho comunista";
		p2.cor = "amarelo patriota";
		p3.cor = "azul neutro";
		p1.preco = 80.00;
		p2.preco = 14.23;
		p3.preco = 9.99;
		p1.tamanho = 5;
		p2.tamanho = 9;
		p3.tamanho = 15;
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
		p1.abrirTampa();
		p1.mostrar();
		p1.limpar();
		p1.mostrar();
		p1.fecharTampa();
		
		
	}
}
