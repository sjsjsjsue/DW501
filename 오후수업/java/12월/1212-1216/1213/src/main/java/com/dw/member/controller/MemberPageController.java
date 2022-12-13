package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberPageController {

	@GetMapping("/memberJoin")
	public String loadPage() {
		return "member";
	}
}
