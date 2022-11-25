package cafe.BO;

import cafe.DAO.Member_DAO;

public class Member_service {
	private Member_DAO mdao = new Member_DAO();
	
	
	public boolean login(String id, String pw) {
		boolean chk = mdao.login(id, pw);
		
		if(chk) {
			System.out.println("로그인 실패!");
			return true; // 로그인 실패 - 아이디, 비번 틀렸거나 없는 경우
		}else
			mdao.login(id, pw);
		System.out.println("로그인 성공!!!");
		return false; // 로그인 성공 - 아이디, 비번이 일치하는 경우
		
	}
	
	
	
	public boolean sign_member(String id, String name, String tel, String email) {
		boolean check = mdao.id_check(id, email);
		// id_check 메소드를 통해 아이디와 이메일의 중복 여부 확인. 중복이면 회원가입 안됨.
		
		if(check) {// 중복이라면
			System.out.println("아이디 또는 이메일이 중복입니다.");
			return false;
			
		}else // 중복이 아니라면
			mdao.member_insert(id, name, tel, email);
		System.out.println("회원가입을 축하드립니다 ^_^");
		
		
		return true;
	}

	
}
