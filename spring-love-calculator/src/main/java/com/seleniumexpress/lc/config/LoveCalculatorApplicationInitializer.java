package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


// Approach 1 to create DispatcherServlet object and also mapping. 
public class LoveCalculatorApplicationInitializer { // implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		//XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
		//xmlWebApplicationContext.setConfigLocation("classpath:application-config.xml");

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		// create a dispatcher servlet object
		//DispatcherServlet dispatcherServlet = new DispatcherServlet(xmlWebApplicationContext);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register the dispatcher servlet with the servlet context object.
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);

		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");

		// System.out.println("my custom class onstartup method called >>> Aakash
		// Khatri");

	}

}
