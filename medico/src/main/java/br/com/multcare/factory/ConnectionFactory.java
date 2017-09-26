package br.com.multcare.factory;
import java.sql.*;

public class ConnectionFactory {
	public Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/multicare", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
