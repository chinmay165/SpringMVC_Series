package com.springMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springMVC.controller")
public class SpringAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vw = new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/jsp/");
		vw.setSuffix(".jsp");
		return vw;
	}
}

