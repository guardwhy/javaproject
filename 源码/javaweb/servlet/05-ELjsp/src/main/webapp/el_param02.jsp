<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数数值的获取</title>
</head>
<body>
<%--设置编码--%>
<%
    request.setCharacterEncoding("utf-8");
%>
<%--原始方式获取请求参数值 --%>

<%--
<%="用户名:" + request.getParameter("name")%><br/>
<%="爱好:" + Arrays.toString(request.getParameterValues("hobby"))%><br/>
--%>

<%--2.使用EL表达式获取参数值--%>
用户名: ${param.name}<br/>
爱好: ${paramValues.hobby[0]}<br/>
</body>
</html>
