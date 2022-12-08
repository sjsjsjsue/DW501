package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.ApiService;
import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.Login;
import com.example.demo.vo.Login2;
import com.example.demo.vo.Movie;
import com.example.demo.vo.UserVO;

//Rest : 자원(데이터)
@RestController
public class ApiController {

	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	ApiService apiService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
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
		
		// @Autowired
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
	// 데이터 전송 : POST
	@PostMapping("/api/v1/join")
	public boolean callJoin(@RequestBody Login login) {
		System.out.println("HTML 서버로 받아온 데이터입니다.");
		System.out.println("아이디 : "+login.getUserId());
		System.out.println("이메일 : "+login.getUserEmail());
		System.out.println("비밀번호 : "+login.getUserPassword());
		return true;
	}
	
	// C(Create) R(Read) U(Update) D(Delete)
	// Get : 데이터 조회 == select(SQL)
	// Post : 데이터 생성 == Insert(SQL)
	// Patch : 데이터 업데이트 == Update(SQL)
	// Delete : 데이터 삭제 == DELETE (SQL)
	@PostMapping("api/v1/join2")
	public boolean callJoin(@RequestBody Login2 login2, HttpServletRequest request) { //오버로딩
		
		String ip = request.getRemoteAddr(); // ip 추적
		System.out.println("요청받은 IP : " + ip);
		
		System.out.println("HTML 서버로 받아온 데이터입니다.");
		System.out.println("이름 : "+login2.getUserName());
		System.out.println("비밀번호 : "+login2.getPassword());
		System.out.println("회사이름 : "+login2.getCompanyName());
		return true;
	}
	
	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp(){
		return empMapper.selectEmp();
	}
	@GetMapping("/api/v1/dept")
	public List<DeptVO> callDept(){
		return empMapper.selectDept();
	}
	
	@PostMapping("/api/v1/emp/join")
	public int callEmpjoin(@RequestBody EmpVO emp) {
		
		return empMapper.insertEmp(emp);
	}
	@DeleteMapping("/api/v1/emp/{empno}")
	public int callEmpDelete(@PathVariable int empno) {
		return empMapper.deleteEmp(empno);
	}
	
	@PostMapping("/api/v1/dept/join")
	public int callDeptjoin(@RequestBody DeptVO dept) {
		
		return empMapper.insertDept(dept);
	}
	@DeleteMapping("/api/v1/dept/{deptno}")
	public int callDeptDelete(@PathVariable int deptno) {
		return empMapper.deleteDept(deptno);
	}
	
	// update == patch
	@PatchMapping("/api/v1/emp")
	public int callEmpUpdate(@RequestBody EmpVO vo) {
		return empMapper.updateEmp(vo);
	}
	@PatchMapping("/api/v1/dept")
	public int callDeptUpdate(@RequestBody DeptVO vo) {
		return empMapper.updateDept(vo);
	}
	
	// 회원가입 login3 추가
	@PostMapping("/api/v1/users")
	public int callUsersJoin(@RequestBody UserVO vo) {
		
		String password = vo.getPw(); // HTML 에서 입력받은 비밀번호를 가져옴
		password = passwordEncoder.encode(password);
		// 비밀번호 암호화(SHA-1)
		vo.setPw(password);
		// 암호화된 비밀번호 set
		
		return empMapper.insertUsers(vo);
	}
	// 로그인	
	// 세션 : 참고 1206.md
	@PostMapping("/api/v1/login")
	public UserVO callUserLogin(@RequestBody UserVO vo, HttpServletRequest req) {
		
		String password = vo.getPw(); // HTML에서 가져온 패스워드
		
		vo = empMapper.selectUesrsPassword(vo);
		// 아이디 틀리면 vo 에 null 값이 들어감
		if(vo == null) {
			vo = new UserVO();
			vo.setUser(false);
		}
		String DBpassword = vo.getPw();// 데이터 베이스에 저장된 내 비밀번호
		
		boolean isUser = passwordEncoder.matches(password, DBpassword);
		if(!isUser) {
			vo.setUser(false);
			return vo;
		}
		
		// 고객정보를 세션에 넣기!
		HttpSession session = req.getSession();
		// 세션은 key 와 value 로 구성!(HashMap과 동일)
		// 세션은 서버가 종료될 때까지 데이터가 유지됨!(기본으로 가지고 있는 시간은 약 30분정도!)
		session.setAttribute("name", vo.getName());
		
		vo.setUser(true);
		return vo;
	}
	
	
	// users
	@GetMapping("/api/v1/user/join")
	public List<UserVO> callUser(){
		return empMapper.selectUser();
	}
	@GetMapping("/api/vi/users/{id}")
	public UserVO callUses() {
		
		return null;
	}
	
	@GetMapping("/api/v1/users/{id}")
	public boolean callUser(@PathVariable String id) {
		
	
		return apiService.checkUser(id); 
	}
	
}
