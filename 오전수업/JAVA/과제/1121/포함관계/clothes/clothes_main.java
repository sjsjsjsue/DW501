package 포함관계.clothes;

public class clothes_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		top top = new top();
		top.clothes.name = "후드티";
		top.clothes.price = 36000;
		top.brand = "NIKE";
		top.clothes.size = 95;
		
		skirt skirt = new skirt();
		skirt.clothes.name = "롱스커";
		skirt.length = "LONG Skrit";
		skirt.clothes.price = 20000;
		skirt.clothes.size = 26;
		
		pants pants = new pants();
		pants.clothes.name = "기모바지";
		pants.clothes.price = 60000;
		pants.season = "Winter";
		pants.clothes.size = 26;
	}

}
