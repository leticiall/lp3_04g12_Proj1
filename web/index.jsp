<%-- 
    Document   : index
    Created on : 11/08/2015, 08:31:55
    Author     : 31400817
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aula1-Index</title>
    </head>
    <body>
        <h1>Login</h1>
        <br>
        <section> 
            <form method="POST" action="FrontController">
                <input type="hidden" name="command" value="login.login"/>
                <p>Usuário: <input type="text" name="nome" placeholder="usuario"/></p>
                <p>Senha: <input type="password" name="senha" placeholder="senha"/></p>
                <p><input type="submit" value="LOGIN"></p>
            </form>
        </section>
        
    </body>
</html>
