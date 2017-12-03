package testes;

import java.util.Calendar;

import br.com.multcare.paciente.dao.PacienteDao;
import br.com.multcare.paciente.javabens.Paciente;

public class TestePacienteDaoAlterar {
	public static void main(String[] args){
		Paciente p = new Paciente();
		p.setNascimento(Calendar.getInstance());
		p.setPeso(80.5);
		p.setSexo("M"); 
		p.setNome("Wallace");
		p.setUsuario("UsuarioAluno");
	  
		PacienteDao pd;
		try {
			pd = new PacienteDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pd.altera(p);
		
	}
}
