<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/11/2020
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<%
    Map<String,String> dic = new HashMap<>();

%>
<%
    dic.put("hello","xin chào");
    dic.put("how","thế nào");
    dic.put("play","chơi");
    dic.put("computer","máy tính");
    String search = request.getParameter("word");
    String result = dic.get(search);
    if (result != null){
        out.println("Word: "+search);
        out.println("Result: "+result);
    }
    else {
        out.println("Not found");
    }
%>
</body>
</html>
