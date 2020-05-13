<%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/13/2020
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>

<h1>Delete Product</h1>
<p>
    <a href="/products">Back To Menu</a>
</p>
<form method="post" >
    <fieldset>
        <legend>Delete Information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>

            <tr>
                <td>Price: </td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>

            <tr>
                <td>Img: </td>
                <td><img src="<c:out value="${product.img}"></c:out>"style="width:150px;height:100px"></td>            </tr>
            <tr>
                <td><input type="submit" value="Delete Product"></td>
                <td><a href="/products">Back to customer list</a> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
