<%-- 
    Document   : register
    Created on : 13-Oct-2022, 11:10:30 AM
    Author     : 14686
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register</h1>
        <form action="shoppingList" method="POST">
            <input type="text" name="username">
            <input type="hidden" name="action" value="register"><br>
            <input type="submit" value="Register">
                        <a href="shoppingList">shopping</a>     

        </form>
        <p>${hello}</p>
    </body>
</html>
