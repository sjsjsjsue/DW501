package house;

public class tv extends house_item {
	
	public int inch;
//	public int ch =2; // 명시적 초기화
//	public int sound;
	
//	static { // 클래스 초기화 블럭
//		
//	}
//	
//	{ // 인스턴스 초기화 블럭
//		ch = 10;
//		sound = 8;
//	}
	
	
	public tv() {
		super();
	} // 이게 기본적으로 있음. 그래서 power 함수가 실행이 될 수 있음.
	// == public tv (){} <= 이거는 안에  super ()가 숨겨져있음.
	public tv(String brand, int price,int inch) {
		super(brand,price);
		this.inch = inch;
	}
	public void buy() {
		System.out.println("TV 구매하였습니다.");
		
	}
	// 주석을 걸면 오류 나는 이유는 ? 
	// 추상메소드도 물려받음. tv도 추상메소드를 가지고 있음. 
	// 추상메소드는 객체 생성이 불가능하니, 자식에는 무조건 메소드에 값을 줘야한다.
}
