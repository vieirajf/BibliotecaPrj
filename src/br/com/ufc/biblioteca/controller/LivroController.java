package br.com.ufc.biblioteca.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.ufc.biblioteca.dao.LivroDao;
import br.com.ufc.biblioteca.modelo.Livro;

@Resource
public class LivroController {

	private final LivroDao dao;
	private final Result result;
	
	public LivroController(LivroDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	public List<Livro> lista(){
		return dao.listaTudo();
	}
	
	public Livro edita(Long id){
		return dao.carrega(id);
	}
	
	public void altera(Livro livro){
		dao.atualiza(livro);
		result.redirectTo(this).lista();
	}
	
	public void adiciona(Livro livro){
		dao.salva(livro);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id){
		Livro livro = dao.carrega(id);
		dao.remove(livro);
		result.redirectTo(this).lista();
	}
	
	public void formulario(){
	}
	
}
