package cafe.control;

import java.util.Scanner;

import cafe.BO.Food_service;
import cafe.main.cafe_main;




public class order implements menu_able {

	@Override
	public boolean menu_active() { // 인터페이스가 가지고 있는 추상메소드
		// TODO Auto-generated method stub
		
		Food_service food =  new Food_service();
		
		
		// 로그인 하지않으면 주문 못함. 메뉴도 못본다.
		// 로그인 해야 볼 수 있다. 를 만들기!
		
		if(cafe_main.user== null) { // 로그인을 하지 않으면 user == null
			System.out.println("로그인을 먼저 해주세요");
		}else {
			while( food.order_food( menu() ) ); // 주문처리 하는 곳
			// 유저라면 menu()라는 함수가 보이게..
		}
		
		return true; 
	}
	private int menu() {
		String [] mlist = {"안먹고싶음","닭볶음탕","코코볼","보쌈","조개찜","불고기",
				"건빵후레이크","김치국","연어초밥","열라면","순두부찌개","불족발","당당치킨",
				"까르보나라","마라탕","부대찌개"};
		
		int i=1;
		for(String m : mlist) {
			System.out.println(i+". "+m);	
			i++;
		}
			System.out.println("선택 : ");
			return new Scanner(System.in).nextInt();
		
	}
	

}
