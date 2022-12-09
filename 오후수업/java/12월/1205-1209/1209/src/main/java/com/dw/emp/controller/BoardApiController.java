package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	@PostMapping("/api/v1/board/join")
	public int callBoardJoin(@RequestBody BoardVO vo) {
		return boardService.insertBoard(vo);
	}



}
