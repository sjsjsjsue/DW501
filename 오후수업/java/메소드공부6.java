package 자바0913;

public class 메소드공부6 {
	
	/*
	 * 메소드 == 기능
	 * 
	 * public static: 접근 제어자
	 * int : 리턴타입(리턴타입 종류 : 데이터 타입  8개와 클래스 타입 1개 + void)
	 * void 는 리턴이 없는 메소드를 의미함.***
	 * getSum: 메소드 이름
	 * int x, int y: 파라미터 값
	 * */

	
	public static int getSum(int x, int y) {
		return x+y;
	}
	
	public static void print(String word) {
		System.out.println(word);
	}
	
	
	public static void main(String[] args) {
		int result = getSum(30,70);
//		result 의 예상되는 값은? 100;
		print("도시락"); // void 는 return 을 사용하지않기 때문에 대입을 사용할 수 없다.
		
		/*
		 * 리턴타입이 void인 메소드는 변수에 결과를 대입할 수 없다.
		 * why? return이 없기 때문에!!
		 * 실무에서 void를 쓰긴하나 자주 쓰지는 않음!
		 * */
		
		

	}

}
