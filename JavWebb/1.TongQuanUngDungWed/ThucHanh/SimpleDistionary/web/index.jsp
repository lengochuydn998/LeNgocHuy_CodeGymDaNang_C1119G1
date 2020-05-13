<%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/11/2020
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="/translate">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type="submit" name="submit" value="Search"/>
  </form>
  </body>
</html>
