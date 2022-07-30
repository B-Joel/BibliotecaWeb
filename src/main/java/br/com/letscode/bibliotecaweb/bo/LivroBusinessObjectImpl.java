package br.com.letscode.bibliotecaweb.bo;

import br.com.letscode.bibliotecaweb.dao.LivroDAOI;
import br.com.letscode.bibliotecaweb.model.Livro;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

public class LivroBusinessObjectImpl implements LivroBusinessObjectI {

    private LivroDAOI livroDAO;

    @Inject
    public LivroBusinessObjectImpl(LivroDAOI livroDAO) {
        this.livroDAO = livroDAO;
    }

    @Override
    public Livro save(Livro livro) {
        valida(livro);
        return livroDAO.save(livro);
    }


    @Override
    public List<Livro> findAll() {
        return livroDAO.findAll();
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Nome inválido");
        }
    }
}
