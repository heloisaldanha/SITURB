package br.ufrn.imd.model;


/**
 * Classe que representa a entidade ônibus.
 * Um ônibus tem um motorista, um cobrador, uma linha e pertence a uma empresa.
 * @author heloisasaldanha
 *
 */
public class Onibus {
	
	// marca, modelo e ano
	
	private String marca;
	private String modelo;
	private int ano;
	private Empresa empresa;
	private Linha linha;
	private Cobrador cobrador;
	private Motorista motorista;
	
	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Linha getLinha() {
		return linha;
	}
	
	public void setLinha(Linha linha) {
		this.linha = linha;
	}
	
	public Cobrador getCobrador() {
		return cobrador;
	}
	
	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}
	
	public Motorista getMotorista() {
		return motorista;
	}
	
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
}
