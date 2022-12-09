package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;
@Mapper
public interface BoardMapper {
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : sue
	 * @Return : List<BoardVO>
	 * @Comment : 게시판 전체 조회
	 */
	List<BoardVO> selectBoard();
	
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 게시판 추가
	 */
	int insertBoard(BoardVO vo);
}
