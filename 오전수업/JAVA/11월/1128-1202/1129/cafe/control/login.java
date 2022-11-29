package cafe.control;

import java.util.Scanner;

import cafe.BO.Member_service;

public class login implements menu_able {

	@Override
	public boolean menu_active() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String id=null, pw=null;
		boolean chk = true;
		Member_service ms = new Member_service();
		do {
		
			System.out.println("아이디 : ");
				id =sc.nextLine();
			System.out.println("비밀번호(연락처) : ");
				pw = sc.nextLine();
			chk = ms.login(id,pw);//로그인시도
			if(chk) { // 로그인 실패시...
				System.out.println("회원가입 하시겠습니까?(Y/N)");
				if(sc.nextLine().equals("y")) {
					new signin().menu_active();
				}
				
			}
			
		}while(chk);
		// do~while 종료되려면 로그인 성공해야 함.
		
		
		return true;
	}

}
