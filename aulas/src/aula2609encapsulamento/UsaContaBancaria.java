package aula2609encapsulamento;

public class UsaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		ContaBancaria cb2 = new ContaBancaria();

		
		cb.titular = "Jorginho Bezerra";
		cb2.titular = "Maria Cláudia";
		cb.definirNumero(1000);
		cb2.definirNumero(2);
		System.out.println(cb);
		cb.depositar(1000);
		cb2.depositar(1000);
		System.out.println(cb);
		System.out.println(cb.sacar(500));
		System.out.println(cb.toString());
		
		
		ContaBancaria.fazerPix(cb, cb2, 100);
		
		System.out.println("Conta1 "+cb);
		System.out.println("Conta2 "+cb2);
	}

}
