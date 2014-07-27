package br.com.webcontato.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String url = "jdbc:postgresql://localhost:5432/dbprojeto";
	private static final String user = "baquino";
	private static final String senha = "qwe123";
	
	public static Connection getConnection(){
		try {
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			System.out.println("Sistema Conectado com Sucesso!");
			return DriverManager.getConnection(url, user, senha);
		} catch (SQLException e) {
			System.out.println("Falha na conexão com o banco de dados!");
			throw new RuntimeException(e);
		}
	}

}
