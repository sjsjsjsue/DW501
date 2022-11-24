package cafe.control;

public class Exit implements menu_able {

	@Override
	public boolean menu_active() {
		// TODO Auto-generated method stub
		
		System.out.println("종료!");
		
		return false;
	}

}
