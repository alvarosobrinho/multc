package testes;

import br.com.multicare.medico.dao.MedicoDao;
import br.com.multicare.medico.javabeans.Medico;

public class AddTest {

	public static void main(String[] args) {
		
		Medico medico = new Medico();
		medico.setCrm("111");
		medico.setCpf("222");
		medico.setEmail("as@multicare.com");
		medico.setEndereco("ufal");
		medico.setNome("bob");
		try{
	 		MedicoDao dao = new MedicoDao();
	 		dao.adicionar(medico);
	 		System.out.println("adicionado.");
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
