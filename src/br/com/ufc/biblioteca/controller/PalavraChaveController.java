package br.com.ufc.biblioteca.controller;

import java.util.List;

import br.com.caelum.vraptor.Result;
import br.com.ufc.biblioteca.dao.PalavraChaveDao;
import br.com.ufc.biblioteca.modelo.PalavraChave;

public class PalavraChaveController {

	private final PalavraChaveDao dao;
	private final Result result;

	public PalavraChaveController(PalavraChaveDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	public List<PalavraChave> lista(){
		return dao.listaTudo();
	}
	
	public PalavraChave edita(Long id){
		return dao.carrega(id);
	}
	
	public void altera(PalavraChave palavra){
		dao.atualiza(palavra);
		result.redirectTo(this).lista();
	}
	
	public void adiciona(PalavraChave palavra){
		dao.salva(palavra);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id){
		PalavraChave palavra = dao.carrega(id);
		dao.remove(palavra);
		result.redirectTo(this).lista();
	}
	
	public void formulario(){
	}
	
}
