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

	// Ye class hum us time use krty hn jis time hum apne beans xml file k ander bna rahy hoty hn to hum yehan xml file load krty h  
		
		//XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
		//xmlWebApplicationContext.setConfigLocation("classpath:application-config.xml");

	// Ye class hum us time use krty hn jis time hum apne beans Java class k ander bna rahy hoty hn to hum yehan class load krty h
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		// create a dispatcher servlet object
		//DispatcherServlet dispatcherServlet = new DispatcherServlet(xmlWebApplicationContext);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register the dispatcher servlet with the servlet context object.
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);

		myCustomDispatcherServlet.setLoadOnStartup(1);
		//myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
		myCustomDispatcherServlet.addMapping("/");
		
		System.out.println("my custom class onstartup method called >>> Aakash Khatri");

	}

}
