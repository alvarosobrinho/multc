package br.com.multcare.paciente.javabens;

public class Exame {
	private String nome;
	private double valor;
	private String situacao;
	
	public String getNome() {
		return this.nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
		
	public String setSituacao() {
		return this.situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
}
