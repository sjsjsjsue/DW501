package cafe.VO;

public class Member {
	private String id;
	private String name;
	private String tel;
	private String email;
	private int money;
	
	public Member() {}
	public Member(String id, String name, String tel, String email, int money) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.tel = tel;
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
