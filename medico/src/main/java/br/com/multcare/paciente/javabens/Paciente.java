package br.com.multcare.paciente.javabens;

import java.util.Calendar;

public class Paciente {
	private String nome;
	private Calendar nascimento;
	private double peso;
	private String sexo;
	private String usuario;
	private String senha;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public void setPeso(double p){
		this.peso = p;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
