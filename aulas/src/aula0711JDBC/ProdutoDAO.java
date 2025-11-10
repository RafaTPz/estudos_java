package aula0711JDBC;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO extends Produto{
	public List<Produto> lista = new ArrayList<Produto>();

	/**
	 * Remove um produto do banco de dados
	 * @return mensagem de sucesso ou falha
	 */
	public String excluir() {
		String action = "Produto excluido com sucesso!";
		BD bd = new BD();
		bd.getConnection();
		String sql = "delete from produtos where codigo = ?";
		try {
			bd.st = bd.conn.prepareStatement(sql);
			bd.st.setInt(1, getCodigo());			
			int linhasAfetadas = bd.st.executeUpdate();
			if(linhasAfetadas == 0) action = "Nenhum produto foi excluido";
		}catch(SQLException e) {
			action = "Falha na exclusão do produto: " + e;
		}finally {
			bd.close();
		}
		return action;
	}

	/**
	 * Altera um produto no banco de dados para o estado atual de produto
	 * @return mensagem de sucesso ou falha
	 */
	public String alterar() {
		String action = "Produto alterado com sucesso!";
		BD bd = new BD();
		bd.getConnection();
		String sql = "update produtos set nome = ?, qtdeEstoque = ?, preco = ? where codigo = ?";
		try {
			bd.st = bd.conn.prepareStatement(sql);
			bd.st.setString(1, getNome());
			bd.st.setInt(2,getQtdeEstoque());
			bd.st.setDouble(3, getPreco());
			bd.st.setInt(4, getCodigo());			
			int linhasAfetadas = bd.st.executeUpdate();
			if(linhasAfetadas == 0) action = "Nenhum produto foi alterado";
		}catch(SQLException e) {
			action = "Falha na alteração do produto: " + e;
		}finally {
			bd.close();
		}
		return action;
	}



	/**
	 * Insere no banco de dados o estado atual de produto
	 * Antes de realizar a inclusão o produto deve estar preenchido
	 * @return mensagem de sucesso ou falha
	 */
	public String inserir() {
		String action = "Produto inserido com sucesso!";
		BD bd = new BD();
		bd.getConnection();
		String sql = "insert into produtos(codigo,nome,qtdeEstoque,preco) values(?,?,?,?)";
		try {
			bd.st = bd.conn.prepareStatement(sql);
			bd.st.setInt(1, getCodigo());
			bd.st.setString(2, getNome());
			bd.st.setInt(3,getQtdeEstoque());
			bd.st.setDouble(4, getPreco());

			bd.st.executeUpdate();
		}catch(SQLException e) {
			action = "Falha na inclusão do produto: " + e;
		}finally {
			bd.close();
		}
		return action;
	}

	/**
	 * Retorna uma lista contendo todos os produtos registrados na tabela
	 * @return lista de produtos
	 */
	public List<Produto> getAll(){
		BD bd = new BD();
		bd.getConnection();
		String sql = "select * from produtos";
		try {
			bd.st = bd.conn.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) {
				Produto p = new Produto(bd.rs.getInt("codigo"),bd.rs.getString("nome"),bd.rs.getInt("qtdeEstoque"),bd.rs.getDouble("preco"));
				lista.add(p);
			}
			return lista;
		}catch(SQLException e){
			return null;
		}finally {
			bd.close();
		}
	}

	/**
	 * Cria um arquivo .csv contendo todos os produtos registrados na tabela
	 * @return mensagem de sucesso ou falha
	 */
	public String toCSV(){
		String action = "Arquivo gerado com sucesso";
		BD bd = new BD();
		bd.getConnection();
		String sql = "select * from produtos";
		try {
			PrintWriter pw = new PrintWriter("produtos.csv");
			bd.st = bd.conn.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) {
				pw.print(bd.rs.getInt(1)+";");
				pw.print(bd.rs.getString(2)+";");
				pw.print(bd.rs.getInt(3)+";");
				pw.print(bd.rs.getDouble(4)+"\n");
			}
			pw.close();
		}catch(Exception e){
			action = "Falha ao gerar o arquivo .CSV";
		}
		finally {
			bd.close();
		}
		return action;
	}		
}
