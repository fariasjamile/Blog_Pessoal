package com.generation.blogpessoal1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal1.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
    //SELECT * FROM tb_usuario WHERE usuario = "usuarios";
	public Optional<Usuario> findByUsuario(String usuario);
	
}