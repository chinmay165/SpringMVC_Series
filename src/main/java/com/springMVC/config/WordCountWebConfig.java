package com.springMVC.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Replacement of web.xml file--- This class is used for java based configuration
public class WordCountWebConfig { 
	/* implements WebApplicationInitializer {
}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		// This is xml based configuration --start
		//XmlWebApplicationContext webAC = new XmlWebApplicationContext();
		//webAC.setConfigLocation("classpath:appconfig.xml");
		 --end
		
		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
		wac.register(SpringAppConfig.class);
		
		//create DS DispatcherServlet
		DispatcherServlet ds = new DispatcherServlet(wac);
		
		//register DS
		ServletRegistration.Dynamic servReg =  servletContext.addServlet("MyDS", ds);
		
		servReg.setLoadOnStartup(1);
		servReg.addMapping("/wordcount.com/*");
	} */

}
