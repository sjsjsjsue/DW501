package 자바0929;

// 상속
class 부모님{
	public void 공부하렴() {
		System.out.println("공부해라!");
	}
	public void 밥먹자() {
		System.out.println("밥먹으렴!");
	}
}

//자식 클래스에서 부모님 클래스 상속 받겠다.
// 프로그래밍에서 상속 : 부모의 기능을 자식이 물려받는다.
// @override : 오버라이딩: 부모의 기능을 자식이 재정의하다.
class 자식 extends 부모님{
	@Override
	public void 공부하렴() {
		System.out.println("공부하겠습니다.");
	}@Override
	public void 밥먹자() {
		System.out.println("밥 먹기 싫어요.");
	}
	
}




public class 상속공부하기 {

	public static void main(String[] args) {
		자식 x = new 자식();
		x.공부하렴();
		x.밥먹자();

	}

}
