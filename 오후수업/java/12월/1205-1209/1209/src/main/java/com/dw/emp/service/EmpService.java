package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.BoardVO;
import com.dw.emp.vo.EmpVO;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}
	
	public int insertEmp(@RequestBody EmpVO vo) {
		return empMapper.insertEmp(vo);
	}
	public int updateEmp(@RequestBody EmpVO vo) {
		return empMapper.updateEmp(vo);
	}
	public int deleteEmp(@PathVariable int empno) {
		return empMapper.deleteEmp(empno);
	}

	

}
