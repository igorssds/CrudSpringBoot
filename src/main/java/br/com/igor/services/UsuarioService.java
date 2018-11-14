package br.com.igor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igor.domain.Usuario;
import br.com.igor.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
	
		
		return obj.orElse(null);
	}
	
	public Usuario insert(Usuario obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		
		repository.deleteById(id);
	}
	
	public Usuario update(Usuario obj) {
		
		repository.findById(obj.getId());
		
		return repository.save(obj);
		
	}
}
