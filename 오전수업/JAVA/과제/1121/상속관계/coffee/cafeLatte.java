package 상속관계.coffee;

public class cafeLatte extends coffee{
	
	boolean milk;
	
	public cafeLatte() {}
	public cafeLatte(String name, int price, boolean milk) {
		super(name, price);
		this.milk = milk;
	}
}
