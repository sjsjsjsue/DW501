package 자바0929;

class 관장{
	public void 운동을하다() {
		System.out.println("운동하기 전에 운동장 뛰는게 맞는거야!");
	}
	public void 주먹을날리다() {
		System.out.println("라이트 훅");
		System.out.println("래프트 훅");
		System.out.println("어퍼 컷!");
	}
}
/*extends : 상속
 * override : 오버라이딩 : (자식클래스에서 재정의)
 * 
 * 오버로딩 vs 오버라이딩
 * 오버로딩 : 메소드 이름은 같으나, 파라미터 타입이 다르다.
 * 오버라이딩 : 부모의 기능을 자식이 재정의함.
 * */
class 제자 extends 관장{
//	override 하려면 Ctrl + space bar
	@Override
	public void 운동을하다() {
		System.out.println("관장님, 간단하게 스트레칭하고 운동에 집중하죠!");
	}
	@Override
		public void 주먹을날리다() {
			System.out.println("상대와 간격을 조절한다.");
			System.out.println("래프트 잽을 날린다.");
			System.out.println("라이트 훅을 날린다.");
		}
	
}



public class 상속공부하기2 extends Object{

/*	자바에서는 모든 class는 default값으로 상속을 받을 수 있다.
 	A extends Object 가 되어있음.
 * 
 * 자바(객체지향언어)의 모든 클래스는 기본적으로 Object 클래스를 상속받는다.
 * 부모 없는 자식이 없음.
 * 모든 클래스는 Object의 기능을 상속받는다.
 * 
 * ctrl 키 누르고 Object를 누르면 모든 상속 받은 애를 볼 수 있음
 * */
	public static void main(String[] args) {
		
		관장 종찬관장님 = new 관장();
		종찬관장님.운동을하다();
		종찬관장님.주먹을날리다();
		System.out.println("==================");
		제자 종빈 = new 제자();
		종빈.운동을하다();
		종빈.주먹을날리다();

	}

}
