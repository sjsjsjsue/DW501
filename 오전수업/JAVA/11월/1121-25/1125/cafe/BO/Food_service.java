package cafe.BO;

import cafe.DAO.Food_DAO;

public class Food_service {
	private Food_DAO fdao = new Food_DAO();
	
	
	public void order_food(int seq) {
		
		// 음식 주문하면 실행되는 메소드
		// 주문한 음식을 DB와 비교하여 해당 음식의 조리시간, 금액, 알러지 등등 정보 공개.
		
		fdao.food_list();
	}
	
}
