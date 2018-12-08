package ua.myhospital.servlets;


import ua.myhospital.db.service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.atomic.AtomicReference;




/**
 * ContextListener put user db to servlet context.
 */
@WebListener
public class ContextListener implements ServletContextListener {
    /**
     * Fake database connector.
     */
    private AtomicReference<UserService> users;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        users = new AtomicReference<>(new UserService());

        final ServletContext servletContext =
                servletContextEvent.getServletContext();

        servletContext.setAttribute("users", users);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        users = null;
    }
}