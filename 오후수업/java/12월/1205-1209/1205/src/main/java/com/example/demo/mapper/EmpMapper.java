package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.UserVO;

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
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 사원 추가
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 사원 삭제
	 */
	int deleteEmp(int empno);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 부서 추가
	 */
	int insertDept(DeptVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 부서 삭제
	 */
	int deleteDept(int deptno);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 사원정보 수정
	 */
	int updateEmp(EmpVO vo);
	
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 부서 정보 수정
	 */
	int updateDept(DeptVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 회원가입
	 */
	int insertUsers(UserVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 회원인지 아닌지 check췍
	 */
	int selectUsersFindById(UserVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : sue
	 * @Return : List<UserVO>
	 * @Comment : UserVO 테이블 전체 조회
	 */
	List<UserVO> selectUser();
}
