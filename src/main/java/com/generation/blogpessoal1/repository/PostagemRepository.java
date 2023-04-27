package com.generation.blogpessoal1.repository; // é uma interface de consulta 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal1.model.Postagem;

public interface PostagemRepository  extends JpaRepository<Postagem, Long>{
	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo); //definir metodo de consulta / paremetro titulo , do tipo string guardaado na variavel titulo
   // select * from tb_postagens WHERE titulo like "%titulo%";

}
