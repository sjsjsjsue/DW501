package cafe.BO;

import java.util.Map;

import cafe.DAO.Food_DAO;
import cafe.VO.food;
import cafe.main.cafe_main;

public class Food_service {
	private Food_DAO fdao = new Food_DAO();
	
	
	public void order_food(int seq) {
		
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
				if(my_Order.getAllergy().contains(all) && tmp.equals("x")) { 
					// contains : 문자열이 해당되어있는가 안되어있는가를 알려줌
					System.out.println("주문하신 음식은 알레르기 유발 음식입니다.");
				}
			}
			
		}else {
			System.out.println("관리자에게 문의하세요!");
		}
	}
	
}
