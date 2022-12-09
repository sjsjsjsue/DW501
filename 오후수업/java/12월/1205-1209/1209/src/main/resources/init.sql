-- 게시판
CREATE TABLE board(
	board_no int(5) AUTO_INCREMENT PRIMARY KEY comment '게시판 번호',
	title varchar(50) comment '게시판 제목',
	contents varchar(300) comment '게시판 내용',
	writer varchar(30) comment '작성자',
	creat_at datetime DEFAULT current_timestamp comment '작성 날짜'
	board_count int(5) DEFAULT 0 comment '조회수'
)
