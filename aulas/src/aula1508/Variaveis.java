package aula1508;

public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte idade = 127;
		int i = 10;
		
		
		System.out.println(i);

		final int MESES_DO_ANO = 12;
		//MESES_DO_ANO = 14;
		// constante em maiúsculo, se precisar usar um valor fixo, criar uma constante(final) com aqle valor
		
		int mesUsuario = 6;
		
		if(mesUsuario > MESES_DO_ANO) {
			
		}
		
		float myFloat = 5.99f;
		double myDouble = 5.99;
		//float é preciso utilizar f para não confundir com double
		char myChar = 'D';
		//tipos primitivos
		//eu só guardo um valor ou leio um valor
		
		String myString = "olaaaaa";
		//tipo não primitivo
		//tem muito mais liverdade para fazer o que quiser, como procurar uma letra, contar quantas letras, etc, alem das funções que estão nas primitivas
		
	}

}
