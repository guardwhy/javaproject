<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取集合中数据内容</title>
</head>
<body>
<%
// 1.创建集合添加元素
List<String> list = new ArrayList<>();
list.add("curry");
list.add("kobe");
list.add("james");
// 2.将整个集合放入到指定内置对象中
pageContext.setAttribute("list", list);

%>
<%-- EL表达式获取集合元素 --%>
下标为0元素:${list[0]}<br/>
下标为1元素:${list[1]}<br/>
下标为2元素:${list[2]}<br/>
<hr/>

<%
// 1.创建map集合添加元素
Map<String, Integer> map = new HashMap<>();
map.put("kobe", 1);
map.put("curry", 2);
map.put("LeBron.james", 3);
// 2.将整个集合放入到指定内置对象中
pageContext.setAttribute("map", map);
%>
<%-- EL表达式获取Map集合元素--%>
Map集合元素:${map}<br/>
特殊字符Value: ${map["LeBron.james"]}<br/>
</body>
</html>
