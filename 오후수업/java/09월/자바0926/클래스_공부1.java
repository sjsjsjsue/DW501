package 자바0926;


/*class 붕어빵 {
	public static String 붕어빵을만들다(String 재료) {
	return "팥 붕어빵";
	}
} */

class 붕어빵{
	public static String 붕어빵을만들다(String 재료) {
		return 재료+" 붕어빵을 만들었습니다~";
}
	
	public static int 붕어빵수량을파악하다(int 수량) {
		return 수량;}	
}

//클래스 이름을 만들때는 항상 앞자리는 대문자를 입력
//클래스 안에 메소드가 위치한다.
// 프로젝트 -> 패키지 -> 클래스 -> 메소드(가장 작은 단위)
// 자바 파일에 public class가 1개만 작성 할 수 있다.(단, 외부클래스일 경우) 
class Pizza {
	
	/*
	 * public static : 접근제어자
	 * void :리턴타입
	 * 피자를먹다 : 메소드 이름
	 * 없음 : 파라미터 타입
	 * */
	public static void 피자를먹다() {
		System.out.println("백종원피자 냠냠");//정의만 해놓은 것이라 사용한 것은 아님.
	}
	
	/*
	 * public static : 접근제어자
	 * String :리턴타입
	 * 피자를주문하다 : 메소드 이름
	 * String , int : 파라미터 타입
	 * */
	public static String 피자를주문하다(String 피자이름 , int 수량) {
		return "불고기피자";
	}

}


public class 클래스_공부1 {
// public : 파일 이름을 뜻함.
	
	public static void main(String[] args) {
//		0926
		
		
		/*
		 * int x = 100;
		 * int  : 데이터 타입
		 * x = 변수 이름
		 * = : 대입연산자
		 * 100; : 데이터
		 * */
		
		/*
		 *Pizza : 데이터타입(자바는 클래스도 데이터 타입이다. 기본 데이터타입 8 + 클래스 1 = 9개
		 * p : 변수 이름
		 * new Pizza() : 클래스 데이터
		 * 
		 * */
		Pizza p = new Pizza();
//		new Pizza(); : Pizza 클래스를 불러온 것
		p.피자를먹다(); // Pizza 클래스 안에 있는 "피자를먹다" 메소드 호출(불러옴).
//		" p.피자를먹다() 비슷한 개념 배열의 array.length." array 안에 있는 길이를 호출하겠다.
		
		
/*		String 팥붕어빵 = "팥 붕어빵";
		System.out.println(팥붕어빵+"을 만들었습니다."); */
		
		붕어빵 팥붕어빵 = new 붕어빵();
		String 재료 = 팥붕어빵.붕어빵을만들다("팥");
		System.out.println(팥붕어빵.붕어빵을만들다("팥"));
		
//		붕어빵 수량 = new 붕어빵();
//		System.out.println("붕어빵은 " + 수량.붕어빵수량을파악하다(10) + "개 있습니다.");
		int 수량 = 팥붕어빵.붕어빵수량을파악하다(10);
		System.out.println("붕어빵은 "+수량+"개 있습니다.");
		
/*
 * 메소드를 사용하는 이유? 업무 분담
 * src : 소스
 * 클래스를 사용하는 이유? 업무 분담. 
 * 혼자 일할 거면 class 와 메소드 필요없음.
 * */
	}

}
