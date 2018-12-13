package ua.myhospital.servlet;

import ua.myhospital.db.service.RoomService;
import ua.myhospital.model.Room;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StartServlet extends HttpServlet {
    public void init(){

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        RoomService roomService = new RoomService();
        List<Room> roomList = null;
        try {
            roomList = roomService.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("roomList", roomList);

        req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);

    }

}
