package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Movie;

@Service

public class ApiService {

	
	/**
	 * @Since : 2022. 11. 23.
	 * @Author : sue
	 * @Return : List<movie>
	 * @Comment : 영화 만들기
	 */
	public List<Movie> makeMovies() {
		
		List<Movie> list = new ArrayList<Movie>();
		
		Movie movi1 = new Movie(); // 클래스 1
//		System.out.println(movi1); // 클래스의 주소를 알 수 있다.
		movi1.setTitle ("Just freinds");
		movi1.setYear ( "2005");
		movi1.setRuntime ( "96 min");
		movi1.setGenre ( "Comedy , Romence");
		
		Movie movi2 = new Movie(); // 클래스 2
//		System.out.println(movi2);
		movi2.setTitle ("Harry Potter and the Sorcerer's Stone");
		movi2.setYear ( "2001");
		movi2.setRuntime ( "152 min");
		movi2.setGenre ( "fantasy , action");
		
		Movie movi3 = new Movie();
		movi3.setTitle ("Harry Potter and the Chamber of Secrets");
		movi3.setYear ( "2002");
		movi3.setRuntime ( "161 min");
		movi3.setGenre ( "fantasy , action");
		
		list.add(movi1);
		list.add(movi2);
		list.add(movi3);
		
		return list;
	}
}
