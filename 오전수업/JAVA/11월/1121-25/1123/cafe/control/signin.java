package cafe.control;

import java.util.Scanner;

import cafe.DAO.Member_DAO;

public class signin implements menu_able {

	@Override
	public boolean menu_active() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입 양식");
		
		// ===============================
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("연락처 : ");
		String tel = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		// =============입력 항목=====================
		
		Member_DAO mdao = new Member_DAO();
		mdao.member_insert(id, name, tel, email);
		
		return true;
	}
	

}
