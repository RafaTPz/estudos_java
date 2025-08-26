package aula1508;

public class Lacos {

	public static void main(String[] args) throws InterruptedException {
		for(char a='A'; a<='z';a++) {
			System.out.println(a + " = " + (int)a);
			Thread.sleep(500);
		}
		for(int a =1; a<=3; a++) {
			System.out.println(a);
			Thread.sleep(1000);
		}
		
	}

}
