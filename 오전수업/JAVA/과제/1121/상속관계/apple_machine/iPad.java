package 상속관계.apple_machine;

public class iPad extends apple_machine{

	boolean iPencil;
	
	public iPad() {}
	public iPad(String name, int price,String color, boolean iPencil) {
		super(name, price, color);
		this.iPencil = iPencil;
	}
}
