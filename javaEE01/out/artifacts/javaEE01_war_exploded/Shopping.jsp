<%--
  Created by IntelliJ IDEA.
  User: delic
  Date: 2020/4/19
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品</title>
</head>
<body>
<form action="shopping.do" method="post">
    商品数量:<input required="required" type="text" name="num" onkeyup="value=value.replace(/[^\d]/g,'')" onblur="value=value.replace(/[^\d]/g,'')">
    商品单价:<input required="required" type="text" name="price" onkeyup="value=value.replace(/[^\d]/g,'')" onblur="value=value.replace(/[^\d]/g,'')">
    <button> send</button>



</form>


</body>
</html>
