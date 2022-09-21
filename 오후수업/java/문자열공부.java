package 자바0913;

public class 문자열공부 {

	public static void main(String[] args) {
		
		String name = "황정민"; // 문자열 타입
		String name2 = "황정민";
//		자바에서 문자를 비교할 때는 == 를 사용하지 않음.
		
//		1. 문자 비교방법 equals
//		1.equals(2) => 문자 비교방법
		boolean isCheck = name.equals(name2); // name 과  name2를 비교함. 
//		.equals("문자" or 변수)를 써도 됨.
		System.out.println("name 하고 name2를 비교한 결과 -> "+isCheck);
/*		why? 자바에서 문자를 == 연산자로 비교하지 않고, equals 를 사용하는 이유는 
			자바에서 문자열은 클래스이기 때문에, == 연산자로 비교하게 되면 
			문자를 비교하는 것이 아니라 클래스를 비교하는 것이다.
			boolean 은 true or false 만 표현할 수 있다 ( if 와 비슷 )
		*/
		
//		2. 문자 길이 알아내기
		String 비밀번호 = "12341234";
		int 문자길이 = 비밀번호.length();
		System.out.println("문자길이는 => "+문자길이);
		
//		3. 문자 자르기
		String 핸드폰번호 = "010-1234-5678";
//		ex> 010 / 1234 / 5678 이렇게 자르고 싶어ㅓㅓㅓ
		String 배열[] = 핸드폰번호.split("-"); // split ("-") : "-" 기준으로 나누고싶어.
		System.out.println(배열[0]);
		System.out.println(배열[1]);
		System.out.println(배열[2]);

//		4. 특정 문자만 추출하기
		String 영화제목 = "어벤져스 인피니티 워";
		String 결과는 = 영화제목.substring(2); // "어벤" 이후로 문자를 보여준다.
		String 결과는2 = 영화제목.substring(0,4); // (0,4)는 0~4까지 문자보여준다. <-"어벤져스"만 나옴.
		System.out.println(결과는);
		System.out.println(결과는2);
	}

}
