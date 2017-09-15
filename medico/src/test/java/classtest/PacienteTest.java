package classtest;
import java.util.ArrayList;
public class PacienteTest {
	String nome;
	ArrayList<String> doenca = new ArrayList<String>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void  addDoenca(String doenca){
		this.doenca.add(doenca);
	}
}
