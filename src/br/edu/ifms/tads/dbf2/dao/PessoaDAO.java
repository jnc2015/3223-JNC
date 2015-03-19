package br.edu.ifms.tads.dbf2.dao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import br.edu.esab.util.HibernateUtil;
import br.edu.ifms.tads.dbf2.model.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaDAO {

	
		
		public void salvar(Pessoa pessoa){
			
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			session.beginTransaction();
			
			session.save(pessoa);
			
			session.getTransaction().commit();
		}



}
