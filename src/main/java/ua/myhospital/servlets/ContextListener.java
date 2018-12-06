package ua.myhospital.servlets;


import ua.myhospital.db.UserDAO;
import ua.myhospital.model.Customer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;




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

        dao.get().add(new Customer( "Alex", "1", Customer.Role.ADMIN,
                LocalDateTime.now(),
                LocalDateTime.now()));

        dao.get().add(new Customer( "Lex", "1", Customer.Role.PATIENT,
                LocalDateTime.now(),
                LocalDateTime.now()));
        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        servletContext.setAttribute("db", dao);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        dao = null;
    }
}