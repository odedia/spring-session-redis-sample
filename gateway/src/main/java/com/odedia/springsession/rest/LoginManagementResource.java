package com.odedia.springsession.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginManagementResource {

	@GetMapping(value = "/user")
	public String login(HttpServletRequest request, HttpSession session) {
		/*
		 * create new session if session is not new
		 */
		if (!session.isNew()) {
			session.invalidate();
		}
		return "Successful login!\n";
	}


	@GetMapping("/logout")
	public String logout() {
		return "redirect:/login";
	}
}
