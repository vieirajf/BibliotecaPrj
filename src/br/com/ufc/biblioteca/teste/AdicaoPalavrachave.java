package br.com.ufc.biblioteca.teste;

import br.com.ufc.biblioteca.dao.AutorDao;
import br.com.ufc.biblioteca.dao.PalavrachaveDao;
import br.com.ufc.biblioteca.modelo.Autor;
import br.com.ufc.biblioteca.modelo.Palavrachave;

public class AdicaoPalavrachave {

public static void main(String[] args) {
		
		Palavrachave palavra = criaPalavra();

		new PalavrachaveDao().salva(palavra);
		
	}
	
	private static Palavrachave criaPalavra() {
		Palavrachave palavra = new Palavrachave();
		palavra.setPalavra("Tecnologia da Informação");
		return palavra;
	}
	
}
