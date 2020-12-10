package br.ufrn.imd.controllers;

/**
 * Controller para cadastro dos motoristas de ônibus
 * @author heloisasaldanha
 */

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.ufrn.imd.model.Motorista;

@SessionScoped
@ManagedBean(name = "Motorista")
public class CadastrarMotoristaMBean {
// herda classe motorista, lista de motoristas, construtor com as list e array, entrar cadastro, voltar, cadastrar
	private Motorista motorista;
	private List<Motorista> motoristas;
	
	public CadastrarMotoristaMBean() {
		motorista = new Motorista();
		motoristas = new ArrayList<Motorista>();
	}
	
	public String entrarCadastro() {
		return "/form_motorista.xhtml";
	}
	
	public String voltar() {
		return "/index.xhtml";
	}
	
	public String cadastrar() {
		motoristas.add(motorista);
		motorista = new Motorista();
		FacesMessage msg = new FacesMessage("Motorista cadastrado com sucesso!");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage("", msg);
		return "/form_motorista.xhtml";
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public List<Motorista> getMotoristas() {
		return motoristas;
	}

	public void setMotoristas(List<Motorista> motoristas) {
		this.motoristas = motoristas;
	}
	
	
	
}
