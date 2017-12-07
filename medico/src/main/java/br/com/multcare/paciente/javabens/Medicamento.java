package br.com.multcare.paciente.javabens;
import java.util.Calendar;

public class Medicamento {
	private String nome;
	private Calendar data_inicio;
	private Calendar data_final;
	private String tipo;
	private int quantidade_total;
	private int quantidade_ingestao;
	private int frequencia_hora;
	private int substancia;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Calendar getData_inicio() {
		return data_inicio;
	}
	
	public void setData_inicio(Calendar data_inicio) {
		this.data_inicio = data_inicio;
	}
	
	public Calendar getData_final() {
		return data_final;
	}
	
	public void setData_final(Calendar data_final) {
		this.data_final = data_final;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuantidade_total() {
		return quantidade_total;
	}
	
	public void setQuantidade_total(int quantidade_total) {
		this.quantidade_total = quantidade_total;
	}
	
	public int getQuantidade_ingestao() {
		return quantidade_ingestao;
	}
	
	public void setQuantidade_ingestao(int quantidade_ingestao) {
		this.quantidade_ingestao = quantidade_ingestao;
	}
	
	public int getFrequencia_hora() {
		return frequencia_hora;
	}
	
	public void setFrequencia_hora(int frequencia_hora) {
		this.frequencia_hora = frequencia_hora;
	}
	
	public int getSubstancia() {
		return substancia;
	}
	
	public void setSubstancia(int substancia) {
		this.substancia = substancia;
	}
}
