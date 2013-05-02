package br.com.ufc.biblioteca.teste;

import br.com.ufc.biblioteca.dao.AutorDao;
import br.com.ufc.biblioteca.dao.LivroDao;
import br.com.ufc.biblioteca.modelo.Autor;
import br.com.ufc.biblioteca.modelo.Livro;

public class AdicaoAutor {

	public static void main(String[] args) {
		
		Autor autor = criaAutor();

		new AutorDao().salva(autor);
		
	}
	
	private static Autor criaAutor() {
		Autor autor = new Autor();
		autor.setNome("Teste");
		return autor;
	}
	
	
}
