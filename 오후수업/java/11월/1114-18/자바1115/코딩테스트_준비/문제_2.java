package 코딩테스트_준비;

public class 문제_2 {
	public static void main(String[] args) {
	
		/*
		 * 
	2. 윤도네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.  
   양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
   정수 n과 k가 변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
   총얼마를 지불해야 하는지 출력되는 로직을 구현하시오.

	 10 +1(음꽁)
	 60 +6(음꽁)
	 4 
	 
    int n = 64; //양꼬치
    int k = 6; //음료수
    int result = 0; //지불 금액
		 * 
		 * */
		 int n = 64; 
		 int k = 6;
		 int result = 0;
		 
		int service = 0;
		
		service = n/10;
		System.out.println(service);
		
		result = (n*12000)+(k*2000)-(service*2000);
		System.out.println("총 가격은 "+result + "원 입니다.");
		
	}
}
