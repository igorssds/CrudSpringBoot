package br.com.igor.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull @Size(min = 3 , message = "O nome deve ter no minimo 4 caracteres")
	private String nome;
	@Email @NotNull
	private String email;
	@NotNull @Size(min = 3 , max = 10 , message = "A senha deve ter entre 3 e 10 caracteres")
	private String senha;
	
	public Usuario() {
	}

	public Usuario(Integer id, @NotNull @Size(min = 3, message = "O campo deve ter no minimo 4 caracteres") String nome,
			@Email @NotNull String email,
			@NotNull @Size(min = 3, max = 10, message = "O campo deve ter entre 3 e 10 caracteres") String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
