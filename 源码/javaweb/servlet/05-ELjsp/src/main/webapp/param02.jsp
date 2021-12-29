<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>传递参数</title>
</head>
<body>
<form action="el_param02.jsp" method="post">
    用户名: <input type="text" name="name"/><br/>
    爱好：<input type="checkbox" name="hobby" value="Java"/>Java<br/>
    <input type="checkbox" name="hobby" value="Vue.js"/>Vue.js<br/>
    <input type="checkbox" name="hobby" value="Python"/>Python<br/>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>
