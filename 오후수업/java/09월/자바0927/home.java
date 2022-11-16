package 자바공부27;

class A{// A start
	
	int value; // value is born.필드변수
	/*
	 * 필드변수 특징 : 
	 * 1. 전역(전체)으로 활용가능.
	 * 2. 초기값을 지정하지 않아도 된다. 기본 값(default 값)이 존재
	 * ex) 값을 설정할 때 원래 값을 넣어줘야 함 ex) int x = 10; 
	 * ex) int x; (필드변수)
	 * 3.
	 * */
	
	public void 확인하기() {
		int x = 50; // x 탄생.
		int y; // y에 값이 없어서 y를 출력 or 사용 시 오류 발생.
//		if(3 == 3) {
//			int y = 10; //y is born
//		} // y is died.
		System.out.println("A클래스에 있는 메소드입니다.");
		System.out.println(value);
	} // x bye.
	
	public void 확인하기1() {
		value = 100;
	}
	
}//A end. value is died.


/* 문제.
 * B라는 클래스 생성
 * 리턴값이 void고, 파라미터값이 없는 확인하기 메소드 생성
 * 메인메소드에서 B클래스에 있는 확인하기 메소드 호출하기
 * 결과 : B클래스에 있는 메소드입니다.
 * 
 * */

class B{
	
	public static void 확인하기() {
		System.out.println("B클래스에 있는 메소드입니다.");
	}
}
/*
 * 문제.
 * 클래스 이름 : c
 * 필드변수 String str, int value.
 * 1. 메소드
 * 리턴타입 boolean
 * 메소드 이름 : 메소드만들기
 * 파라미터타입: 없음
 * 2. 메소드
 * 리턴타입 int 
 * 메소드이름: 메소드만들기
 * 파라미터타입 double x , double y
 * */

class C{ // return 타입이 있으면 꼭 써줘야함!!!!!!
	String str;
	int value;
	
// 	public static(접근지정자) 은 사실 optional(선택) 이다.
	public static boolean 메소드만들기() {//true or false 를 리턴
		return true;
	}
	public static int 메소드만들기(double x, double y) {
		return 0;
	}
	
	B 메소드만들기(B b) { // class B를 리턴하겠다.
		return b;
	}
}


public class home {
/*
 * static 메소드는 static 메소드 혹은 인스턴스화 된 메소드만 올 수 있다.
 * */
	public static void main(String[] args) {
		A a클래스 = new A(); //new A() => A 클래스를 호출하다. 
		a클래스.확인하기(); // a클래스에 있는 확인하기 메소드(함수) 사용.
		B b클래스 = new B();
		b클래스.확인하기();
		
		C c클래스 = new C();
		System.out.println(c클래스.메소드만들기());
		System.out.println(c클래스.메소드만들기(1, 1));
	}

}
