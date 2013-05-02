package br.com.ufc.biblioteca.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.ufc.biblioteca.infra.CriadorDeSession;
import br.com.ufc.biblioteca.modelo.Palavrachave;

@Component
public class PalavrachaveDao {

	public final Session session;
	
	public PalavrachaveDao(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Palavrachave palavra){
		Transaction tx = session.beginTransaction();
		session.save(palavra);
		tx.commit();
	}

	public List<Palavrachave> listaTudo(){
		return this.session.createCriteria(Palavrachave.class).list();
	}
	
	public Palavrachave carrega(Long id){
		return (Palavrachave) this.session.load(Palavrachave.class, id);
	}
	
	public void atualiza(Palavrachave palavra){
		Transaction tx= session.beginTransaction();
		session.update(palavra);
		tx.commit();
	}
	
	public void remove(Palavrachave palavra){
		Transaction tx = session.beginTransaction();
		session.delete(palavra);
		tx.commit();
	}
	
}
