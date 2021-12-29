<%@ page import="cn.guardwhy.listener.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session中对象的绑定和解除</title>
</head>
<body>
<%
// 创建Student对象
Student student = new Student();
student.setName("Curry");
student.setAge(21);
// 将对象与Session对象进行绑定
session.setAttribute("student", student);
// 解除绑定
session.removeAttribute("student");
%>
</body>
</html>
