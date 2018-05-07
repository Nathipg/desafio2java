<%-- 
    Document   : ConsultaUsuario
    Created on : 06/05/2018, 20:46:33
    Author     : Laionel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Usuários</title>
    </head>
    <body>
        <h1>Usuários:</h1>
        <form method="get" action="<%= request.getContextPath()%>/UsuarioServlet.jsp">
            <div>
                <label for="idUsuario">
                    "Usuário"
                </label>
                <input id="idUsuario" nome="idUsuario" type="text" placeholder="Id do usuário">
            </div>
            <div>
                <input type="submit" value="Consultar">
            </div>
            <br>
            <table border="2">
                <c:forEach items="${usuarios}" var="usu">
                    <tr>
                        <td>
                            <c:out value="${usu.idUsuario}"></c:out>
                        </td>
                        <td>
                            <c:out value="${usu.cpf}"></c:out>
                        </td>
                        <td>
                            <c:out value="${usu.nome}"></c:out>
                        </td>
                    </tr>
                </c:forEach>
        </form>

    </body>
</html>
