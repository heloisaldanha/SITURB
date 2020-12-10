package br.ufrn.imd.controllers;

/**
 * Controller para cadastrar os cobradores no sistema
 * @author heloisasaldanha
 */

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.ufrn.imd.model.Cobrador;

@SessionScoped
@ManagedBean(name = "Cobrador")
public class CadastrarCobradorMBean {
	// cobrador, lista de cobradores, criar lista de cobrador, entrar no cadastro, voltar, cadastrar cobrador
	private Cobrador cobrador;
	private List<Cobrador> cobradores;
	
	public CadastrarCobradorMBean() {
		cobrador = new Cobrador();
		cobradores = new ArrayList<Cobrador>();
	}
	
	public String entrarCadastro() {
		return "/form_cobrador.xhtml";
	}
	
	public String voltar() {
		return "/index.xhtml";
	}
	
	public String cadastrar() {
		cobradores.add(cobrador);
		cobrador = new Cobrador();
		FacesMessage msg = new FacesMessage("Cobrador cadastrado com sucesso!");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage("", msg);
		return "/form_cobrador.xhtml";
	}

	public Cobrador getCobrador() {
		return cobrador;
	}

	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}

	public List<Cobrador> getCobradores() {
		return cobradores;
	}

	public void setCobradores(List<Cobrador> cobradores) {
		this.cobradores = cobradores;
	}
	
	
	
}
