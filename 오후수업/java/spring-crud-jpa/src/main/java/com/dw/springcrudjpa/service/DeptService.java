package com.dw.springcrudjpa.service;

public class DeptService {
  

  @Autowired
	DeptMapper deptMapper;

  // dept 조회
  public List<DeptVO> selectDept(){
		return deptMapper.selectDept();
	}
  
  // dept 추가
  public DeptVO insertDept(){
    return deptMapper.insertDept;
  }
}
