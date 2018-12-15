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


            <h2>Registration</h2>
            <form method="post" action="<c:url value='/add'/>">

                <input type="text" maxlength="10" required placeholder="login" name="login"><br>
                <input type="password"  maxlength="10" required placeholder="password" name="password"><br>
                <input type="text" maxlength="10"  required placeholder="Name" name="name"><br>
                <input type="text" maxlength="10" required placeholder="Birthday : YY-MM-DD" name="birthday"><br>
                <input type="text"  maxlength="10" required placeholder="Phone" name="phone"><br>
                <input type="hidden"  maxlength="10" name="role"  value="P"><br><br>
                <input class="button1" class="register_input" type="submit" value="Registration">

            </form>
            <%--<a href="" class=" button1"> Regestrate </a>--%>
        </div>

    </main>


    <footer class="footer">Footer</footer>


</div>


</body>
</html>