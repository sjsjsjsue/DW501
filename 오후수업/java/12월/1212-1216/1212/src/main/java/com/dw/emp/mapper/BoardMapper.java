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
	
	// 작성한 쿼리ID와 메소드 이름이 동일해야 매핑(연결)이된다.
	// insert, delete, update는 int 로 리턴함
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : sue
	 * @Return : int
	 * @Comment : 게시판 추가1
	 */
	public int addBoard(BoardVO vo);
	
	BoardVO selectBoardFindByBoardNo(int boardNo);
	
	int deleteBoard(BoardVO vo);
	
	int updateBoard(BoardVO vo);
}
