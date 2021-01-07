package com.springMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class arrClass[] = {SpringAppConfig.class};
		return arrClass;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String arrMapping[] = {"/"};
		return arrMapping;
	}

}
