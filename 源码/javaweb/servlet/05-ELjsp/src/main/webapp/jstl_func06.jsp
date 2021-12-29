<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用函数标签</title>
</head>
<body>
<%
    pageContext.setAttribute("let", "Hello JSP");
%>
原生字符串: ${let}<br/>
判断字符串是否包含指定字符串:${fn:contains(let,"Hello")}<br/>
将原生字符串转换为大写:${fn:toUpperCase(let)}<br/>
将原生字符串转换为小写:${fn:toLowerCase(let)}<br/>
</body>
</html>
