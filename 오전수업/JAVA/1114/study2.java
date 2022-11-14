package test1;

public class study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 한 줄 주석
		/*
		 * 여러 줄 주석
		 * */
		System.out.println("나는 자바다. 너는?");
//	syso 누르고 ctrl + space bar 누르면 System.out.println("); 나오고
// 저장하고 ctrl + F11 을 누르면 console 창이 나온다.
//	console 창이 안나면 window 누르고 show view 누르고 console 창을 찾으시오. 없으면 other 누르기!

		// 자바 출력 방법
		System.out.println("출력방법1");
		System.out.print("출력방법2");
		System.out.printf("출력방법3");
		
		System.out.printf("   %d    %f    %s   \n 줄바꿈도 된다. \n\n ㅋ",100, 3.14,"자바");
		System.out.println("  "+100+"   "+3.14+"   자바");
		System.out.println("줄 바꿈도 된다.");
/*
 * print vs println
 * println : line 을 줄여서 사용. 한 줄을 출력. 줄 바꿈 기능이 있음
 * print : 줄 바꿈 기능이 없음. 연속적으로 한 줄에 출력이 가능.
 * printf : 괄호 안의 내용을 지정된 형식(format)으로 출력
 * %d : 정수
 * %f : 실수
 * %s : 문자열
 * */
		
		int age = 34;
		System.out.println("너는"+age+"살이니?");
		
		
	}

}
