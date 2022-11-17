package house;

public class main_house {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		tv t = new tv();
		aircon air = new aircon();
		air.brand = "휘센";
		air.price = 1200000;
		System.out.println(air.brand);
		System.out.println(t.onoff);
		
		t.power(); // true
		t.power(); // false
		air.power(); // true
*/
//		
//		tv t1 = new tv("삼성",1230000);
//		tv t2 = new tv("LG",985000);
//		
//		aircon air1 = new aircon("휘센",940000);
//		aircon air2 = new aircon("위니아",560000);
//		
//		computer com1 = new computer("정수PC",780000);
		// 아무리 상속관계여도 자식 클래스로 생성하려고 하면 생성자 메소드가 없다면 실행이 안됨.
	
//	System.out.println(t1.toString());
	
		house_item[] t = new tv[] {
				new tv("삼성",1230000,65),
				new tv("LG",1505000,65),
				new tv("삼성",890000,55),
				new tv("LG",224000,75),
				new tv("삼성",73000,50),
				};
		
		house_item[] air = new aircon[] {
					new aircon("휘센",1510510,17),
					new aircon("캐리어",1619800,25),
					new aircon("휘센",1587110,30),
					new aircon("위니아",189000,17),
					new aircon("비스포크",1878590,19),
					};
		t[0].buy(); 
		
		air[1].buy();
		
	}

}
