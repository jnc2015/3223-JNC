package br.edu.ifms.tads.dbf2.web;

import org.hibernate.Session;

import br.edu.esab.util.HibernateUtil;
import br.edu.ifms.tads.dbf2.model.Pessoa;

public class TesteHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		
		p1.setId(6);
		p1.setNome("Jose");
		p1.setRg(071);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.save(p1);
		
		session.getTransaction().commit();

	}

}
