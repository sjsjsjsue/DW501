package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;

//참고 : 1128.md
@Mapper
public interface EmpMapper {

	/**
	 * @Since : 2022. 11. 28.
	 * @Author : sue
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회
	 */
	List<EmpVO> selectEmp();
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : sue
	 * @Return : List<DeptVO>
	 * @Comment : Dept 테이블 전체 조회
	 */
	List<DeptVO> selectDept();
	// 내가 작성한 쿼리가 많이 나오면 List
	
	int insertEmp(EmpVO vo);

}
