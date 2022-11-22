package house;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class buyer {
	
	private int  money = 10000000;
	private String name = "장영주"; // 명시적 초기
	private String special_note = "발 부상";
	private List<house_item> buy_list = null; // 구매한 제품 목록으로 저장.
	
	{
		// 인스턴스 초기화블럭
		special_note = "목발 하나만 필요";
	}
	public buyer () {
		buy_list = new ArrayList<>();
		special_note = "두 발로 걸어다님";
	}
	
	public void buy(house_item item) { // 매개변수를 다형성으로 표현
		if(money < item.price) {
			System.out.println("돈이 부족합니다... 목발을 팔아주세요");
			return;
		}
		buy_list.add(item);
		money -= item.price;
		DecimalFormat df = new DecimalFormat("###,###"); // 세자리마다 , (콤마) 찍어주겠다. 
		System.out.println("현재 잔액은 "+df.format(money)+"원 남았습니다.");
			
	}
	
	public void buylist() {
		for(house_item item : buy_list) {
			System.out.println(item.toString());
		}
	}
	

}
