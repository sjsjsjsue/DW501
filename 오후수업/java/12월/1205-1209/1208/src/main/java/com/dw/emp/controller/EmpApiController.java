package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dw.emp.service.EmpService;
import com.dw.emp.vo.EmpVO;

@RestController
public class EmpApiController {

	@Autowired
	EmpService empService;
	
	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp(){
		return empService.selectEmp();
	}
	
	@GetMapping("/api/v1/emp/{empno}")
	public EmpVO callEmp(@PathVariable int empno) {
		return empService.selectEmpfindByEmpno(empno);
	}
//emp 추가
	@PostMapping("/api/v1/emp/join")
	public int callEmpJoin(@RequestBody EmpVO vo ) {
		return empService.insertEmp(vo);
	}
	@PatchMapping("/api/v1/emp")
	public int callEmpUpdate(@RequestBody EmpVO vo) {
		return empService.updateEmp(vo);
	}
	@DeleteMapping("/api/v1/emp/{empno}")
	public int callEmpDelete(@PathVariable int empno) {
		return empService.deleteEmp(empno);
	}
}
