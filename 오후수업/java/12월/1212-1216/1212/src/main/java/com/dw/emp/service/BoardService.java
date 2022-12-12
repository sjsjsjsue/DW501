package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoardVO;

@Service
public class BoardService {

@Autowired
	BoardMapper boardMapper;

public List<BoardVO> selectBoard(){
	return boardMapper.selectBoard();
}

public int insertBoard(@RequestBody BoardVO vo) {
	return boardMapper.insertBoard(vo);
}

public int addBoard(@RequestBody BoardVO vo) {
	return boardMapper.addBoard(vo);
}

public BoardVO selectBoardFindByBoardNo(int boardNo){
	return boardMapper.selectBoardFindByBoardNo(boardNo);
}
public int deleteBoard(@RequestBody BoardVO vo) {
	return boardMapper.deleteBoard(vo);
}

public int updateBoard(@RequestBody BoardVO vo) {
	return boardMapper.updateBoard(vo);
}

}
