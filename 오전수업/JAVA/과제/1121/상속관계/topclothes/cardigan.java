package 상속관계.topclothes;

public class cardigan extends topclothes {
	
	String length;
	
	public cardigan() {}
	public cardigan(int price, String brand , int size, boolean gender, String length) {
		super(price, brand, size, gender);
		this.length = length;
	}

}
