package cafe.control;

import java.util.Scanner;

import cafe.BO.Member_service;
import cafe.DAO.Member_DAO;

public class signin implements menu_able {

	@Override
	public boolean menu_active() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Member_service ms = new Member_service();
		String id=null, name=null, tel=null, email=null;
		do {
		System.out.println("회원가입 양식");
		
		// ===============================
		
		System.out.print("아이디 : ");
			id = sc.nextLine();
		System.out.print("이름 : ");
			name = sc.nextLine();
		System.out.print("연락처 : ");
			tel = sc.nextLine();
		System.out.print("이메일 : ");
			email = sc.nextLine();
		
		// =============입력 항목=====================
		
		
		}while ( !(ms.sign_member(id, name, tel, email)) ); 
			
			return true;
		
		
	}
	

}
