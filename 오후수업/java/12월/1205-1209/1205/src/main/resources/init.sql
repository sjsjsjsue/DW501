-- 사용자 테이블
CREATE TABLE users (
  id varchar(50) DEFAULT NULL COMMENT '유저 아이디',
  pw varchar(200) DEFAULT NULL COMMENT '비밀번호',
  name varchar(30) DEFAULT NULL COMMENT '유저 이름'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;