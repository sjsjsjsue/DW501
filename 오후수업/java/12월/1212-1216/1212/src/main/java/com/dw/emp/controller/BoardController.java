package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

	@GetMapping("/board")
	public String loadPage() {
		return "board";
	}
	@GetMapping("/board/{boardNo}")
	public String loadPage(@PathVariable int boardNo, ModelMap map) {
		// url 로 받아온 게시판 번호를 update.html 에 다시 전달
		map.addAttribute("boardNo",boardNo);
		return "update";
	}
	@GetMapping("/write")
	public String loadPage1() {
		return "write";
	}
}
