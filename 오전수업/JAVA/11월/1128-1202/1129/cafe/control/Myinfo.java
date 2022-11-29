package cafe.control;

import java.util.Scanner;

import cafe.BO.Myinfo_service;
import cafe.main.cafe_main;

public class Myinfo implements menu_able {

	
//	Myinfo 클래스에 할 일
//	로그인 한 회원의 정보 확인, 주문 내역 확인, 지갑 확인
	
	private Myinfo_service mysvc = new Myinfo_service();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean menu_active() {
		// TODO Auto-generated method stub
		if(cafe_main.user == null) {
			System.out.printf("로그인 먼저 해주세요%n ===========%n%n");
			return true;
		}
		System.out.println("1. 내정보   2. 주문 내역   3. 내 지갑  :");
		int select = sc.nextInt();
		switch(select) { // 위 메뉴를 선택했다면 그에 맞는 동작 실행
		case 1 : mysvc.info(); break; // 내 정보 메뉴 선택시
		case 2 : mysvc.order_list(); break; // 주문 내역 메뉴 선택시
		case 3 : mysvc.my_wallet(); break; // 내 지갑 메뉴 선택시
		}
		
		return true;
	}


}
