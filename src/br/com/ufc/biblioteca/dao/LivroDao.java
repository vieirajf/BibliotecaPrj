package br.com.ufc.biblioteca.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.ufc.biblioteca.infra.CriadorDeSession;
import br.com.ufc.biblioteca.modelo.Livro;

@Component
public class LivroDao {

	private final Session session;
	
	public LivroDao(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Livro livro){
		Transaction tx = session.beginTransaction();
		session.save(livro);
		tx.commit();
	}
	
	public List<Livro> listaTudo(){
		return this.session.createCriteria(Livro.class).list();
	}
	
	public Livro carrega(Long id){
		return (Livro) this.session.load(Livro.class, id);
	}
	
	public void atualiza(Livro livro) {
		Transaction tx = session.beginTransaction();
		this.session.update(livro);
		tx.commit();
	}
	
	public void remove(Livro livro){
		Transaction tx = session.beginTransaction();
		this.session.delete(livro);
		tx.commit();
	}
	
}
