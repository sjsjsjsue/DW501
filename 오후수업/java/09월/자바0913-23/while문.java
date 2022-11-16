package 자바0913;

public class while문 {

	public static void main(String[] args) {
//		while 문 : for 문 처럼 반복문 중 하나.
//		for 문에 비하면 사용빈도는 낮으나, 아주 가ㅏㅏㅏㅏㅏ끔 사용.
//		while 문은 for 문 처럼 조건없이 계속 실행됨. for 문은 조건이 맞을 때까지 실행. 
		int count = 0;
		while(true) {
			++count;
			System.out.println("안눙");
			if( count == 20) {
				break; // while 문 멈추기.
			}
		}
		
//		while 문을 이용해서 1~10 까지 합을 구하시오. 답 55
		int num = 0;
		int	sum = 0;
			while(true) {
				++num;
				sum = sum+num;
				System.out.println("1~10까지 합은? "+sum);
				if(num==10) {
					
				break;
				}
			}
		
		

	}

}
