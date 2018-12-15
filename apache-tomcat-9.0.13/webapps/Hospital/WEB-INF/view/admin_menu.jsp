<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ua.myhospital.model.Room" %>
<%@ page import="ua.myhospital.db.service.RoomService" %>
<%@ page import="java.util.concurrent.atomic.AtomicReference" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="ua.myhospital.db.service.PhysicianService" %>
<%@ page import="ua.myhospital.model.Physician" %>
<%@ page import="ua.myhospital.db.service.PatientService" %>
<%@ page import="ua.myhospital.model.Patient" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reg</title>
    <style>
        <%@include file="/WEB-INF/Css/main.css"%>
        <%@include file="/WEB-INF/Css/register.css"%>
        <%@include file="/WEB-INF/Css/HidenTable.css"%>
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
    <a href="<c:url value="/logout"/>" class="register_form button1 button2">Logout</a>
    <a href="<c:url value="/adminreg"/>" class="register_form button1 button2 button3">Registrate</a>
    <main class="main">

        <h1 class="register_form">Hello ADMIN!</h1>

        <div class="context">

            <div class="register_form">


                <%
                    final AtomicReference<RoomService> roomService = (AtomicReference<RoomService>) request.getServletContext().getAttribute("rooms");

                    List<Room> roomList = null;
                    try {
                        roomList = roomService.get().getAll();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    request.setAttribute("roomList", roomList);
                %>
                <label class="link" for="hider1" id="clickme">Show rooms</label>
                <input type="checkbox" id="hider1">
                <div class="content1">

                    <table class="register_form" border="2">
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
            </div>

            <div class="register_form">

                <%
                    final AtomicReference<PatientService> patientService = (AtomicReference<PatientService>) request.getServletContext().getAttribute("patients");

                    List<Patient> patientList = null;
                    try {
                        patientList = patientService.get().getAll();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    request.setAttribute("patientList", patientList);
                %>

                <label class="link" for="hider2" id="clickme">Show patient</label>
                <input type="checkbox" id="hider2">
                <div class="content2">

                    <table border="2" class="register_form">
                        <tr>
                            <th>Name</th>
                            <th>User_id</th>
                            <th>Birthday</th>
                            <th>Room_id</th>
                        </tr>
                        <c:forEach var="patientList" items="${patientList}">
                            <tr>

                                <td><c:out value="${patientList.name}"/></td>
                                <td><c:out value="${patientList.user_id}"/></td>
                                <td><c:out value="${patientList.birthday}"/></td>
                                <td><c:out value="${patientList.room_id}"/></td>
                            </tr>

                        </c:forEach>
                    </table>
                </div>
            </div>

            <div class="register_form">

                <%
                    final AtomicReference<PhysicianService> physicianService = (AtomicReference<PhysicianService>) request.getServletContext().getAttribute("physicians");

                    List<Physician> physicianList = null;
                    try {
                        physicianList = physicianService.get().getAll();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    request.setAttribute("physicianList", physicianList);
                %>

                <label class="link" for="hider3" id="clickme">Show physician</label>
                <input type="checkbox" id="hider3">
                <div class="content3">

                    <table border="2" class="register_form">
                        <tr>
                            <th>Name</th>
                            <th>Position</th>
                            <th>Birthday</th>
                        </tr>
                        <c:forEach var="physicianList" items="${physicianList}">
                            <tr>

                                <td><c:out value="${physicianList.name}"/></td>
                                <td><c:out value="${physicianList.position}"/></td>
                                <td><c:out value="${physicianList.birthday}"/></td>
                            </tr>

                        </c:forEach>
                    </table>
                </div>
            </div>

        </div>


</main>


<footer class="footer">Footer</footer>


</div>


</body>
</html>