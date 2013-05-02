package br.com.ufc.biblioteca.teste;

import org.hibernate.Session;

import br.com.ufc.biblioteca.dao.UsuarioDao;
import br.com.ufc.biblioteca.infra.CriadorDeSession;
import br.com.ufc.biblioteca.modelo.Usuario;

public class AdicaoUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = criaUsuario();
		
		new UsuarioDao().salva(usuario);
		
	}

	private static Usuario criaUsuario() {
		Usuario usuario = new Usuario();
		usuario.setMatricula("0342338");
		usuario.setCurso("SI");
		usuario.setEmail("teste@hotmail.com");
		usuario.setNome("Teste");
		usuario.setTipo("Aluno");
		return usuario;
	}
	
}