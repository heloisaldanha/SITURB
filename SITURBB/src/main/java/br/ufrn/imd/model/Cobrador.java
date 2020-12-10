package br.ufrn.imd.model;

/**
 * Classe que representa o cobrador do ônibus
 * @author heloisasaldanha
 *
 */

public class Cobrador {
	// nome, matrícula, cpf e endereço
	private String nome;
	private String matricula;
	private String cpf;
	private String endereco;
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	
	
}
