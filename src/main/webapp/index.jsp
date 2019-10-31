<%--
  Created by IntelliJ IDEA.
  User: PavloSirenko
  Date: 31-Oct-19
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>Welcome page!</title>
</head>
<body>
<div>
    <div align="center">
        <h2>Welcome to JavaChattt!</h2><br><br>
    </div>
    <div align="center">
        <form method="post">
            <h5>Nick name:</h5>
            <input type="text" name="nickName"><br>
            <h5>Password:</h5>
            <input type="password" name="password"><br>
            <input type="submit" value="Login" />
        </form>
    </div>
    <div align="center">
        <p><a href='<c:url value="client/registrationPage.jsp" />'>Registration form</a></p>
    </div>
</div>
</body>
</html>
