<%--
  Created by IntelliJ IDEA.
  User: delic
  Date: 2020/4/19
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>总价</title>
</head>
<body>
<jsp:useBean id="goods" class="model.Goods" scope="session"></jsp:useBean>
商品总价为<jsp:getProperty name="goods" property="price"/>


</body>
</html>
