package testes;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.multcare.medico.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta!");
		connection.close();
	}

}
