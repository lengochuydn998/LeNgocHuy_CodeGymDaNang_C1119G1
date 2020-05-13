<%@ page import="model.Customer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/11/2020
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <style>
    table, th, td {
      border: 1px solid black;
      border-collapse: collapse;
    }
    th, td {
      padding: 5px;
    }
    th {
      text-align: left;
    }
      img{
          width: 150px;
          height: 100px;

      }
  </style>
</head>
<body>
<table style="width:70%">
  <tr>
    <th>Name</th>
    <th>Age</th>
    <th>Address</th>
      <th>Img</th>
  </tr>

  <c:forEach var="ds" items="${danhSach}">
  <tr>
    <td><c:out value="${ds.name}"/></td>
    <td><c:out value="${ds.age}"/></td>
    <td><c:out value="${ds.address}"/></td>
      <td><img src="<c:out value="${ds.img}"></c:out>"></td>
  </tr>
  </c:forEach>
</table>

</body>
</html>
