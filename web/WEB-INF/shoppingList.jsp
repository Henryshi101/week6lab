<%-- 
    Document   : shoppingList
    Created on : 13-Oct-2022, 11:11:04 AM
    Author     : 14686
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello ${username}</p>
        <a href="shoppingList.jsp?action=logout">logout</a>
        <form action="" method="POST">
            <h2>Add item</h2>
            <input type="text" name="item"><input type="submit" value="Add item">
            <input type="hidden" name="action" value="add">
        </form>
        <form action="" method="post">
            <c:forEach items="${items}" var="item">
                <tr>
                    <li>input type="radio name="item" value=item</li>
                </tr>
            </c:forEach>
            <input type="submit" value="Delete">
            <input type="hidden" name="action" value="delete">
        </form>
    </body>
</html>
