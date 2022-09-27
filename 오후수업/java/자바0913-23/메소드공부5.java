package 자바0913;

public class 메소드공부5 {

	/*
	 * public static: 접근 지정자
	 * int : 리턴 타입
	 * getSum : 메소트 타입
	 * int x, int y : 파라미터 값, 매개변수, 인수 값...
	 * */
	public static int getSum(int x, int y) {
		return x+y;
	}
	
	
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
//		return 이 있으면 대입할 수 있음.
	}
	
	public static String getWord(String word) {
		return word;
	}
	
	
	public static void main(String[] args) {
		int result = getSum(10,10);
//		문제1) 예상되는 result 값은? 20;
		System.out.println("문제 1의 결과는 : "+result);
//			
		boolean isResult = isLogin(true);
//		문제2. 예상되는 isResult 값은? ture.
		
		String word = getWord("치즈돈까스");
//		문제3. 예상되는 word 의 값은? 치즈돈까스

	}

}
