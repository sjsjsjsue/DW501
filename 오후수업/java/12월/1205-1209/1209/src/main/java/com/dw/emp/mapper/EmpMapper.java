package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	public List<EmpVO> selectEmp();
	
	public EmpVO selectEmpfindByEmpno(int empno);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 사원 추가
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 사원 수정
	 */
	int updateEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 사원 삭제
	 */
	int deleteEmp(int empno);

	

}
