package generic;

public class 구매 {
	
	public void buy(Seafood_box<? super Seafood> item) {
		System.out.println("해산물 구매했습니다.");
	}
	
//	public void buy(Seafood_box<오징어> item) {
//		System.out.println("해산물 구매했습니다.");
//	}
//	public void buy(Seafood_box<새우> item) {
//		System.out.println("해산물 구매했습니다.");
//	} // 오버로딩이 성립이 안되는 이유는 ? 클래스 타입이 같기 때문에
	// == 해산물박스 = new Seafood_box<새우>(); (in Main_method)	
}
