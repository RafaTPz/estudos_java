package aula1209;

public class UsaMetodos {

	public static void main(String[] args) {
		Calculadora.somar(10, 20);

		//chamando método não estático, método instanciado por objeto
		Calculadora c = new Calculadora();
		c.somase(10, 20);


	}

}
