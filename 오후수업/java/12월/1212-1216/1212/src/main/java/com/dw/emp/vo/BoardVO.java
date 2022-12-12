package com.dw.emp.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int board_no;
	private String title;
	private String contents;
	private String writer;
	private String creat_at;
	private int board_count;

}
