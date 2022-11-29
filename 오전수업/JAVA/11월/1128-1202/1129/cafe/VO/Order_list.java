package cafe.VO;


public class Order_list {
	private int seq;
	private String food_name;
	private String an_order;
	private int price;
	private int deliver_complete;
	private String memo;
	
	public Order_list() {}
	public Order_list(int seq, String food_name,String an_order,int price,int deliver_complete,String memo) {
		this.seq= seq;
		this.food_name = food_name;
		this.an_order = an_order;
		this.price = price;
		this.deliver_complete = deliver_complete;
		this.memo = memo;
	}
	public Order_list( String food_name,String an_order,int price,String memo) {
		
		this.food_name = food_name;
		this.an_order = an_order;
		this.price = price;
		this.memo = memo;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getAn_order() {
		return an_order;
	}
	public void setAn_order(String an_order) {
		this.an_order = an_order;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDeliver_complete() {
		return deliver_complete;
	}
	public void setDeliver_complete(int deliver_complete) {
		this.deliver_complete = deliver_complete;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
