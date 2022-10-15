<%-- 
    Document   : shoppingList
    Created on : 13-Oct-2022, 11:11:04 AM
    Author     : 14686
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <c:out value="${username}" /><br>


        <a href="" type="submit">logout</a>
        <input type="hidden" name ="action" value="logout">

        <form action="" method="POST">
            <h2>Add item</h2>
            <input type="text" name="itemIn">
            <input type="submit" value="add item" >
            <input type="hidden" name ="action" value="add">
        </form>

        <form action="" method="post">

            <c:forEach items="${shoppingItems}" var="shoppingItem">
                <tr>
                <li><input type="radio" name=var >${shoppingItem}</li>
            </tr>
        </c:forEach>

        <input type="submit" value="Delete">
        <input type="hidden" name ="action" value="delete">

    </form>
</body>
</html>
