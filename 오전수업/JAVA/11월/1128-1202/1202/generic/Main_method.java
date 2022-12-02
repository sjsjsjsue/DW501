package generic;

import java.util.ArrayList;

public class Main_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Seafood_box<Seafood> 해산물박스 = new Seafood_box<>();
		해산물박스.setBox(new Seafood());
		해산물박스.setBox(new 오징어());
		해산물박스.setBox(new 참치());
		해산물박스.setBox(new 새우());
		
		// 해산물박스.setBox(new 소고기()); // 상속관계가 아님
		
		Seafood_box<새우> 새우박스 = new Seafood_box<>();
		새우박스.setBox(new 새우());
		
		Seafood_box<오징어> 오징어박스 = new Seafood_box<>();
		오징어박스.sellBox();
		
		구매 구매자 = new 구매();
		구매자.buy(오징어박스);
		구매자.buy( 새우박스 ); // 새우박스를 넣었는데 오류로 나오는 이유는 
		
		//Seafood_box<소고기> 소고기박스 = new Seafood_box<>();
		// 소고기박스.setBox(new 소고기()); // 타입을 소고기로 변경해서 들어갈 수 있다.
		
		/*
		Seafood_box<오징어> 오징어박스 = new Seafood_box<>();
		
		오징어박스.setBox(new 오징어());
		오징어박스.sellBox();
		
		Seafood_box<새우> 새우박스 = new Seafood_box<>();
		새우박스.setBox(new 새우());
		
		오징어박스.setBox(new 참치());
		*/
		/*Seafood<String> sea = new Seafood<String>();
		sea.store("김기원주율");
		System.out.println(sea.sell());
		
		//sea.store(1200); // String 으로 했기 때문에 정수가 오는 것은 오류!
		 */
		
		
/*		ArrayList<Integer> list = new ArrayList<>();
		// Integer : 타입이 정수만 가능 / String : 문자열만 가능
		list.add(100);
		list.add(200);
		list.add(342);
		// list.add(3.14);
		// list.add("박영주 목발");
		
		System.out.println(list);
	*/	

	}

}
