package aula0711JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {
	public Connection conn = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;
	
	public final String DATABASE = "NOME DA SUA TABELA";
	public final String URL = "URL DO SEU BANCO"+DATABASE;
	public final String LOGIN = "SEU USUARIO POSTGRES";
	public final String PASS = "SENHA DO SEU POSTGRES";
	
	/**
	 * Realiza a conexão com o banco de dados
	 * @return - true em caso de sucesso, ou false caso contrário
	 */
	public boolean getConnection() {
		try {
			conn = DriverManager.getConnection(URL,LOGIN,PASS);
			System.out.println("Conectou...");
			return true;
		}catch(SQLException erro){
			System.out.println("Deu ruim mermao: "+erro);
			return false;
		}
	}
	
	/**
	 * Fecha a conexão com o banco de dados
	 */
	public void close() {
		try {
			if(rs!=null) rs.close();
		}
		catch(SQLException e) {
			return;
		}
		try {
			if(st!=null) st.close();
		}
		catch(SQLException e) {
			return;
		}try {
			if(conn!=null) {
				System.out.println("Desconectou...");
				conn.close();
			}
		}
		catch(SQLException e) {
			return;
		}
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		bd.close();
	}
}
