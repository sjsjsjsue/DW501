package 자바0913;

public class 메소드공부2 {

//	리턴타입이 void 이면 return 을 명시하지 않는다.
/*
	 * 게임(크레이지아케이드)
	 * 메소드(기능)
	 * 1. 물폭탄을 설치하다.
	 * 2. 물폭탄이 터진다.
	 * 3. 아이템을 먹다.
	 * 4. 캐릭터를 선택하다.
 * */
	public static void 캐릭터를선택하다(String 캐릭터이름) {
		System.out.println("당신이 선택한 캐릭터 이름은?" + 캐릭터이름);
	}
	
	public static void 아이템을먹다(String 아이템) {
		 System.out.println(아이템+"을 먹었습니다.");
	}
	
	public static void main(String[] args) {
		
//정의한 메소드를 불러온다. ( == 메서드 호출)
		캐릭터를선택하다("배찌");
		아이템을먹다("UFO");
		
		

	}

}
