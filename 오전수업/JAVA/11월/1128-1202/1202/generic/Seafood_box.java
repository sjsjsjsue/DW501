package generic;


//public class Seafood_box <T extends Seafood & 인터페이스>
// 제네릭에 사용되는 타입 종류 : 참고 1202.md
public class Seafood_box <T extends Seafood>{

	T box_item;
	
	public void setBox(T box) {
		this.box_item = box;
	}
	public void sellBox() {
		System.out.println("박스를 판매했습니다.");
	}
}
