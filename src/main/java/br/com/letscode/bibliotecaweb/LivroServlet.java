package br.com.letscode.bibliotecaweb;

import br.com.letscode.bibliotecaweb.bo.LivroBusinessObjectI;
import br.com.letscode.bibliotecaweb.model.Livro;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/livro-servlet")
public class LivroServlet extends HttpServlet {

    @Inject
    private LivroBusinessObjectI livroBusinessObjectI;

    @Override
    public void init() throws ServletException {
        System.out.println("Start");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post");

        String nome = req.getParameter("nome");
        String autor = req.getParameter("autor");

        Livro livro = new Livro(nome,autor);
        Livro livroSalvo = livroBusinessObjectI.save(livro);

        List<Livro> livros = livroBusinessObjectI.findAll();
        req.setAttribute("livros", livros);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/lista-livros.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("End");
    }
}
