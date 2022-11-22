package test1;

public class JAVA_AM_1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이름, 연락처, 주소, 생년월일, 성별, 아이디
		// 회원정보 저장하기
		
		
		member m1 = new member(); // new 연산자를 통해 member 클래스의 공간을 메모리에 생성.
		// m1 : 참조 변수라고 한다. 
		
		System.out.println(m1);
		m1.성별 = "여자";
		m1.아이디 = "limit";
		m1.이름 = "이순자";
		m1.주소 = "대전 중구 선화동";
		// 패키지가 같으면 클래스에 빨간줄이 안생김
		
		output(m1); // static void 함수 사용
		// m1.output(); member 안에 있는 output 사용
		
		member m2 = new member();
		m2.성별 = "남자";
		m2.아이디 = "eternal";
		m2.이름 = "장보고";
		m2.주소 = "대전 동구 가양동";
		
		//output(m2);  static void 함수 사용
		 m2.output(); // member.java 안에 있는 output 사용
		
		
	}
	
	// 출력을 하기 위한 함수
	static void output(member m) {
		// 다른 사람것을 출력해야하기 때문에 참조변수를 이용해서 써야함
		System.out.println("아이디 : " + m.아이디+ ". 성별 : "+m.성별+". 이름 : "+ m.이름+". 주소 : "+m.주소);
	}

}

/*
// struct : 구조체
// member 라는 타입을 만듦
struct member{
	String 이름;
	String 연락처;
	String 주소;
	String 성별;
	String 아이디;
	int age;
	void getAge() {
		age = 생년월일 계산해서 나이 구하기;
	}
	
}



//1번 방식
member m1;
getAge(m1.생년월일);

void getAge(int birth) {
	생년월일 계산해서 나이 구하기;
	return 계산결과;
}

//2번 방식
m1.getAge();



// 하나로 관리. 데이터를 관리하는게 더 효율성이 있음
// 추가 데이터가 있다면 구조체에 추가하면 됨
// 초기 작업할 때는 시간이 걸림... 차후에 수정작업도 쉬움^^
// 구조체보다 업그레이드 한 것이 클래스!!
// 구조체는 저장공간만 가지고 있음
// 클래스는 저장공간 + 함수 가지고 있음
member[] m1 = new member[5];

// 여러개로 관리
String[] name = new String[5];
String[] tel = new String[5];
String[] addr = new String[5];
String[] gen = new String[5];
Sting[] id =new String[5];
int[] birth = new int[5];




// . : 접근 연산자
// 단일 데이터를 저장 : 변수
// 여러 데이터를 저장하기 위해 사용하는 것은 배열
member m1;
m1.이름 = "김유신";
m1.연락처 = "010-1234-1234";
m1.주소 = "대전 선화동";
m1.성별 = "남성";
m1.아이디 = "kimyusin12";
m1.생년월일 = 980324;

*/