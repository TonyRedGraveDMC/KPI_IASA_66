package ua.myhospital.servlets.filter;

import ua.myhospital.core.Constant;
import ua.myhospital.db.service.UserService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Objects.nonNull;

/**
 * Acidification filter.
 */
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response,
                         final FilterChain filterChain)
            throws IOException, ServletException {

        final HttpServletRequest req = (HttpServletRequest) request;
        final HttpServletResponse res = (HttpServletResponse) response;

        final String login = req.getParameter("login");
        final String password = req.getParameter("password");

        @SuppressWarnings("unchecked")
        final AtomicReference<UserService> userService = (AtomicReference<UserService>) req.getServletContext().getAttribute("users");

        final HttpSession session = req.getSession();

        //Logged user.
        if (nonNull(session) &&
                nonNull(session.getAttribute("login")) &&
                nonNull(session.getAttribute("password"))) {

            final Constant.Role role = (Constant.Role) session.getAttribute("role");

            moveToMenu(req, res, role);


        } else {
            try {
                if (userService.get().doesUserExist(login, password)) {

                    final Constant.Role role = userService.get().getRoleByLoginPassword(login, password);

                    req.getSession().setAttribute("password", password);
                    req.getSession().setAttribute("login", login);
                    req.getSession().setAttribute("role", role);

                    moveToMenu(req, res, role);

                } else {

                    moveToMenu(req, res, Constant.Role.UNKNOWN);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Move user to menu.
     * If access 'admin' move to admin menu.
     * If access 'user' move to user menu.
     */
    private void moveToMenu(final HttpServletRequest req,
                            final HttpServletResponse res,
                            final Constant.Role role)
            throws ServletException, IOException {


        if (role.equals(Constant.Role.ADMIN)) {

            req.getRequestDispatcher("/WEB-INF/view/admin_menu.jsp").forward(req, res);

        } else if (role.equals(Constant.Role.DOCTOR)) {

            req.getRequestDispatcher("/WEB-INF/view/user_menu.jsp").forward(req, res);

        } else if (role.equals(Constant.Role.PATIENT)) {

        req.getRequestDispatcher("/WEB-INF/view/user_menu.jsp").forward(req, res);

        } else {

            req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, res);
        }
    }


    @Override
    public void destroy() {
    }

}