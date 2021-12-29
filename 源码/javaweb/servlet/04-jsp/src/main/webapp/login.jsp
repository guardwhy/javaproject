<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录操作</title>
</head>
<body>
<form action="login" method="post">
    <form action="register" method="post">
        用户姓名: <input type="text" name="userName"><br/>
        用户密码: <input type="text" name="password"><br/>
        <span style="color: red"><%= request.getAttribute("error")==null?"":request.getAttribute("error")%></span><br/>
        <input type="submit" value="注册"/>
    </form>
</form>
</body>
</html>
