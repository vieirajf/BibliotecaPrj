package br.com.ufc.biblioteca.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {

	@Id @GeneratedValue
	@Column(name="id")
	private Long id;
	private String matricula;
	private String nome;
	private String email;
	private String curso;
	private String tipo;

	
	@ManyToMany
	@JoinTable(name="usuario_livro", joinColumns={@JoinColumn(name="id_livro", unique=false,  nullable=false, insertable=true)},
	   inverseJoinColumns={@JoinColumn(name="id_usuario",unique=false,  nullable=false, insertable=true)})
	private Collection<Livro> livro = new ArrayList<Livro>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
