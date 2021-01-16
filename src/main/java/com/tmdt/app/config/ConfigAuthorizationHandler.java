package com.tmdt.app.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class ConfigAuthorizationHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	@Override
	protected String getTargetUrlParameter() {
		return super.getTargetUrlParameter();
	}

	@Override
	protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) {
		Map<String, String> urlRoleMap = new HashMap<>();
		urlRoleMap.put("ROLE_ADMIN", "/dashboard");
		urlRoleMap.put("ROLE_EMPLOYEE", "/");
		urlRoleMap.put("ROLE_EMPLOYER", "/");
		for (GrantedAuthority authority : authentication.getAuthorities()) {
			String authName = authority.getAuthority();
			if (urlRoleMap.containsKey(authName)) {
				return urlRoleMap.get(authName);
			}
		}
		throw new IllegalStateException();
	}
}
