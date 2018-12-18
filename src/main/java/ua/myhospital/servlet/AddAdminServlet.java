package ua.myhospital.servlet;

import org.apache.commons.codec.digest.DigestUtils;
import ua.myhospital.core.Constant;
import ua.myhospital.db.service.PatientService;
import ua.myhospital.db.service.UserService;
import ua.myhospital.model.Patient;
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

public class AddAdminServlet extends HttpServlet {


    public void init() {


    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");

        System.out.println("doPost addAdmin");


        final String login = req.getParameter("login");
        final String password = req.getParameter("password");
        final String repeatPassword = req.getParameter("repeatPassword");

        final AtomicReference<UserService> userService = (AtomicReference<UserService>) req.getServletContext().getAttribute("users");

        try {
            if (userService.get().doesUserExist(login, password)) {
                System.out.println("user exist in db");
            } else {

                Constant.Role role = Constant.Role.ADMIN;
                User user = new User();

                user.setLogin(login);
                if (password.equals(repeatPassword)) {
                    System.out.println(DigestUtils.md5Hex(password) + " doPost addAdmin");
                    user.setPassword(DigestUtils.md5Hex(password));
                }else{
                    System.out.println("wrong password");
                    req.getRequestDispatcher("/WEB-INF/view/adminreg.jsp").forward(req, res);
                }
                user.setRole(role);
                user.setCreateDate(LocalDateTime.now());
                userService.get().add(user);
                req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, res);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
