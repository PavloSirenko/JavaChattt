<%--
  Created by IntelliJ IDEA.
  User: PavloSirenko
  Date: 31-Oct-19
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>Registration page</title>
</head>
<body>
<div>
    <div align="center">
        <h2>Welcome to JavaChattt!</h2><br><br>
    </div>
    <div align="center">
        <h4>Registration form</h4>
        <form method="post">
            <h5>Nick</h5>
            <input type="text" name="nickName"/><br>
            <h5>Password</h5>
            <input type="password" name="password"/><br>
            <h5>Email</h5>
            <input type="email" name="email"/><br>
            <h5>First name</h5>
            <input type="text" name="firstName"/><br>
            <h5>Last name</h5>
            <input type="text" name="lastName"/><br>
            <h5>Sex</h5>
            <input type="text" name="sex"/><br>
            <h5>Age</h5>
            <input type="number" name="age"/><br>
            <h5>Address</h5>
            <input type="text" name="address"/><br>
            <input type="submit" value="Registration" />
        </form>
    </div>
</div>
</body>
</html>
