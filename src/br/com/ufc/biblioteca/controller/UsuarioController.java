package br.com.ufc.biblioteca.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.ufc.biblioteca.dao.UsuarioDao;
import br.com.ufc.biblioteca.modelo.Usuario;

@Resource
public class UsuarioController {

	private final UsuarioDao dao;
	private final Result result;
	
	public UsuarioController(UsuarioDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	public List<Usuario> lista(){
		return dao.listaTudo();
	}
	
	public Usuario edita(Long id){
		return dao.carrega(id);
	}
	
	public void altera(Usuario usuario){
		dao.atualiza(usuario);
		result.redirectTo(this).lista();
	}
	
	public void adiciona(Usuario usuario){
		dao.salva(usuario);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id){
		Usuario usuario = dao.carrega(id);
		dao.remove(usuario);
		result.redirectTo(this).lista();
	}
	
	public void formulario(){
	}
	
}
