package cafe.BO;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import cafe.DAO.Food_DAO;
import cafe.DAO.Member_DAO;
import cafe.VO.Member;
import cafe.VO.Order_list;
import cafe.main.cafe_main;

public class Myinfo_service {
	
	private Member_DAO mdao = new Member_DAO();
	private Food_DAO fdao = new Food_DAO();
	
	public void info() {
//	 내 정보	
		DecimalFormat fmt = new DecimalFormat("###,###");
		// 3자리마다 콤마를 찍어주겠다.
		Member my = cafe_main.user;
		System.out.println("아이디 : "+ my.getId());
		System.out.println("이름 : "+ my.getName());
		System.out.println("연락처 : "+ my.getTel());
		System.out.println("이메일 : "+ my.getEmail());
		System.out.println("알레르기 : "+ my.getAllergy());
		System.out.println("잔액 : "+ fmt.format( my.getMoney() )+"원");
		
	}
	
	public void order_list() {
//		내 주문내역
		List<Order_list> list = fdao.order_select(cafe_main.user.getId());
		Iterator<Order_list> it = list.iterator();
//		Iterator 참고 1129.md
		while(it.hasNext()) {
//			hasNext() : 참고 1129.md
			Order_list data = it.next();
			System.out.println("주문음식 : " + data.getFood_name());
			System.out.println("주문자 : " + data.getAn_order());
			System.out.println("주문 금액 : " + data.getPrice());
			
			String state = data.getDeliver_complete() == 0? "배달 중":"배달완료";
			System.out.println("배달 상태 : " + state);
			System.out.println("요청사항 : " + data.getMemo());
			
		}
		
	}
	public void my_wallet() {
//		내 지갑
		
	}
	
}
