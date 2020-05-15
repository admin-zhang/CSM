<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2020/5/14
  Time: 下午8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户列表页面</title>
</head>
<body>
欢迎您!用户:${USER_SESSION.user_name}
<a href="${pageContext.request.contextPath}/logout.action">退出登录</a>
OK
</body>
</html>
