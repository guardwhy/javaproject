<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>属性状态的改变</title>
</head>
<body>
<%
// 1.实现属性的添加
request.setAttribute("name", "Curry");
// 2.修改属性修改
request.setAttribute("name", "Kobe");
// 3.删除属性
request.removeAttribute("name");
%>
</body>
</html>
