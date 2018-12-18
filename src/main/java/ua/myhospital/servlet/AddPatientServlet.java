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

public class AddPatientServlet extends HttpServlet {


    public void init() {

        System.out.println("init add");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");

        System.out.println("doPost add");


        final String login = req.getParameter("login");
        final String password = req.getParameter("password");
        final String repeatPassword = req.getParameter("repeatPassword");
        final String placeP = req.getParameter("role");
        final String name = req.getParameter("name");
        final String birthday = req.getParameter("birthday");
        final String phone = req.getParameter("phone");
        final Constant.Role role = Constant.Role.getByCode(placeP);

        final AtomicReference<UserService> userService = (AtomicReference<UserService>) req.getServletContext().getAttribute("users");
        final AtomicReference<PatientService> patientService = (AtomicReference<PatientService>) req.getServletContext().getAttribute("patients");

        try {
            if (userService.get().doesUserExist(login, password)) {
                System.out.println("user exist in db");
            } else {


                //  final Constant.Role role = Constant.Role.PATIENT;
                System.out.println(role);

                User user = new User();
                Patient patient = new Patient();

                user.setLogin(login);
                if (password.equals(repeatPassword)) {
                    System.out.println(DigestUtils.md5Hex(password) + "doPost addServlet");
                    user.setPassword(DigestUtils.md5Hex(password));
                }else{
                    System.out.println("wrong password");
                    req.getRequestDispatcher("/WEB-INF/view/Reg.jsp").forward(req, res);
                }
                user.setRole(role);
                user.setCreateDate(LocalDateTime.now());

                patient.setName(name);
                patient.setBirthday(birthday);
                patient.setPhone(phone);

                if (req.getParameter("roomId") == null) {
                    patient.setRoom_id(1);
                }
                if (req.getParameter("physicianId") == null) {
                    patient.setPhysician_id(1);
                }


                userService.get().add(user);

                long userID = userService.get().getByLogin(login).getId();
                patient.setUser_id(userID);
                patientService.get().add(patient);

                req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, res);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}