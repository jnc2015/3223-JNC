package br.edu.ifms.tads.dbf2.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import br.edu.esab.util.HibernateUtil;
import br.edu.ifms.tads.dbf2.dao.PessoaDAO;
import br.edu.ifms.tads.dbf2.model.Pessoa;

@ManagedBean
@SessionScoped
public class TesteMB {
	private Pessoa pessoa = new Pessoa();
	
	public void salvar(){
	
		PessoaDAO p2 = new PessoaDAO();
		p2.salvar(pessoa);
		this.pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

}
