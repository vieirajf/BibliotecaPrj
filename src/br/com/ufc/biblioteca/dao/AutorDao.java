package br.com.ufc.biblioteca.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.ufc.biblioteca.infra.CriadorDeSession;
import br.com.ufc.biblioteca.modelo.Autor;

@Component
public class AutorDao {

	public final Session session;
	
	public AutorDao(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Autor autor){
		Transaction tx = session.beginTransaction();
		session.save(autor);
		tx.commit();
	}
	
	public List<Autor> listaTudo(){
		return this.session.createCriteria(Autor.class).list();
	}
	
	public Autor carrega(Long id){
		return (Autor) this.session.load(Autor.class, id);
	}
	
	public void atualiza(Autor autor){
		Transaction tx = session.beginTransaction();
		session.update(autor);
		tx.commit();
	}
	
	public void remove(Autor autor){
		Transaction tx = session.beginTransaction();
		session.delete(autor);
		tx.commit();
	}
	
}
