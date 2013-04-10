package br.com.ufc.biblioteca.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id @GeneratedValue
	private Long id;
	private String isbn_10;
	private String titulo;
	private String autores;
	private String edicao;
	private int ano;
	private String palavras_chave;
	private String idioma;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIsbn_10() {
		return isbn_10;
	}
	public void setIsbn_10(String isbn_10) {
		this.isbn_10 = isbn_10;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getPalavras_chave() {
		return palavras_chave;
	}
	public void setPalavras_chave(String palavras_chave) {
		this.palavras_chave = palavras_chave;
	}
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
