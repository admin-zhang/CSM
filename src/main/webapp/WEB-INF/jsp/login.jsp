<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2020/5/14
  Time: 下午8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登录页面</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script>
        function chexk() {
            var usercode = $("#usercode").val();
            var password = $("#password").val();
            if (usercode == "" || password == "") {
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div style="height: 15%">
    <font color="red">
        <span id="message">${msg}</span>
    </font>
</div>
<div style="width: 70%;margin-left: 7%">
    <form class="form-horizontal" action="${pageContext.request.contextPath}/login.action" method="post" onsubmit="return chexk()">
        <div class="form-group">
            <label for="usercode" class="col-sm-2 control-label">username</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="usercode" name="usercode" placeholder="Username">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" name="password" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Remember me
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Sign in</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
