<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

</head>
<body>

<div class="form">

    <h1>Вход в систему</h1><br>
    <form method="post" action="<c:url value='/auth'/>">
        <input roomNumber="text" required placeholder="login" name="login"><br>
        <input roomNumber="password" required placeholder="password" name="password"><br><br>
        <input class="button" roomNumber="submit" value="Войти">

    </form>
</div>
</body>
</html>