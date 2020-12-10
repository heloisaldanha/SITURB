package br.ufrn.imd.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

/**
 * Controller para cadastrar as linhas de ônibus
 * @author heloisasaldanha
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.ufrn.imd.model.Linha;

@SessionScoped
@ManagedBean(name = "Linha")
public class CadastrarLinhaMBean {
	// linha classe, linhas lista, construtor, entrar no cadastro, voltar, cadastrar
	private Linha linha;
	private List<Linha> linhas;
	
	public CadastrarLinhaMBean() {
		linha = new Linha();
		linhas = new ArrayList<Linha>();
	}
	
	public String entrarCadastro() {
		return "/form_linha.xhtml";
	}
	
	public String voltar() {
		return "/index.xhtml";
	}
	
	public String cadastrar() {
		linhas.add(linha);
		linha = new Linha();
		FacesMessage msg = new FacesMessage("Linha cadastrada com sucesso!");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage("", msg);
		return "/form_linha.xhtml";
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	public List<Linha> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<Linha> linhas) {
		this.linhas = linhas;
	}
	
	
}