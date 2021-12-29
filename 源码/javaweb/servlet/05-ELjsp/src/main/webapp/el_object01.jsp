<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>内置对象中获取数据</title>
</head>
<body>
<%
    pageContext.setAttribute("username1", "pageContext对象中的属性值:Kobe");
    request.setAttribute("username2", "request对象中的属性值:Curry");
    session.setAttribute("username3", "session对象中的属性值:James");
    application.setAttribute("username4", "session对象中的属性值:Harden");
%>

<%--使用JSP中原始方式获取数据--%>
<%--
<%= "nam1的数值为:" + pageContext.getAttribute("username1")%><br/>
<%= "nam2的数值为:" + request.getAttribute("username2")%><br/>
<%= "nam3的数值为:" + session.getAttribute("username3")%><br/>
<%= "nam4的数值为:" + application.getAttribute("username4")%><br/>
--%>

<%--使用EL表达式实现获取数据--%>
<h3>username1的数值为:${username1}</h3>
<h3>username2的数值为:${username2}</h3>
<h3>username3的数值为:${username3}</h3>
<h3>username4的数值为:${username4}</h3>
</body>
</html>
