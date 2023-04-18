 package com.generation.blogpessoal1.model; //faz interção e modela dados 
 
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens") /*CREATE TABLE tb_postagens*/
public class Postagem {
    
    @Id // o atributo pra definir primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento
    private Long id;
    
    @NotBlank(message = "O atributo ttítulo é obrigatório!") // notblank impede espaço em branco,exclusivo para string
    @Size(min = 5, max = 100, message = "O atributo título deve ter no mínimo 05 e no máximo 100 caracteres.")
    private String titulo;
    
    @NotBlank(message = "O atributo texto é obrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo texto deve ter no mínimo 10 e no máximo 1000 caracteres.")
    private String texto;
    
    @UpdateTimestamp //funçao pra hora está sempre atualizada
    private LocalDateTime data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}