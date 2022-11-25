package cafe.VO;

public class food {
	
	private int food_seq;
	private String food_name;
	private int cost;
	private int cook_time;
	private String cal; // 칼로리...ㅎㄷㄷ
	private String allergy; // 알러지
	private int order_quantity; // 주문량
	

	public food() {}
	public food(int food_seq, String food_name, int cost, int cook_time, String cal,String allergy , int order_quantity ) {
		this.food_seq = food_seq;
		this.food_name = food_name;
		this.cost = cost;
		this.cook_time = cook_time;
		this.cal = cal;
		this.order_quantity = order_quantity;
		this.allergy = allergy;
	}
	
	
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}
	
	public int getFood_seq() {
		return food_seq;
	}
	public void setFood_seq(int food_seq) {
		this.food_seq = food_seq;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCook_time() {
		return cook_time;
	}
	public void setCook_time(int cook_time) {
		this.cook_time = cook_time;
	}
	public String getCal() {
		return cal;
	}
	public void setCal(String cal) {
		this.cal = cal;
	}
	public int getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
}
