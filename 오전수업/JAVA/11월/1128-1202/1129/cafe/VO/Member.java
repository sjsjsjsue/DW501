package cafe.VO;

public class Member {
	private String id;
	private String name;
	private String tel;
	private String email;
	private int money;
	private String allergy;
	// member 클래스
	// 알레르기 저장할 수 있는 변수 생성 (get,set 메소드 만들기)
	
	public Member() {}
	public Member(String id, String name, String tel, String email, int money, String allergy) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.tel = tel;
		this.money = money;
		this.allergy = allergy;
		// allergy 추가
	}
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
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
