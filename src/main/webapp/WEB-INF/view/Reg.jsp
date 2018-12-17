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


        <%--<div class="register_form">--%>



            <form method="post" action="<c:url value='/add'/>" class="register_form">
                <h2>Registration</h2>

                <input type="text"     size="30" class="register_input" maxlength="23" required placeholder="Login" name="login"><br>
                <input type="password" size="30" class="register_input" maxlength="23" required placeholder="Password" name="password"><br>
                <input type="text"     size="30" class="register_input" maxlength="23" required placeholder="Name" name="name"><br>
                <input type="text"     size="30" class="register_input" maxlength="23" required placeholder="Birthday : YY-MM-DD" name="birthday"><br>
                <input type="text"     size="30" class="register_input" maxlength="23" required placeholder="Phone" name="phone"><br>
                <input type="hidden"   class="register_input" maxlength="23" name="role"  value="P"><br><br>
                <input class="button1"  class="register_input" class="register_input" type="submit" value="Registration">

            </form>
            <%--<a href="" class=" button1"> Regestrate </a>--%>
        <%--</div>--%>

    </main>


    <footer class="footer">Footer</footer>


</div>


</body>
</html>