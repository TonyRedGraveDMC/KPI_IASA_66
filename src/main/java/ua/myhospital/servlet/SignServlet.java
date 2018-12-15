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

public class SignServlet extends HttpServlet {
    public void init(){
        System.out.println("init SignServlet");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");


        System.out.println("doPost SignServlet");
        req.getRequestDispatcher("/WEB-INF/view/signIn.jsp").forward(req, resp);

    }

    @Override
    public void destroy() {
        System.out.println("destroy SignServlet");
    }

}