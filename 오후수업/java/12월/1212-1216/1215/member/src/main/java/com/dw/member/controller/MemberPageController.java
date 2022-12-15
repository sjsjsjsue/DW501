package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller 페이지 이동
@Controller
public class MemberPageController {

	@GetMapping("/memberJoin")
	public String loadPage() {
		return "member";
	}

	@GetMapping("/login")
	public String loadLoginPage() {
		return "login";
	}
}
