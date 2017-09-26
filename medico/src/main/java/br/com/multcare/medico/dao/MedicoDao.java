package br.com.multcare.medico.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.multcare.medico.factory.ConnectionFactory;
import br.com.multcare.medico.javabeans.Medico;
public class MedicoDao {
	private Connection connection;
	
	public MedicoDao() throws ClassNotFoundException{
		this.connection = new ConnectionFactory().getConnection(); 
	}
	
	public void adicionar(Medico medico){
		String sql = "insert into medico " + "(nome,email,endereco,crm,cpf,senha)" + " values (?,?,?,?,?,?)";
		try {
	         
	         PreparedStatement stmt = connection.prepareStatement(sql);
	         
	         stmt.setString(1,medico.getNome());
	         stmt.setString(2,medico.getEmail());
	         stmt.setString(3,medico.getEndereco());
	         stmt.setString(4,medico.getCrm());
	         stmt.setString(5,medico.getCpf());
	         stmt.setString(6,medico.getSenha());
	         
	         stmt.execute();
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
	public void altera(Medico medico) {
	     String sql = "update medico set nome=?, email=?, endereco=?," + "cpf=? where id=?";
	     try {
	         PreparedStatement stmt = connection.prepareStatement(sql);
	         stmt.setString(1, medico.getNome());
	         stmt.setString(2, medico.getEmail());
	         stmt.setString(3, medico.getEndereco());
	         stmt.setString(4, medico.getCpf());
	         stmt.setString(5, medico.getCrm());
	         stmt.execute();
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	public void remove(Medico medico) {
	     try {
	         PreparedStatement stmt = connection.prepareStatement("delete" + "from medico where id=?");
	         stmt.setString(1, medico.getCrm());
	         stmt.execute();
	         stmt.close();
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	public List<Medico> getLista(){
		try {
	         List<Medico> medicos = new ArrayList<Medico>();
	         PreparedStatement stmt = this.connection.prepareStatement("select * from medico");
	         ResultSet rs = stmt.executeQuery();
	 
	         while (rs.next()) {
	             Medico medico = new Medico();
	             medico.setCrm(rs.getString("crm"));
	             medico.setCpf(rs.getString("cpf"));
	             medico.setEndereco(rs.getString("endereco"));
	             medico.setNome(rs.getString("nome"));
	             medico.setEmail(rs.getString("email"));
	             medicos.add(medico);
	         }
	         rs.close();
	         stmt.close();
	         return medicos;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}
}
