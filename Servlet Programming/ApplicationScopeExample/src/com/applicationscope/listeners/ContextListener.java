package com.applicationscope.listeners;

import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.applicationscope.db.DBConnection;

public class ContextListener implements ServletContextListener {

	// executed at context initialized and destroyed levels

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Hi, Application is Started");

		ServletContext servletContext = sce.getServletContext();

		Connection connection = DBConnection.openConnection();
		servletContext.setAttribute("db-connection", connection);
		System.out.println("Database connection is established");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Hi, Application is Stopped");

		boolean isClosed = DBConnection.closeConnection();
		System.out.println("DB connection is closed? ==> " + isClosed);

	}

}
