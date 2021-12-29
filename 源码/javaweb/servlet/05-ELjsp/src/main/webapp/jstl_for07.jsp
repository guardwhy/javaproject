<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实现循环标签</title>
</head>
<body>
<%
// 1.定义数组
String[] array = {"12", "21", "31", "28", "56"};
// 2.设置值
pageContext.setAttribute("array", array);
%>
<%-- 循环遍历数组中的所有元素 --%>
<c:out value="排序后:"></c:out>
<c:forEach var="arr" items="${array}">
    <c:out value="${arr}"></c:out>
</c:forEach>
<hr/>

<%-- 跳跃性遍历间隔为2 --%>
<c:out value="排序后(跳跃遍历):"></c:out>
<c:forEach var="arr" items="${array}" step="2">
    <c:out value="${arr}"></c:out>
</c:forEach>
<hr/>

<%-- 指定起始和结尾位置 从下标1开始到3结束 --%>
<c:out value="排序后(指定位置):"></c:out>
<c:forEach var="arr" items="${array}" begin="1" end="3">
    <c:out value="${arr}"></c:out>
</c:forEach>
</body>
</html>
