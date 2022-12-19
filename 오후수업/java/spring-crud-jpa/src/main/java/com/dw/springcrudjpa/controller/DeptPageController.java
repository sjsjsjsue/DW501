package com.dw.springcrudjpa.controller;

@controller
public class DeptPageController {

  @GetMapping("/dept")
	public String loadPage() {
		return "dept";
	}
}
