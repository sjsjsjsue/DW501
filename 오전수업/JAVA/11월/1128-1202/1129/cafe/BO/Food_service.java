package cafe.BO;

import java.util.Map;
import java.util.Scanner;

import cafe.DAO.Food_DAO;
import cafe.VO.Order_list;
import cafe.VO.food;
import cafe.main.cafe_main;

public class Food_service {
	private Food_DAO fdao = new Food_DAO();
	private Scanner sc = new Scanner(System.in);
	
	public boolean order_food(int seq) {
		
		// 음식 주문하면 실행되는 메소드
		// 주문한 음식을 DB와 비교하여 해당 음식의 조리시간, 금액, 알러지 등등 정보 공개.
		
		Map<Integer, food>map = fdao.food_list();
		if(map!=null) {
			food my_Order = map.get(seq);
			System.out.println("주문 음식 : "+my_Order.getFood_name());
			System.out.println("조리 시간 : "+my_Order.getCook_time()+" 분");
			System.out.println("금액 : "+my_Order.getCost()+" 원");
			System.out.println("알러지 : "+my_Order.getAllergy());
			
			String[] tmp = cafe_main.user.getAllergy().split(","); // 회원가입할 때 입력시 알레르기 "," 구분해서 입력
			
			for(String all : tmp) {
				if(my_Order.getAllergy().contains(all) && !(tmp.equals("x"))) { 
					// contains : 문자열이 해당되어있는가 안되어있는가를 알려줌
					System.out.println("주문하신 음식은 알레르기 유발 음식입니다.");
					System.out.print("계속 주문하시겠습니까?(y/n) : ");
					
					if(sc.nextLine().equals("n")) {
						return true; // 알레르리 떄문에 다른 음식 주문하는 경우
					}
					break; // 음식에 알레르기 성분이 나왔으니 비교하는 것 멈추기
				}
			} // 반복문이 정상적으로 종료되면 주문을 계속 진행하겠다는 것.
			// 주문 내역 DB에 저장하기위한 코드 쭈욱 작성
			System.out.print("주문 요청사항 : ");
			String memo = sc.nextLine();
			Order_list cont = new Order_list(my_Order.getFood_name(),
											cafe_main.user.getId(),
											my_Order.getCost(),
											memo);
			// order_list 클래스 객체에 주문내역 저장하기
			// 주문 음식 이름, 주문자, 주문 금액, 요청 사항 순으로 저장하기.
			// 주문음식은 위에서 my_Order라는 이름으로 food_DAO 를 통해 DB에서 가지고 왓음.
			// 주문자 정보는 로그인 하면 user 에 저장되어있다.
			fdao.order_insert(cont);
			
			
		}
		else {
			System.out.println("관리자에게 문의하세요!");
			return true; // 프로그램 코드가 (DB 문제) 실행되지 않은 경우
		}
		return false; // 정상적으로 주문 처리가 된 경우
	}
	
}
