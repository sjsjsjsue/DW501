package com.dw.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Dept;
import com.dw.member.model.Member;
import com.dw.member.repository.DeptRepo;
import com.dw.member.repository.MemberRepo;

@RestController
public class MemberController {

	@Autowired
	MemberRepo repo;
	
	@Autowired
	DeptRepo drepo;

	@PostMapping("/api/v1/login")
	public boolean callLogin(@RequestBody Member member, HttpServletRequest request) {

		Member m = repo.findByuserIdAndUserPassword(member.getUserId(), member.getUserPassword());
		if (m != null) {
			HttpSession session = request.getSession(); // 세션 불러오기
			session.setAttribute( "userId", m.getUserId());
			// System.out.println("이름은 : " + m.getName());
			return true;
		} else {
			return false;
		}
		
	}
	
	// 전체 조회
	@GetMapping("/api/v1/member")
	public List<Member> callAllMembers(){
//		findAll == select * from <테이블 이름>
		return repo.findAll();
	}
	
	// 추가
	// JPA 에서는 delete할 때 int 형으로 하지 않음
	@PostMapping("/api/v1/member")
	public Member callSaveMember(@RequestBody Member member) {
//		save == insert
		member = repo.save(member);
		return member;
	}
	
//	삭제
	@DeleteMapping("/api/v1/member/{id}")
	public boolean callDeleteMemeber(@PathVariable long id) {
		
//		deleteById == delete
//		by == where
		try {
			repo.deleteById(id); // 리턴 타입이 void 
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	// 상세조회
	@GetMapping("/api/v1/member/{id}")
	public Member callMemberById(@PathVariable long id) {
//		findById == select # from emp where empno = 333;
		return repo.findById(id).get();
	}
//	수정
	@PatchMapping("/api/v1/memeber")
	public Member updateMember(@RequestBody Member member) {
//		save == update or insert
//		동일한 pk값이 있으면 update
//		동일한 pk값이 없으면 insert
		member = repo.save(member);
		return member;
	}
	
	// 부서 전체 조회
	@GetMapping("/api/v1/dept")
	public List<Dept> callAllDept(){
		return drepo.findAll();
	}
	// 부서 추가
	@PostMapping("/api/v1/dept")
	public Dept callSaveDept(@RequestBody Dept dept) {
		dept = drepo.save(dept);
		return dept;
	}
	// 부서 상세 조회
	@GetMapping("/api/v1/dept/{id}")
	public Dept callDeptById(@PathVariable long id) {
		return drepo.findById(id).get();
	}
	
	// 부서 수정
	@PatchMapping("/api/v1/dept")
	public Dept updateDept(@RequestBody Dept dept) {
		dept = drepo.save(dept);
		return dept;
	}
	
	// 부서 삭제
	@DeleteMapping("/api/v1/dept/{id}")
	public boolean deleteDept(@PathVariable long id) {
		try {
			drepo.deleteById(id); // 리턴 타입이 void 
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	

}
