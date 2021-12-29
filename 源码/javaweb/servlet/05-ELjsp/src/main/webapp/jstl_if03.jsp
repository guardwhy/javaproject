<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--设置变量--%>
<c:set var="age" value="21" scope="page"></c:set>
<c:out value="年龄是:${age}"></c:out><br/>

<%--判断年龄是否成年--%>
<c:if test="${age >=18}">
    <%--输出结果--%>
    <c:out value="恭喜你，正式长大了"></c:out>
</c:if>
</body>
</html>
