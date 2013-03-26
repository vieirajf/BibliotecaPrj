package br.com.ufc.biblioteca.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.ufc.biblioteca.infra.CriadorDeSession;
import br.com.ufc.biblioteca.modelo.Usuario;

@Component
public class UsuarioDao {

	private final Session session;
	
	public UsuarioDao(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		session.save(usuario);
		tx.commit();
	}
	
	public List<Usuario> listaTudo(){
		return this.session.createCriteria(Usuario.class).list();
	}

	public Usuario carrega(Long id) {
		return (Usuario) this.session.load(Usuario.class, id);
	}

	public void atualiza(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		this.session.update(usuario);
		tx.commit();
	}

	public void remove(Usuario usuario) {
		Transaction tx = session.beginTransaction();
		this.session.delete(usuario);
		tx.commit();
	}

}
