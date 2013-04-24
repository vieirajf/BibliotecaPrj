package br.com.ufc.biblioteca.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ufc.biblioteca.infra.CriadorDeSession;
import br.com.ufc.biblioteca.modelo.PalavraChave;

public class PalavraChaveDao {

	public final Session session;
	
	public PalavraChaveDao(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(PalavraChave palavra){
		Transaction tx = session.beginTransaction();
		session.save(palavra);
		tx.commit();
	}

	public List<PalavraChave> listaTudo(){
		return this.session.createCriteria(PalavraChave.class).list();
	}
	
	public PalavraChave carrega(Long id){
		return (PalavraChave) this.session.load(PalavraChave.class, id);
	}
	
	public void atualiza(PalavraChave palavra){
		Transaction tx= session.beginTransaction();
		session.update(palavra);
		tx.commit();
	}
	
	public void remove(PalavraChave palavra){
		Transaction tx = session.beginTransaction();
		session.delete(palavra);
		tx.commit();
	}
	
}
