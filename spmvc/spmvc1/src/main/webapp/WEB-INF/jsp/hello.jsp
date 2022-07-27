<%@ page import="com.Bean.Student" %><%--
  Created by IntelliJ IDEA.
  User: delic
  Date: 2021/12/10
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
${string}

<p>----------</p>

<% Student student = (Student) session.getAttribute("stu"); %>
<%=student.getUsername()%>

</body>
</html>
