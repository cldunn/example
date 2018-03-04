package com.cldbiz.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	static void configureContext() {
		// TODO: Set ExecutionContext and initialize logging
	}
	
	/* For running from an embedded container */
	public static void main(String[] args) {
		configureContext();
		
		new SpringApplicationBuilder(DemoApplication.class)
		.properties("spring.config.name:DemoApplication").build().run(args);
	}

	/* For running from a WAR file  */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		configureContext();
		
		application.properties("spring.config.name:DemoApplication");
		
		return application.sources(DemoApplication.class);
	}
	
	/*
	@Bean
	public ServletRegistrationBean h2servletRegistration() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*");
	    return registration;
	}
	*/
}
