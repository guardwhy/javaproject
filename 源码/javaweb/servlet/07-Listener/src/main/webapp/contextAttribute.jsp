<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ServletContext对象属性</title>
</head>
<body>
<%
// 1.添加属性
application.setAttribute("userName", "Curry");
// 2.修改属性
application.setAttribute("userName", "Kobe");
// 3.删除属性
application.removeAttribute("userName");
%>
</body>
</html>
