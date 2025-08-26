package aula2208;

public class Math03 {

	public static void main(String[] args) {
		for(int cartao=1;cartao<=10;cartao++) {
			System.out.print("Cartão "+cartao+": ");
			for(int x=0;x<6;x++) System.out.print((int)(1+Math.random()*60)+ " ");
			System.out.println();
		}
	}

}

