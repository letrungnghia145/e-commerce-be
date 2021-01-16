package com.tmdt.app.map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageMapStore {
	@Bean("account-pages")
	public PageMap getAccountPageMap() {
		return new PageMap("ROLE_ADMIN:admin-info", "ROLE_EMPLOYER:account", "ROLE_EMPLOYEE:account");
	}

//	@Bean("X-pages")
//	public PageMap getXPageMap() {
//		return new PageMap("ROLE_ADMIN:admin-info", "ROLE_EMPLOYER:account", "ROLE_EMPLOYEE:account");
//	}
}
