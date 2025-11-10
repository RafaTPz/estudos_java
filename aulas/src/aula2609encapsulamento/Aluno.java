package aula2609encapsulamento;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//objetos persistentes
public class Aluno implements Serializable{
	public String ra,nome;
	public int idade;



	public static String gravar(Aluno a) {
		String retorno = "Objeto armazenado com sucesso";
		try {
			FileOutputStream fos = new FileOutputStream("aluno.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.flush();
			oos.close();
		}catch(IOException e) {
			retorno = "Falha ao gravar o objeto " + e;
		}
		return retorno;
	}

	//public Aluno ler() {
	//}
}
