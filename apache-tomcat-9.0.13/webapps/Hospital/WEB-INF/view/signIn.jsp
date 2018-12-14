<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign in</title>
    <style>
        <%@include file="/WEB-INF/Css/main.css"%>
        <%@include file="/WEB-INF/Css/register.css"%>
    </style>
    <meta http-equiv="Content-Type">
</head>
<body>


<div class="container normalize">
    <header class="header">
        Header
    </header>
    <aside class="left"></aside>
    <aside class="right"></aside>

    <main class="main">




        <div class="register_form">
            <h1>Sign up</h1><br>
            <form method="post" action="<c:url value='/auth'/>">

                <input type="text" required placeholder="login" name="login"><br>
                <input type="password" required placeholder="password" name="password"><br><br>
                <input class="button" type="submit" value="sign up">

            </form>
        </div>

    </main>


    <footer class="footer">Footer</footer>


</div>


</body>
</html>