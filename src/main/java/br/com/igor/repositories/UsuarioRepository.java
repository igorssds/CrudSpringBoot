package br.com.igor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igor.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
