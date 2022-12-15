package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dw.member.model.Member;

//JAP를 상속받는다
// @Mapper라는 어노테이션을 사용 x
public interface MemberRepo extends JpaRepository<Member, Long> {
  // JpaRepository 안에 쿼리가 다 작성되어있음 ^^
  // JPA 는 자바로 쿼리를 작성한다.

Member findByUserId(String userId);
// == select * from dw_member where user_id = "dw"

Member findByuserIdAndUserPassword(String userId, String userPassword);
//  == select * from dw_member where user_id = "dw" and userPassword =='123';

Member findByName(String name);
//  == select * from dw_member where name = "홍길동"
}