<%-- 
    Document   : shoppingList
    Created on : 13-Oct-2022, 11:11:04 AM
    Author     : 14686
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello ${username}</p>
        <a href="/Week6ShoppingList/">logout</a>
        <form action="" method="POST">
            <h2>Add item</h2>
            <input type="text" name="itemIn">
            <input type="submit" name ="action" value="add">
        </form>

        <form action="" method="post">

        <c:forEach items="${items}" var="item">
            <tr>
            <li><input type="radio"  name="cartItem">${item}</li>
            </tr>
        </c:forEach>
        <input type="submit" name="action" value="delete">
    </form>
</body>
</html>
