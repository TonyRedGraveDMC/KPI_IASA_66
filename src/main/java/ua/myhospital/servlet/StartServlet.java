package ua.myhospital.servlet;

import ua.myhospital.db.service.RoomService;
import ua.myhospital.db.service.UserService;
import ua.myhospital.model.Room;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class StartServlet extends HttpServlet {
    public void init(){

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        final AtomicReference<RoomService> roomService = (AtomicReference<RoomService>) req.getServletContext().getAttribute("rooms");

        List<Room> roomList = null;
        try {
            roomList = roomService.get().getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("roomList", roomList);

        req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);

    }

}
