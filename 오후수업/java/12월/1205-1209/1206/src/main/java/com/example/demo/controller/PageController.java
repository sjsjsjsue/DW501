package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String callIndexPage() {
		// return  "html 파일 이름" 작성
	
		return "index";
	}
	
	@GetMapping("/home")
	public String callHomePage() {
		return "home";
	}
	
	@GetMapping("/sujeong")
	public String callSujeongPage() {
		return "sujeong";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	@GetMapping("/login2")
	public String callLoginPage2() {
		return "login2";
	}
	@GetMapping("/dept")
	public String callDept() {
		return "dept";
	}
	@GetMapping("/emp")
	public String callEmp() {
		return "emp";
	}
	@GetMapping("/login3")
	public String callLogin3() {
		return "login3";
	}
	
	@GetMapping("/users")
	public String callUsers(HttpServletRequest req, ModelMap map) {
		// ModelMap : 참고 1206.md
		
		HttpSession session = req.getSession();
		// 세션 호출
		String name = (String)session.getAttribute("name");
		// 세션에 저장한 데이터 호출
		System.out.println("name == > "+ name);
		map.addAttribute("name", name);
		// 사용자 이름 MAP에 추가
		
		return "users";
	}
}
