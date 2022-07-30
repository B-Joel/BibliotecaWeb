<%--
  Created by IntelliJ IDEA.
  User: jbellatto
  Date: 29/07/2022
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Livro</title>
</head>
<body>
    <h1>Cadastro de Livro</h1>
    <fieldset>
        <legend>Dados basicos</legend>
        <form action="livro-servlet" method="post">
            <div>
                <label for="idNome">Nome:</label>
                <input type="text" id="idNome" name="nome">
            </div>
            <div>
                <label for="idAutor">Autor:</label>
                <input type="text" id="idAutor" name="autor">
            </div>
            <input type="submit" value="Enviar">
        </form>
    </fieldset>
</body>
</html>
