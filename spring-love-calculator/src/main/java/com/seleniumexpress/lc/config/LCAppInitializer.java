package com.seleniumexpress.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Approach 2 to create DispatcherServlet object and also mapping.
public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override 
	protected Class<?>[] getRootConfigClasses() { 
		// TODO Auto-generated method stub
		return null;
	}
		

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?> arr[] = { LoveCalculatorAppConfig.class };
		return arr;
	}

	@Override 
	protected String[] getServletMappings() { 
		//String arr[] = {"/mywebsite.com/*"};
		String arr[] = {"/"}; 
		System.out.println("Khatri");
		return arr; 
	}

}
