<%--
  Created by IntelliJ IDEA.
  User: Huy Le
  Date: 5/15/2020
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${result}" var="ds">
    ${ds}
</c:forEach>

</body>
</html>
