package aula1209;

public class Calculadora {
	//escopo de instancia de objeto
	public void somase(float a, float b) {
		System.out.println(a+b);
	}

	//escopo de classe
	public static void somar(float a, float b) {
		System.out.println(a+b);

	}

	public static void somar(int a, float b) {
		System.out.println(a+b);

	}

	//só posso ter sobrecarga(métodos de mesmo nome) se os métodos tiverem assinaturas diferentes


}
