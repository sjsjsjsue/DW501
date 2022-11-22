package test1;

public class member {
	
	static int count;
	
	// 인스턴스 변수
	public String 아이디;
	public String 이름;
	public String 주소;
	public String 성별;
	
	public member() {} // 생성자 메소드
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별 = 성별;
		this.아이디 = 아이디;
		this.이름 = 이름;
		this.주소 = 주소;
	}
	public void output() {
		System.out.println("아이디 : " +아이디+ ". 성별 : "+성별+". 이름 : "+이름+". 주소 : "+주소);
		// 참조변수,매개변수가 필요없다. 내가 가지고 잇는거 내가 출력하는거라 필요 없음
		
	}
}
