<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>set标签设置</title>
</head>
<body>
<%--设置属性--%>
<c:set var="username" value="Curry" scope="page"></c:set>
<%--使用out标签打印--%>
<c:out value="username:${username}"></c:out><br/>

<%--设置对象属性值并且打印--%>
<jsp:useBean id="person" class="cn.guardwhy.pojo.Person" scope="page"></jsp:useBean>
<c:set property="name" value="guardwhy" target="${person}"></c:set>
<c:set property="age" value="26" target="${person}"></c:set>

<c:out value="username:${person.name}"></c:out><br/>
<c:out value="age:${person.age}"></c:out>
</body>
</html>
