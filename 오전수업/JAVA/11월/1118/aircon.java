package house;

public class aircon extends house_item {
	
	public int area;
	
	public aircon() {}
	public aircon(String brand, int price, int area) {
		super(brand,price);
		this.area = area;
	}
	public void buy() {
		System.out.println("에어컨 구매하였습니다.");
	}
}
