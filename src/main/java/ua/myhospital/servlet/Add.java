package ua.myhospital.servlet;

import ua.myhospital.core.Constant;
import ua.myhospital.db.service.UserService;
import ua.myhospital.model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

public class Add extends HttpServlet {


    public void init() {
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");


        final String login = req.getParameter("login");
        final String password = req.getParameter("password");


        final AtomicReference<UserService> userService = (AtomicReference<UserService>) req.getServletContext().getAttribute("users");


        try {
                if (userService.get().doesUserExist(login, password)) {
                    System.out.println("user exist in db");
                }else{

                    final Constant.Role role = Constant.Role.PATIENT;
                    System.out.println(role);

                    User user = new User();
                    user.setLogin(login);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setCreateDate(LocalDateTime.now());
                    userService.get().add(user);
                    req.getRequestDispatcher("/WEB-INF/view/patient_menu.jsp").forward(req, res);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
