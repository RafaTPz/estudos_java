package aula0711JDBC;

import java.util.List;

public class ProdutoListar {
	public static void main(String[] args) {
		//BD bd = new BD();
		//if(bd.getConnection()){
		//	String sql = "select * from produtos";
		//	try {
		//		bd.st = bd.conn.prepareStatement(sql);
		//		bd.rs = bd.st.executeQuery();
		//		while(bd.rs.next()) {
		//			Produto p = new Produto(bd.rs.getInt("codigo"),bd.rs.getString("nome"),bd.rs.getInt("qtdeEstoque"),bd.rs.getDouble("preco"));
		//			System.out.println(p.toString());
		//		}
		//	}catch(SQLException e){
		//		System.out.println("Deu erro: " + e);
		//	}finally {
		//		bd.close();
		//	}
		//
		//}else {
		//	System.out.println("Sem conexão com a rede, volte mais tarde.");
		//}
		
		ProdutoDAO dao = new ProdutoDAO();
		//dao.setCodigo(5);
		//dao.setNome("Ypê sabão");
		//dao.setQtdeEstoque(12);
		//dao.setPreco(11.50);
		//System.out.println(dao.inserir());
		//System.out.println(dao.alterar());
		System.out.println(dao.toCSV());
		//List<Produto> lista = dao.getAll();
		//for(Produto p: lista) {
		//	System.out.println(p);
		//}

	}
}

