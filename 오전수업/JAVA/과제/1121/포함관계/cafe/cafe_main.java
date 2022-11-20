package 포함관계.cafe;

public class cafe_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coffee cof = new coffee();
		cof.cafe.mamu_name  = "아메리카노";
		cof.cafe.price = 4100;
		cof.size = "tall";
		
		desert des = new desert();
		des.cafe.mamu_name = "티라미수 크림 데니쉬";
		des.cafe.price = 6500;
		des.add ="버터 추가";
		
		tea tea = new tea();
		tea.cafe.mamu_name = "자몽허니블랙티";
		tea.cafe.price = 5700;
		tea.option = "얼음 적게";
		
	}

}
