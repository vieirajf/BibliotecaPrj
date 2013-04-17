package br.com.ufc.biblioteca.teste;

import br.com.ufc.biblioteca.dao.LivroDao;
import br.com.ufc.biblioteca.modelo.Livro;

public class AdicaoLivro {

	public static void main(String[] args) {
	
		Livro livro = criaLivro();

		new LivroDao().salva(livro);
		
	}
	
	private static Livro criaLivro() {
		Livro livro = new Livro();
		livro.setAno(2010);
		livro.setEdicao("Segunda");
		livro.setIdioma("Inglês");
		livro.setTitulo("Estrutura de Dados");
		livro.setIsbn_10("0-684-84328-5");
		return livro;
	}
	
}
