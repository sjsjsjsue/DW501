package com.dw.springcrudjpa.controller;

public class DeptApiController {
 
  @Autowired
	DeptService deptService;

  //dept 게시물 조회
  @GetMapping("/api/v1/dept")
	public List<DeptVO> callDept(){
		return DeptService.selectDept();
	}

  // dept 게시물 추가
  @PostMapping("/api/v1/dept/join")
  public int callDeptJoin(@RequestBody DeptVO vo){
    return DeptService.insertDept(vo);
  }
}
