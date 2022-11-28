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
		String id=null, name=null, tel=null, email=null, allergy = null;
		// 회원가입 : 회원가입할 때 알레르기 입력하게 하기(알레르기 없다면 x 입력)
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
		System.out.println("알레르기 : ");
		allergy = sc.nextLine();
	// 알레르기 추가
		
		// =============입력 항목=====================
		
		
		}while ( !(ms.sign_member(id, name, tel, email, allergy)) ); 
			
			return true;
		
		
	}
	

}
