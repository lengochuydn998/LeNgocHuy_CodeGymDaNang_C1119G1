<%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/13/2020
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
</head>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new Product</a>
    Search: <input type="text" name="search" placeholder="Search Product">
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Img</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>View</td>
    </tr>
    <tr>
        <c:forEach items="${products}" var="product">
    <tr>
        <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
        <td>${product.getPrice()}</td>
        <td><img src="<c:out value="${product.img}"></c:out>"style="width:150px;height:100px"></td>
        <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
        <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        <td><a href="/products?action=view&id=${product.getId()}">view</a></td>
    </tr>
    </c:forEach>
    </tr>
</table>
</body>
</html>
