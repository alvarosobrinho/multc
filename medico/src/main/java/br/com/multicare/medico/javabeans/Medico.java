package br.com.multicare.medico.javabeans;

public class Medico {
	private String crm;
	private String cpf;	
	private String email;
	private String endereco;
	private String nome;
	private String senha;
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	public String getSenha(){
		return senha;
	}
}
