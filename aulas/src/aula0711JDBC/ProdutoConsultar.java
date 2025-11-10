package aula0711JDBC;

import java.sql.SQLException;

public class ProdutoConsultar {

	public static void main(String[] args) {

		//lerTodos();
		lerComFiltroDeNome("S");
	}


	private static void lerComFiltroDeNome(String argumentoRecebido) {
		BD bd = new BD();
		if(bd.getConnection()){
			String sql = "select * from produtos where nome like ?";
			try {
				bd.st = bd.conn.prepareStatement(sql);
				bd.st.setString(1, "%"+argumentoRecebido+"%");
				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
					System.out.println(bd.rs.getInt(1));
					System.out.println(bd.rs.getString(2));
					System.out.println(bd.rs.getInt(3));
					System.out.println(bd.rs.getDouble(4));
				}
			}catch(SQLException e){
				System.out.println("Deu erro: " + e);
			}finally {
				bd.close();
			}

		}else {
			System.out.println("Sem conexão com a rede, volte mais tarde.");
		}

	}


	private static void lerTodos() {
		BD bd = new BD();
		if(bd.getConnection()){
			String sql = "select * from produtos";
			try {
				bd.st = bd.conn.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				while(bd.rs.next()) {
					System.out.println(bd.rs.getInt("codigo"));
					System.out.println(bd.rs.getString("nome"));
					System.out.println(bd.rs.getInt("qtdeEstoque"));
					System.out.println(bd.rs.getDouble("preco"));
				}
			}catch(SQLException e){
				System.out.println("Deu erro: " + e);
			}finally {
				bd.close();
			}

		}else {
			System.out.println("Sem conexão com a rede, volte mais tarde.");
		}

	}

}