package house;

public abstract class house_item {
//	public boolean onoff;
	public String brand;
	public int price;
	
//	public void power() {
//		onoff = !onoff;
//		// power 함수가 실행되었을 때 true 가 실행
//		if(onoff){ //  true 일 떄!
//			System.out.println("전원 on");
//		} else {// false 일 때
//			System.out.println("전원 off");
//		}
//	}
	
	public house_item() {
//		// 생성자 메소드 : 메소드의 실행은 반드시 메소드 명으로 실행이 되어야한다.
//		onoff = false;
//		// 모든 자식들에게도 적용
	}
	
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price;
		// this는 현재 생성되는 객체를 의미.
		// 기본 생성자가 아니여서 자식에게 부모 생성자를 만들어야 함.
	}
	
	@Override
	public String toString() {
		return "브랜드 : "+brand + "  금액 : " + price+" 원";		
	}
	
	public abstract void buy(); // 추상메소드
	// 자식쪽에 있음에도 불구하고 buy()라는 메소드를 남겨둬야 함.
	// 자식 클래스에 가지고 있는 것은 부모도 가지고 있어야한다.
	// 이렇게 하는 이유는 다형성을 가지고 있으려고?
	// 일반적인 메소드가 아니기 때문에 빨간줄이 뜸!
}
