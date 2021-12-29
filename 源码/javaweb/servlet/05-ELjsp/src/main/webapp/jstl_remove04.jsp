<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>remove标签</title>
</head>
<body>
<%--设置属性--%>
<c:set var="username" value="guardwhy" scope="page"></c:set>
<c:out value="username:${username}"></c:out>
<hr/>

<%--删除属性--%>
<c:remove var="username" scope="page"></c:remove>
<c:out value="username:${username}" default="NULL"></c:out>
</body>
</html>
