<%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/11/2020
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/calculate">
    <h3>Simple Calculator</h3>
    Fist operand: <input type="text" name="fist" >
    <br>
    Operator: <select name="operator">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select>
    <br>
    Second operand: <input type="text" name="second">
    <br>
    <input type="submit" value="Calculate" name="submit">
  </form>
  </body>
</html>
