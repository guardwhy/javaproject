<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实现会话中属性状态</title>
</head>
<body>
<%
// 1.添加属性
session.setAttribute("userName", "Kobe");
// 2.修改属性
session.setAttribute("userName", "Curry");
// 3.删除属性
session.removeAttribute("userName");
%>
</body>
</html>
