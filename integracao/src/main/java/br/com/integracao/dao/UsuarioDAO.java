package br.com.integracao.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.integracao.modelo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	Usuario findByEmailAndSenha(String email, String senha);
}
	