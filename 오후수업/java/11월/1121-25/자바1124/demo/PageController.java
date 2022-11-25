package com.example.demo;

import org.springframework.stereotype.Controller;
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
	
	
}
