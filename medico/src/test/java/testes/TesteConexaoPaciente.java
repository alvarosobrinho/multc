package testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.multcare.factory.ConnectionFactory;

public class TesteConexaoPaciente {
	public static void main(String[] args) throws SQLException{
		 Connection connection = new ConnectionFactory().getConnection();
		 System.out.println("Conexao aberta!");
		 connection.close();
	}
}
