package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Contrller는 페이지 주소를 작성할 때 사용하는 어노테이션
@Controller
public class PageController {

	@GetMapping("/")
	public String callIndexPage() {
		return "index";
	}
	
	//사용자(클라이언트)가 /home 주소를 입력하면
	// home이름을 가진 html을 return 한다는 걸 의미.
	@GetMapping("/home")
	public String callHomePage() {
		return "home";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	

}