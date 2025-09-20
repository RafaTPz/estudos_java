package aula1909;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Arquivo {

	public static void main(String[] args) {
		gravar();
		try {
			salvar();
		}catch(FileNotFoundException e){

		}
	}
	public static void gravar() { // try catch
		try {
			PrintWriter pw = new PrintWriter("ar.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public static void salvar() throws FileNotFoundException{ //throws

		PrintWriter pw = new PrintWriter("ar.txt");	
	}
}
