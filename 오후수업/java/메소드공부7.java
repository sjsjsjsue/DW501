package 자바0913;

public class 메소드공부7 {

	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입
	 * getNum : 메소드 이름
	 * int x,String y : 파라미터 타입
	 * */
	
	
	public static int getNum(int x, String y) { // 파라미터 안에는 모든 데이터 타입 가능! 
		return 0;
	}
	
	
//	문제1: 아래 메소드 main 메소드에 호출해서 결과 확인하기
	public static int getNum(int x, String y, String z) {
		return 0;
	}
	
	/* 문제2. 메소드 만들기 -> main함수에 호출하시오.
	 * 접근 지정자 : public static
	 * 리턴 타입 : boolean
	 * 메소드 이름 : isTrue
	 * 파라미터 : boolean, String
	 */
	
	public static boolean isTrue(boolean x, String y) {
		return false;
	}
	
//	문제3.main 메소드 호출하고 결과 확인하기!
	public static String getStr() {
		return "피자빵";
	}
	
//	문제4. main 메소드 호출하고 결과 확인하기
	public static int 피자빵주세요 (int 빵) {
		return 빵;
	}
	
//	문제5. main 메소드 호출하고 결과 확인하기
	
	public static int 돈을인출하다(int 돈) {
		return 3000;
	}
	
//	문제 5 와 6은 메소드 이름(돈을인출하다)가 같으면 오버로딩
//	오버로딩이지만, 파라미터 타입, 파라미터 개수가 다르면 메소드 이름 중복사용 가능
//	문제6. main 메소드에 호출하고 결과 확인하기. 결과 3000
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}
		if(계좌.equals("농협")){
			return 돈;
		}
		return 0;
//		.equals -> 문자 비교 ( == )
//		return 은 대입하고 맞으면 아래를 실행 안함.
	}
	
	public static int 돈을해외로송금하다(int 금액, String 해외) {
		if(해외.equals("수리남")) {
			return 500;
		}
		return 금액;
	}

	public static int 섯다패를돌리다(String 결과) {
		if(결과.equals("장땡")) {
			return 500;
		}
		if(결과.equals("38")) {
			return 1000;
		}
		return 0;
	}
	
	public static boolean 말해YesOrNo(String 가수) {
		if("지코".equals(가수)) { // 지코 == 지코바 (no)
			return true;
		}
		if("지코".equals("지코")) { // 지코 == 지코 (yes)
			return false;
		}
		return true;
	}
	
	public static String 나는가수다() {
		if(1 !=1) {
			return "뉴진스";
		}
		if(1 == 1 ) { // 참이기 때문에
			return "아이브";
		}
		return "여자아이들";
	}
	
	public static void 무한도전(String 멤버이름) {
		if(멤버이름.equals("박명수")) {
			System.out.println("Hello");
		}
		if(5==5) {
			System.out.println("Hello");
		}
	}//결과값 2번의 Hello(2개가 참이면 둘 다 나옴)
	
	public static int 용돈을드리다(int 용돈금액, String 가족) {
		가족 = "아빠";
		if(가족.equals("엄마")) {
			return 용돈금액;
		}
		가족 = "엄마";
		if(가족.equals("아빠")) {
			return 용돈금액;
		}
		return 1000;
	}// 답 : 1000;

	
	public static void main(String[] args) {
		int x = getNum(10,"붕어빵"); //메소드 호출
//		메소드에 리턴이 있으면 대입이 가능하다. return 이 0일지라도...!!!
		
		int y = getNum(10,"붕어빵","가격");
		System.out.println(y);
//		문자열을 출력하고 싶으면 리턴타입을 String으로,  return 타입도 문자열로 바꾸면 가능!
		
		boolean isX = isTrue(true,"금요일");
		System.out.println(isX);
		
		String getBread = getStr();
		System.out.println(getBread);
		
		int 빵 = 피자빵주세요(100);
		System.out.println(빵);
//		100이 나오는 이유? ()안에 숫자를 입력했기때문에 return 값이 나옴

		int money = 돈을인출하다(1000); // 결과 3000
		
		int 돈 = 돈을인출하다(3000, "카카오뱅크");
		System.out.println(돈);
		
		int 금액 = 돈을해외로송금하다(300,"이탈리아");
//		금액: 300
		 
		int 섯다결과 = 섯다패를돌리다("39");
//		결과 : 0
		
		말해YesOrNo("지코바");
		무한도전("박명수");
		
		용돈을드리다(300,"엄마");
		
	}

}
