package br.com.letscode.bibliotecaweb.dao;

import br.com.letscode.bibliotecaweb.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAOI {


    final private static List<Livro> bancoLivros = new ArrayList<>();
    private static long countCliente;


    @Override
    public Livro save(Livro livro){
        bancoLivros.add(livro);
        return livro;
    }

    @Override
    public List<Livro> findAll(){
        return bancoLivros;
    }

}
