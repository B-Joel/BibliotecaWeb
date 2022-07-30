<%--
  Created by IntelliJ IDEA.
  User: jbellatto
  Date: 29/07/2022
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listar Livros</title>
</head>
<body>
    <table border="solid">
        <tr>
            <th>Nome</th>
            <th>Autor</th>
        </tr>
        <c:forEach var="livro" items="${livros}" varStatus="id">
            <tr>

                <td>${livro.nome}</td>
                <td>${livro.autor}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="cadastro-livro.jsp">Cadastre um novo Livro</a>
</body>
</html>
