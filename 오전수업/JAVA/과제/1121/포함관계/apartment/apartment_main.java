package 포함관계.apartment;

public class apartment_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parking park = new parking();
		park.apart.count = 20;
		park.brand = "벤틀리";
		park.color = "black";
		
		playground playgr = new playground ();
		playgr.apart.count = 10;
		playgr.rides = "미끄럼틀";

	}

}
