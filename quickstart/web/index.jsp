<%--
  User: mqxu
  Date: 2019/9/26
  Time: 20:45
  Description:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>quickstart首页</title>
</head>
<body>
<%
  String username = (String) session.getAttribute("username");
  if (username != null) {
    pageContext.setAttribute("username", username);
%>
<h3>
  欢迎你:${username}
</h3>
<%
} else {
%>
<h3>用户未登录</h3>
<a href="${pageContext.request.contextPath}/">去登陆</a>
<%
  }
%>
</body>
</html>