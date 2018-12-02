package ua.myhospital.servlets;


import ua.myhospital.db.UserDAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.atomic.AtomicReference;

import static ua.myhospital.db.entity.User.ROLE.ADMIN;
import static ua.myhospital.db.entity.User.ROLE.USER;

/**
 * ContextListener put user db to servlet context.
 */
@WebListener
public class ContextListener implements ServletContextListener {
    /**
     * Fake database connector.
     */
    private AtomicReference<UserDAO> dao;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        dao = new AtomicReference<>(new UserDAO());

        dao.get().add(new User(1, "Pavel", "1", ADMIN));
        dao.get().add(new User(2, "Egor", "1", USER));

        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        servletContext.setAttribute("db", dao);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        dao = null;
    }
}