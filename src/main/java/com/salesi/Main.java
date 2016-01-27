package com.salesi;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Main class to start the application
 *
 * Created by sales-i on 27/01/2016.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet("org.glassfish.jersey.servlet.ServletContainer", "/*");

        // Init parameter for our classes
        jerseyServlet.setInitParameter("jersey.config.server.provider.packages","com.salesi");

        jerseyServlet.setInitParameter("com.sun.jersey.config.feature.Trace","true");

        server.start();
        server.join();
    }

}
