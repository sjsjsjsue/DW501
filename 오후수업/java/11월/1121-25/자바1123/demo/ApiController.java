package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Rest : 자원(데이터)
@RestController
public class ApiController {

	
	@GetMapping("/api/v1/sample")
	public List<String> callData(){
		
		List<String> list = new ArrayList<String>();
		list.add("삼겹살");
		list.add("오리고기");
		list.add("목살");
		
		return list; // 데이터를 받는 아이
		
	}
	// v : version
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {
		Movie movi = new Movie();
			movi.setTitle ("Just freinds");
			movi.setYear ( "2005");
			movi.setRuntime ( "96 min");
			movi.setGenre ( "Comedy , Romence");
			// movie 라는 객체를 전달함.
			return movi;
	
	}
	
	// url 이름은 중복될 수 없다.
	@GetMapping("/api/v1/movies")
	public List<Movie> callMovies(){
		
//		List<movie> list = new ArrayList<>();
//		movie movi1 = new movie(); // 클래스 1
////		System.out.println(movi1); // 클래스의 주소를 알 수 있다.
//		movi1.setTitle ("Just freinds");
//		movi1.setYear ( "2005");
//		movi1.setRuntime ( "96 min");
//		movi1.setGenre ( "Comedy , Romence");
//		
//		movie movi2 = new movie(); // 클래스 2
////		System.out.println(movi2);
//		movi2.setTitle ("Just freinds");
//		movi2.setYear ( "2005");
//		movi2.setRuntime ( "96 min");
//		movi2.setGenre ( "Comedy , Romence");
//		
//		list.add(movi1);
//		list.add(movi2);
		
		//@Autowired
		// ApiService service;
		ApiService service = new ApiService(); // 클래스 호출
		
		return service.makeMovies();
		// 이해가 안간다면 자바의 메소드 공부 다시!
		
		
	}
	
	// URL 을 이용한 데이터 받기
	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
	public int callArticle(@PathVariable int articleNumber) {
		return articleNumber;
	}
	
	// 쿼리스트링으로 데이터 받기
	// /api/v1/webtoon/list?titleId=758037&weekday=mon
	// Param == parameter
	@GetMapping("/api/v1/webtoon/list")
	public Map<String, Object> callWebtoon(@RequestParam int titleId, @RequestParam String weekday){
		
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		
		return map;
	}
	
	
//	@GetMapping("/api/v1/webtoon/list{titleId}{weekday}")
//	public int callWebtoon1(@PathVariable int titleId) {
//		return titleId;
//	}
	
	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
	public Map<String, Object> callWebtoon2(@PathVariable int titleId, @PathVariable String weekday){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		
		return map;
	}
	
}
