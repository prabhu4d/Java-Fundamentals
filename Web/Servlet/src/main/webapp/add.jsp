<%--
  Created by IntelliJ IDEA.
  User: Prabhu
  Date: 26-05-2022
  Time: 10:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body bgcolor="teal">
      <%
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        
        int k = i + j;
        
        out.println("Output : " + k);
      %>
</body>
</html>
