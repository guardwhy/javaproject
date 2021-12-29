<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实现choose标签</title>
</head>
<body>
<%-- 设置变量并指定数值 --%>
<c:set var="age" value="17" scope="page"></c:set>
<c:out value="age:${age}"></c:out>
<hr/>

<%--进行多条件判断--%>
<c:choose>
    <c:when test="${age > 18}">
        <c:out value="恭喜你，已经成年了。可以好好的happy了"></c:out>
    </c:when>
    <c:when test="${age == 18}">
        <c:out value="才刚刚18岁，好好学习"></c:out>
    </c:when>
    <c:otherwise>
        <c:out value="未成年,晚上早点休息"></c:out>
    </c:otherwise>
</c:choose>
</body>
</html>
