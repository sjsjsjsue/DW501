package 상속관계.topclothes;

public class hoodie extends topclothes{
	
	String color;

	public hoodie() {}
	public hoodie(int price, String brand , int size, boolean gender, String color) {
		super(price, brand, size, gender);
		this.color = color;
	}
}
