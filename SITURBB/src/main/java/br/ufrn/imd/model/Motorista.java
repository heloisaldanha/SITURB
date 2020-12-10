package br.ufrn.imd.model;

/**
 * Classe que representa o motorista do ônibus
 * @author heloisasaldanha
 *
 */

public class Motorista extends Cobrador {
	// Cobrador + habilitação (cnh, categoria)
	private String registroCnh;
	private String categoriaCnh;
	
	
	
	public String getRegistroCnh() {
		return registroCnh;
	}
	
	public void setRegistroCnh(String registroCnh) {
		this.registroCnh = registroCnh;
	}
	
	public String getCategoriaCnh() {
		return categoriaCnh;
	}
	
	public void setCategoriaCnh(String categoriaCnh) {
		this.categoriaCnh = categoriaCnh;
	}
	
	
}
