<%@ page import="ua.myhospital.model.Room" %>
<%@ page import="ua.myhospital.db.service.RoomService" %>
<%@ page import="java.util.concurrent.atomic.AtomicReference" %>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.SQLException" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kyrsach</title>

    <style>
        <%@include file="/WEB-INF/Css/HidenTable.css"%>
        <%@include file="/WEB-INF/Css/main.css"%>
        <%@include file="/WEB-INF/Css/register.css"%>
    </style>


    <meta http-equiv="Content-Type">
</head>
<body>


<div class="container">
    <header class="header">
        <img src="https://www.mayoclinic.org/styles/img/logo-mayoclinic.png" alt="">
    </header>
    <aside class="left"></aside>
    <aside class="right"></aside>

    <main class="main">


        <form method="post" action="<c:url value='/reg'/>">
            <input type="submit" name="Reg" value="Registration" class="button1 button2">
        </form>

        <form method="post" action="<c:url value='/signIn'/>">
            <input type="submit" value="Sign in" class="button1 button2 button3 " name="Auth">
        </form>


        <%--<a href="file:///C:/Users/eskan/Desktop/web/Webpage/SignIn.html" class="button1 button2 button3">Sign in</a>--%>

        <div class="bigGrid">
            <div class="myGrid"></div>

            <div class="smallGrid a"><p>APPOINTMENTS</p></div>
            <div class="smallGrid b"><p>CONTACT US</p></div>
            <div class="smallGrid c"><p>FIND A DOCTOR</p></div>
            <div class="smallGrid d"><p>PATIENT & VISITOR GUIDE</p></div>

        </div>

        <h2 align="center">Find Diseases & Conditions</h2>
        <div class="r"></div>

        <div class="context">

            <div class="block a1">


                <img src="https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/09/25/18/03/ken-burns-documentary-promo-tile-v3.jpg"
                     alt="">
                <div>
                    <p>Mayo Clinic featured in</p>
                    <p>Ken Burns documentary</p>
                </div>

            </div>

            <div class="block a1 a2">

                <img src="https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/12/03/16/13/triplemygift520x360_ad.jpg"
                     alt="">
                <div>
                    <p>Triple my gift for the Mayo Clinic Center for</p>
                    <p>Indvidualized Medicine today!</p>
                </div>

            </div>
            <div class="block a1">

                <img src=https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/08/22/17/03/mc-usnews-tile-520x360.jpg"alt="">
                <div>
                    <p>Mayo Clinic featured in</p>
                    <p>Ken Burns documentary</p>
                </div>

            </div>
            <div class="block a1">

                <img src="https://www.mayoclinic.org/-/media/kcms/gbs/patient-consumer/images/2018/04/23/16/35/hopeandhealing2x.jpg"
                     alt="">

                <div>
                    <p>Mayo Clinic featured in</p>
                    <p>Ken Burns documentary</p>
                </div>

            </div>
        </div>
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


    </main>


    <footer class="footer">Footer</footer>


</div>
</body>
</html>
