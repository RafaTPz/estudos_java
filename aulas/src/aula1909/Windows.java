package aula1909;

public class Windows {

	public synchronized static void main(String[] args) {
		Word01 w1 = new Word01();
		Word02 w2 = new Word02();
		
		w1.start();
		w2.start();

	}

}
