package aula2208;

import java.util.Random;

public class Math04 {

	public static void main(String[] args) {
		Random r = new Random();
		Random rSeed = new Random(100);
		// seed, deixa de ser aleatório o valor... por isso random é pseudo aleatório, pois quando não há seed, é 
		// utilizado o valor do relógio como parametro, aparentando ser aleatório sempre que voce rodar o código.
		System.out.println(r.nextInt(10,20));
		System.out.println(r.nextFloat(10));
		System.out.println(r.nextDouble(10));
	}
	
	//o método next(int) da classe Random possui intervalo ex:(10,20), portanto é melhor do que o método random() da classe Math que só pode escolher um número

}
