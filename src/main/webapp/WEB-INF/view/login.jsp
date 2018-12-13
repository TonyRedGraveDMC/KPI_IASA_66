<%@ page import="ua.myhospital.model.Room" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <%--<link rel="stylesheet" href="D:/Github/Hospital/src/main/webapp/WEB-INF/Css/HidenTable.css">--%>
    <style>
        <%@include file="/WEB-INF/Css/HidenTable.css"%>
    </style>

    <title>Login</title>

</head>
<body>


<label class="link" for="hider" id="clickme">Нажми на меня!</label>
<input type="checkbox" id="hider">
<div class="content">

    <table border="2">
        <tr>
            <th>Number</th>
            <th>Type</th>
            <th>Seats</th>
        </tr>
        <c:forEach var="roomList" items="${roomList}">
            <tr>

                <td><c:out value="${roomList.roomNumber}"/></td>
                <td><c:out value="${roomList.type}"/></td>
                <td><c:out value="${roomList.numberOfSeats}"/></td>
            </tr>

        </c:forEach>
    </table>
</div>


<div class="form">

    <h1>Вход в систему</h1><br>
    <form method="post" action="<c:url value='/auth'/>">

        <input type="text" required placeholder="login" name="login"><br>
        <input type="password" required placeholder="password" name="password"><br><br>
        <input class="button" type="submit" value="Войти">

    </form>

    <h2>Регестрация</h2><br>
    <form method="post" action="<c:url value='/add'/>">

        <input type="text" required placeholder="login" name="login"><br>
        <input type="password" required placeholder="password" name="password"><br><br>
        <input class="button" type="submit" value="Зарегестрироваться">

    </form>


</div>
</body>
</html>