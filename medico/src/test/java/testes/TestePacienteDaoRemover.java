package testes;

import br.com.multcare.paciente.dao.PacienteDao;
import br.com.multcare.paciente.javabens.Paciente;

public class TestePacienteDaoRemover {
	public static void main(String[] args){
		Paciente p = new Paciente();
		p.setUsuario("");
		PacienteDao pd;
		try {
			pd = new PacienteDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pd.remove(p);
		
	}
}
