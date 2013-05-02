package br.com.ufc.biblioteca.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.ufc.biblioteca.dao.PalavrachaveDao;
import br.com.ufc.biblioteca.modelo.Palavrachave;

@Resource
public class PalavrachaveController {

	private final PalavrachaveDao dao;
	private final Result result;

	public PalavrachaveController(PalavrachaveDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	public List<Palavrachave> lista(){
		return dao.listaTudo();
	}
	
	public Palavrachave edita(Long id){
		return dao.carrega(id);
	}
	
	public void altera(Palavrachave palavra){
		dao.atualiza(palavra);
		result.redirectTo(this).lista();
	}
	
	public void adiciona(Palavrachave palavra){
		dao.salva(palavra);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id){
		Palavrachave palavra = dao.carrega(id);
		dao.remove(palavra);
		result.redirectTo(this).lista();
	}
	
	public void formulario(){
	}
	
}
