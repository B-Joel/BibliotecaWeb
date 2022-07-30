package br.com.letscode.bibliotecaweb.bo;

import br.com.letscode.bibliotecaweb.model.Livro;

import java.util.List;

public interface LivroBusinessObjectI {
    Livro save(Livro livro);

    List<Livro> findAll();

}
