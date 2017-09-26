package testes;

import java.util.Calendar;

import br.com.multcare.paciente.dao.PacienteDao;
import br.com.multcare.paciente.javabens.Paciente;

public class TestePacienteDaoAdicionar {
	public static void main(String[] args){
		Paciente p = new Paciente();
		p.setNome("Emmanuel");
		p.setNascimento(Calendar.getInstance());
		p.setPeso(80.0);
		p.setSexo("M");
		p.setUsuario("Emannuel");
		p.setSenha("1234");
		
		PacienteDao pd;
		try {
			pd = new PacienteDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pd.adiciona(p);
		
	}
}
