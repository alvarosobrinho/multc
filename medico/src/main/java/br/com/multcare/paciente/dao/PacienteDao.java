package br.com.multcare.paciente.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.multcare.paciente.javabens.Paciente;

public class PacienteDao {
	private Connection connection;
	public PacienteDao(){ 
	this.connection = new ConnectionFactory().getConnection();
	}
   
	public void adiciona(Paciente paciente){ 
		String sql = "insert into paciente (nome, nascimento, sexo, peso, usuario, senha) values (?, ?, ?, ?, ?, ?)";
	   try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, paciente.getNome());
		stmt.setDate(2, new Date(paciente.getNascimento().getTimeInMillis()));
		stmt.setString(3, paciente.getSexo());
		stmt.setDouble(4, paciente.getPeso());
		stmt.setString(5, paciente.getUsuario());
		stmt.setString(6, paciente.getSenha());
		stmt.execute();
		stmt.close();
		
	} catch (SQLException e) {
		 throw new RuntimeException(e);
	}
	}
	
	public void alterna(Paciente paciente) {
		String sql = "update paciente set nascimento=?, sexo=?, peso=?, nome=? where usuario=?";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
	
			stmt.setDate(1, new Date(
					  paciente.getNascimento().getTimeInMillis()));
			stmt.setString(2, paciente.getSexo());
			stmt.setDouble(3, paciente.getPeso());
			stmt.setString(4, paciente.getNome());	
			stmt.setString(5, paciente.getUsuario());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}	
	}
	
public void remove(Paciente paciente){
	try {
		PreparedStatement stmt = connection.prepareStatement("delete from paciente where usuario=?");
		stmt.setString(1, paciente.getUsuario());
		stmt.execute();
		stmt.close();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
	
}
