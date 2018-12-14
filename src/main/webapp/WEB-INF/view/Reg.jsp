<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reg</title>
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


            <h2>Regestration</h2>
            <form method="post" action="<c:url value='/add'/>">

                <input type="text" required placeholder="login" name="login"><br>
                <input type="password" required placeholder="password" name="password"><br><br>
                <input class="button" type="submit" value="Rgestrate">

            </form>
            <%--<a href="" class=" button1"> Regestrate </a>--%>
        </div>

    </main>


    <footer class="footer">Footer</footer>


</div>


</body>
</html>