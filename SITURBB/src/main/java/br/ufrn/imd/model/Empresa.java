package br.ufrn.imd.model;

public class Empresa {
	private String cnpj;
	private String razaoSocial;
	
	
	
	public String getCnpj() {
		return cnpj;
		
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
		
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
		
	}
	
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		
	}
	
	
	
	@Override
	public String toString() {
		return razaoSocial;
	}
}
