package br.com.ufc.biblioteca.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.ufc.biblioteca.dao.AutorDao;
import br.com.ufc.biblioteca.modelo.Autor;

@Resource
public class AutorController {

	private final AutorDao dao;
	private final Result result;

	public AutorController(AutorDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	

	public List<Autor> lista(){
		return dao.listaTudo();
	}
	
	public Autor edita(Long id){
		return dao.carrega(id);
	}
	
	public void altera(Autor autor){
		dao.atualiza(autor);
		result.redirectTo(this).lista();
	}
	
	public void adiciona(Autor autor){
		dao.salva(autor);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id){
		Autor autor = dao.carrega(id);
		dao.remove(autor);
		result.redirectTo(this).lista();
	}
	
	public void formulario(){
	}
	
}
