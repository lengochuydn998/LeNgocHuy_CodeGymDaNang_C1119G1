<%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/11/2020
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="post" action="/calculator">
    <input type="text" name="pd" placeholder="Product Description"><br>
    <input type="text" name="lp" placeholder="List Price"><br>
    <input type="text" name="dp" placeholder="Discount Percent (%)"><br>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
