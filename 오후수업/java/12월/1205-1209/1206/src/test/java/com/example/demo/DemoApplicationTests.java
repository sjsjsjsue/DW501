package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.vo.UserVO;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmpMapper empMappper;
	@Test 
	void contextLoads() {
		// test 코드 메인함수
	// 작성한 쿼리 테스트하기!
		
		UserVO vo = new UserVO();
		vo.setId("2");
		System.out.println("ID : "+vo.getId());
		System.out.println("PW : "+vo.getPw() );
		int rows = empMappper.selectUsersFindById(vo);
		System.out.println("rows =>" + rows);
		
	}

}
