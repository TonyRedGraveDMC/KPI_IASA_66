package ua.myhospital.servlet;

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

public class AddServlet extends HttpServlet {


    public void init() {

        System.out.println("init add");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");

        System.out.println("doPost add");

        final String login = req.getParameter("login");
        final String password = req.getParameter("password");
        final String placeP = req.getParameter("role");
        final String name = req.getParameter("name");
        final String birthday = req.getParameter("birthday");
        final String phone = req.getParameter("phone");
        final Constant.Role role =Constant.Role.getByCode(placeP);

        final AtomicReference<UserService> userService = (AtomicReference<UserService>) req.getServletContext().getAttribute("users");
        final AtomicReference<PatientService> patientService = (AtomicReference<PatientService>) req.getServletContext().getAttribute("patients");

        try {
                if (userService.get().doesUserExist(login, password)) {
                    System.out.println("user exist in db");
                }else{

                  //  final Constant.Role role = Constant.Role.PATIENT;
                    System.out.println(role);

                    User user = new User();
                    Patient patient = new Patient();

                    user.setLogin(login);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setCreateDate(LocalDateTime.now());

                    patient.setName(name);
                    patient.setBirthday(birthday);
                    patient.setPhone(phone);
                    patient.setPhysician_id(1);
                    patient.setRoom_id(1);

                    patientService.get().add(patient);
                    userService.get().add(user);
                    req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, res);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
