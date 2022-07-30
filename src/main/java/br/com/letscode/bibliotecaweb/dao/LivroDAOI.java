package br.com.letscode.bibliotecaweb.dao;

import br.com.letscode.bibliotecaweb.model.Livro;

import java.util.List;

public interface LivroDAOI {
    Livro save(Livro cliente);

    List<Livro> findAll();
}
