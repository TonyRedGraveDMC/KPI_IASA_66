package ua.myhospital.servlet;


import ua.myhospital.db.DatabaseConnector;
import ua.myhospital.db.service.RoomService;
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
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        final ServletContext servletContext = servletContextEvent.getServletContext();

        AtomicReference<UserService> users = new AtomicReference<>(new UserService());
        servletContext.setAttribute("users", users);

        AtomicReference<RoomService> rooms = new AtomicReference<>(new RoomService());
        servletContext.setAttribute("rooms", rooms);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DatabaseConnector.getInstance().CloseConnection();
    }
}