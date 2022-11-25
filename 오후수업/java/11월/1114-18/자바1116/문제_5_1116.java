package 코딩테스트_준비;

public class 문제_5_1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 어떤 세균은 1시간에 2배씩 증식한다고 한다.
 * 처음 세균의 마리수 경과한 t가 매개변수로 주어질 때,
 * t 시간 후 세균의 수를 구하는 로직을 구현하시오.
 *  
 *  int n = 2; // 처음 세균 마리 수
 *  int t = 10  // 경과시간
 *  
 *  1시간 : 2
 *  2시간 : 4(2*2)
 *  3시간 : 2 *2 * 2
 *  제곱!!
 * 10 =-> 2의 10승
 * */
	int n = 2;
	int t = 10;
	
	for(int i=1; i<=t;i++) {
		n = n*2;
	}
	System.out.println("세균의 수는 "+n+"입니다.");
	
	
	
}
}
