package 자바공부27;

public class 영화관 {
//필드변수는 public과 private 를 지정할 수 있다.
//	필드변수는 전역에서 사용할 수 있다.
	private int 직원수;
	private String 영화관위치;
	private String 영화관이름;
	private String[] 개봉영화종류;
	
//	private으로 변수 생성하면, 다른 클래스에서 영화관 클래스에 잇는 필드변수를 사용할 수 없다.
//	은닉성을 가지고 있음.
	
	public void set직원수(int 직원수) {//x를 직원수(필드변수)에 대입.
//		파라미터로 받아온 값을 필드변수에 대입.
//		이런 메소들를 setter method로 한다.
		this.직원수 = 직원수;
//		this. ___ : 자기 자신(class)를 의미
//		this.직원수 뜻: 파라미터 변수 이름과 동일하기에 this 를 사용하여 필드변수를 사용하자.
	}
	public int get직원수() {
//		필드변수를 리턴하는 메소드
//		이런 메소드를 getter 메소드라고 함.
		return 직원수; 
	}
	
	public void set영화관위치(String 영화관위치) {
		this.영화관위치 = 영화관위치;
	}
	public String get영화관위치() {
		return 영화관위치;
	}
	public String get영화관이름() {
		return 영화관이름;
	}
	public void set영화관이름(String 영화관이름) {
		this.영화관이름 = 영화관이름;
	}
	public String[] get개봉영화종류() {
		return 개봉영화종류;
	}
	public void set개봉영화종류(String[] 개봉영화종류) {
		this.개봉영화종류 = 개봉영화종류;
	}
	
	
	
}

