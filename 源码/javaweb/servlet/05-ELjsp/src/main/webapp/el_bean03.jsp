<%@ page import="cn.guardwhy.pojo.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean对象中属性的获取</title>
</head>
<body>
<%--1.原始方式实现对象的创建 --%>


<%
    Person person = new Person();
    person.setName("Curry");
    person.setAge(32);
    pageContext.setAttribute("person", person);

    pageContext.setAttribute("let1", "name");
    pageContext.setAttribute("let2", "age");
%>

<%--1.原始方式输出属性--%>
<%= "原始方式:"%><br/>
<%="用户名:" + person.getName()%><br/>
<%="年龄:" + person.getAge()%><br/><br/>


<%--EL表达式输出--%>
<%= "EL表达式输出"%><br/>
<%--
用户名: ${person.name}<br/>
年龄: ${person.age}<br/>
--%>
用户名:${person["name"]}<br/>
年龄: ${person["age"]}<br/><br/>

<%-- 动态取值 --%>
<%= "动态取值"%><br/>
用户名:${person[let1]}
</body>
</html>
