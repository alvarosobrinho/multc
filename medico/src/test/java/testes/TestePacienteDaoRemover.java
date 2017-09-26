package testes;

import br.com.multcare.paciente.dao.PacienteDao;
import br.com.multcare.paciente.javabens.Paciente;

public class TestePacienteDaoRemover {
	public static void main(String[] args){
		Paciente p = new Paciente();
		p.setUsuario("");
		PacienteDao pd = new PacienteDao();
		pd.remove(p);
		
	}
}
