package com.tmdt.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class TemplateResolverConfig {
	private static final String admin_path = "/admin/";
	private static final String employee_path = "/customers/employee/";
	private static final String employer_path = "/customers/employer/";
	private static final String customer_path = "/customers/";

	public ClassLoaderTemplateResolver getResolver(String path) {
		ClassLoaderTemplateResolver firstResolver = new ClassLoaderTemplateResolver();
		firstResolver.setPrefix("templates" + path);
		firstResolver.setSuffix(".html");
		firstResolver.setTemplateMode(TemplateMode.HTML);
		firstResolver.setCharacterEncoding("UTF-8");
		firstResolver.setOrder(1);
		firstResolver.setCheckExistence(true);
		return firstResolver;
	}

	@Bean
	public ClassLoaderTemplateResolver getCustomerResolver() {
		return getResolver(customer_path);
	}

	@Bean
	public ClassLoaderTemplateResolver getAdminResolver() {
		return getResolver(admin_path);
	}

//
	@Bean
	public ClassLoaderTemplateResolver getEmployeeResolver() {
		return getResolver(employee_path);
	}

//
	@Bean
	public ClassLoaderTemplateResolver getEmployerResolver() {
		return getResolver(employer_path);
	}
}
