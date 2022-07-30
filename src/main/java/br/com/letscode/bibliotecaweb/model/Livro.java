package br.com.letscode.bibliotecaweb.model;

import lombok.Data;
import lombok.ToString;

@Data
public class Livro {

    private String nome;

    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }
}
