package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	
abstract public class ConnectionFactory {
		
		//identificando o banco
		private static String url = "jdbc:mysql://localhost:3306/testeTcc";
		//login de usuario no banco
		private static String usuario = "root";
		//senha do usuario no banco
		private static String senha = "root";
		
		public static Connection getConnection() throws SQLException{
			Connection conexao = null;
			//Solicita a conexão
			conexao = DriverManager.getConnection(url, usuario, senha);
			return conexao;
		}

}