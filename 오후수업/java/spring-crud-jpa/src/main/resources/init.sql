-- dept 테이블 만들기
create table dept(
  num int(10) AUTO_INCREMENT PRIMARY KEY comment '과정번호',
	class_name varchar(100) comment '과정 명',
	class varchar(50) comment '과정 호실',
	start_date varchar(50) comment '시작 날짜',
  end_date varchar(50) comment '끝나는 날짜',
	teacher varchar(50) comment '선생님 이름'

)