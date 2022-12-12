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

import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoardVO;


@RestController
public class BoardApiController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardService.selectBoard();
	}
	// 게시물 생성
	@PostMapping("/api/v1/board/join")
	public int callBoardJoin(@RequestBody BoardVO vo) {
		return boardService.insertBoard(vo);
	}
	@PostMapping("/api/v1/boardcall")
	public int callBoardSave(@RequestBody BoardVO vo) {
		
		return boardService.addBoard(vo);
	}
	// 게시물 상세조회
	@GetMapping("/api/v1/board/{boardNo}")
	public BoardVO callBoard(@PathVariable int boardNo) {
		return boardService.selectBoardFindByBoardNo(boardNo);
	}
	@DeleteMapping("/api/v1/board/{boardNo}")
	public int callBoardDelete(@PathVariable BoardVO vo) {
		return boardService.deleteBoard(vo);
	}
	@PatchMapping("/api/v1/boardupdate")
	public int callBoardUpdate(@RequestBody BoardVO vo) {
		return boardService.updateBoard(vo);
	}
}
