package com.dw.springcrudjpa.mapper;

public interface DeptMapper {
  // dept 테이블 조회
  public List<DeptVO> selectDept;

  // dept 추가
  public int insertDept(DeptVO vo);
}
