package com.tmdt.app.exception;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(AccessDeniedException.class)
	public String getDuplicateEntryError(Exception exception, WebRequest webRequest) {
		return "login";
	}
}
