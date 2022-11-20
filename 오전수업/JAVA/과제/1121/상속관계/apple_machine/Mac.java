package 상속관계.apple_machine;

public class Mac extends apple_machine {

	String type; // 노트북인지 데스크탑인
	
	public Mac() {}
	public Mac(String name, int price, String color, String type) {
		super(name, price, color);
		this.type = type;
	}

}
