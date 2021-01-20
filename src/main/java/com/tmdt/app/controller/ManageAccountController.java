package com.tmdt.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmdt.app.map.PageMap;
import com.tmdt.app.model.User;
import com.tmdt.app.service.ManageAccountService;

@Controller
public class ManageAccountController {
	@Autowired
	@Qualifier("account-pages")
	private PageMap pageMap;
	@Autowired
	private ManageAccountService service;

	@GetMapping("/account")
	@PreAuthorize(value = "hasAnyAuthority('ROLE_ADMIN', 'ROLE_EMPLOYEE', 'ROLE_EMPLOYER')")
	public String showManageAccountForm(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = service.getUser(authentication.getName());
		model.addAttribute("user", user);
		return getDirectPage(authentication);
	}

	private String getDirectPage(Authentication authentication) {
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority authority : authorities) {
			if (authority.getAuthority().startsWith("ROLE_")) {
				return pageMap.getPathMap(authority.getAuthority());
			}
		}
		throw new IllegalStateException();
	}

	@PostMapping("/account")
	public String updateUserInfo(@ModelAttribute("user") User user, Model model, @RequestParam String userId) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		user.setId(Long.parseLong(userId));
		String inputPassword = user.getPassword();
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(inputPassword != null && !inputPassword.isEmpty() ? encoder.encode(inputPassword) : null);
		User updateUser = service.updateUser(user);
		model.addAttribute("user", updateUser);
		return getDirectPage(authentication);
	}
}
