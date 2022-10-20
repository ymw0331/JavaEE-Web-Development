package com.applicationscope.listeners;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener,
		HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, HttpSessionIdListener,
		ServletRequestListener, ServletRequestAttributeListener, AsyncListener {

	public SessionListener() {
		// TODO Auto-generated constructor stub
	}

	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
	}

	public void onError(AsyncEvent arg0) throws java.io.IOException {
		// TODO Auto-generated method stub
	}

	public void sessionIdChanged(HttpSessionEvent arg0, String arg1) {
		// TODO Auto-generated method stub
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
	}

	public void onTimeout(AsyncEvent arg0) throws java.io.IOException {
		// TODO Auto-generated method stub
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
	}

	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	public void attributeAdded(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
	}

	public void onComplete(AsyncEvent arg0) throws java.io.IOException {
		// TODO Auto-generated method stub
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
	}

	public void onStartAsync(AsyncEvent arg0) throws java.io.IOException {
		// TODO Auto-generated method stub
	}

	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
	}

	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
	}

	public void attributeAdded(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
	}

	public void attributeReplaced(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
	}

}
