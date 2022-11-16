package 자바0913;

public class 메소드공부4 {
	
	/* 지금 너가 알아야하는 것은 메소드가 무엇인지 알기
	 * 메소드를 사용하는 이유
	 * 1. 업무 분담(팀 프로젝트 할 때 메소드를 사용함._
	 * 2. 유지보수 편리성
	 * 
	 * public static :  접근 제어자
	 * int : 리턴 타입**
	 * getsum : 메소드 (혹은 함수) 이름
	 * int x : 파라미터 타입(혹은 매개변수_
	 * */
	public static int getsum (int x) {
		return x;
	}
	public static String getWord(String x) {
		return x;
	}

//	boolean 은 파라미터 값 없음.
	public static boolean isTrue() {
		return true;
	}
	
	public static int getSum(int x , int y){
		return 10;
	}
	
	public static int getCount(int startNum, int endNum){
//		문제 1. startNum 이 endNum보다 크면 startNum을 리턴
//		endNum이 startNum보다 크면 endNum을 리턴하는 로직을 구현하시오.
		if(startNum > endNum) return startNum;
		if(startNum < endNum) return endNum;
		return 0;
	}
	
	public static int 일부터십까지합구하기() {
//		문제1. 1-10까지 합 구하기
//		return 1+2+3+4+5+6+7+8+9+10;
		 int sum = 0;
		for( int i=1; i<11; i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static int 짝수개수구하기() {
//		문제2. 1-20까지 짝수 개수 구하고 개수를 리턴하시오/
		
		int count = 0;
		for ( int i=1; i<21; i++) {
			if(i%2 == 0) {
				count++;
			}
		}
		return count;
	}
	
/*	문제3.
	1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수(n)가 1이 될 때까지 다음 작업 반복하면, 
	모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
	1-1. 입렵된 수가 짝수라면 2를 나눕니다. 2/2
	1-2 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 5*3+1
	2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
	ex) "주어진 수(n)가 6이라면
	6 -> 3 -> 10 -> 5 -> 16-> 8 -> 4 -> 2 -> 1 이 되어 총 8번 만에 1이 됩니다.""
	단, 주어진 수(n)가 1인 경우에는 0을. 
	작업을 500번 반복할 때까지 1이 되지 않는다면, -1을 리턴해주세요.
	HINT> while 문을 사용
*/
	
//	int = 4 byte / long = 8 byte (1 byte == 8bit)
//	1 bit 에 표현할 수 있는 수가 8자리
	public static int solution(int n) {
		int answer = 0;
		//n이 1일때 answer값
		if(n==1) {
			answer =0;
		}
//		while (true) ->조건이 없다. 계속 반복되므로 break;를 써준다.
		//n이 1보다 클때 answer값
		while(1<n) {
			if(n%2 == 0) {
				n = n/2; //1-1
				answer++;
			} 
			if(n%2 ==1) {
				n = n*3+1; // 1-2
				answer++;
			}
		}
		//n이 500 이상일 때 answer 값
		if(answer>=500) {
			answer = -1;
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		getCount(1,10); // 정의한 메소드를 호출.
		int res = 짝수개수구하기();
		System.out.println(res+"개");
		
		
		
	}

}
