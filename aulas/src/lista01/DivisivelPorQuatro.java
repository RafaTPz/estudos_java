package lista01;

public class DivisivelPorQuatro {

	public static void main(String[] args) {
		final int DIVISIVEL_POR = 4, VALOR_REFERENCIA = 200;
		
		for(int n=1;n<VALOR_REFERENCIA;n++) {
			if(n % DIVISIVEL_POR == 0) {
				System.out.println(n);
			}
		}

	}

}
