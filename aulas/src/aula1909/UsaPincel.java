package aula1909;

public class UsaPincel {

	public static void main(String[] args) {
		
		Pincel p; // reserva espaço para armazenar um objeto Pincel no disco rígido
		//p.cor = "Verde"; -> erro, o objeto nao foi criado ainda, o p está sendo apenas um espaço reservado
		p = new Pincel(); // cria o objeto e atribui valores iniciais
		p.cor = "Verde";
		Pincel pincel = new Pincel();
		pincel.cor = "azul";
		pincel.preco = 19.99;
		pincel.tamanho = 12;
		
	
	}

}
