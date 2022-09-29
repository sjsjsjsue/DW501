package 자바0929;


class A{
//	기본적으로 제공 == Default
	A(){
		
	}
	public void A클래스에있는메소드() {
		System.out.println("Hello World");
	}
	public int 메소드생성(int x) {
		return x;
	}
	
}

class B{
	
//	B라는 클래스 생성 후에 메인 함수에 B클래스 출력
	B(int x, int y){
		System.out.println("B class : Hello World");
	}
	B(){ // 메소드 이름이 같으면 오류가 나는데 파라미터 타입이 다를 때 오류가 안남 : 오버로딩
		
	}
	
}

/*
 * 문제
 * 클래스 이름 : C
 * 필드변수 
 * 1-1 private String 이름
 * 1-2 private int 나이
 * 
 * 메소드 
 * 2. getter, setter 만들기
 * 
 * 생성자
 * 3-1. String 이름, int 나이 파라미터가 있는 생성자 생성
 * 3-2. 파라미터가 없는 생성자 생성
 * */

class C{
	private String 이름;
	private int 나이;
/*	getter and setter 있는 곳 : source -> Generate Getter and Setter
	getter and setter 쓰는 이유?
 * 	필드변수가 private여서 get and set 함수를 이용해서
 * 	필드변수 데이터를 대입하고 호출한다.
 */
	
	C(String 이름, int 나이) {
	
	}
	
	C() {
		
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
}

public class 클래스복습 {

	public static void main(String[] args) {
//		문제. 메인메소드에서 A클래스에 잇는 메소드 호출하기
		A a클래스 = new A();
		a클래스.A클래스에있는메소드(); // 변수를 활요한 방법
//		new A(); : A클래스 호출
//		A a클래스 불러온 클래스를 a라는 변수에 대입(인스턴스화하다. 객체를 생성하다.)
		new A().A클래스에있는메소드();//변수를 생성하고 클래스 호출 시 바로 메소드 호출.
		
		/*
		 * new A() <= 기본적으로 가지고 있는 메소드임 == 생성자.
		 * 생성자는 메소드와 다르게 리턴타입이 없다.
		 * */
		System.out.println(a클래스.메소드생성(1));
		
		B b = new B(3,4); // B라는 클래스를 출력할 때 생성자(Default)도 자동으로 호출된다.
//		new B() : 생성자를 불러와야 출력이 가능
		
	}

}
