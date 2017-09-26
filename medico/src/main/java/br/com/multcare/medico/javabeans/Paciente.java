package br.com.multcare.medico.javabeans;

import java.util.ArrayList;

public class Paciente {
	private String nome;
	private String endereco;
	private String doencaatu; //doen�a atual.
	private String doencapas; //doen�a passada.
	private ArrayList<String> medicamentos = new ArrayList<String>();
	private ArrayList<String> alergias = new ArrayList<String>();
	private String hisso; //hist�rico social
	private String exames; //
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDoencaatu() {
		return doencaatu;
	}
	public void setDoencaatu(String doencaatu) {
		this.doencaatu = doencaatu;
	}
	public String getDoencapas() {
		return doencapas;
	}
	public void setDoencapas(String doencapas) {
		this.doencapas = doencapas;
	}
	public ArrayList<String> getMedicamentos() {
		return medicamentos;
	}
	public void addMedicamentos(String medicamento) {
		medicamentos.add(medicamento);
	}
	public ArrayList<String> getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergia) {
		alergias.add(alergia);
	}
	public String getHisso() {
		return hisso;
	}
	public void setHisso(String hisso) {
		this.hisso = hisso;
	}
	public String getExames() {
		return exames;
	}
	public void setExames(String exames) {
		this.exames = exames;
	}
	
}
