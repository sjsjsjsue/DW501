package 자바0913;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
//		 ctrl + shift + o : 자동 임포트 (3번을 확인 고고)
		
//		int x = 10;
//		if ( x == 10 ) {
////			if(조건)
////			= (대입연산자) , == (같다) , != (다르다)
//			System.out.println("A");
//		}
//		if( x != 10) {
//			System.out.println("B");
//		}
//// 답 A
//		if (x > 5) {
//			System.out.println("실행");
//		}
//		
//		if ( 3==4 ) {
//			System.out.println("IF 실행");
//		}else {
//			System.out.println("ELSE 실행");
//		}
////		ELSE 실행
		
		int x = 10;
		if ( x == 10) {
			int y =0; // y 출생 hi
		} // y 사망
		System.out.println(x); //y 부를 수가 없음 y 먼저 사망했음.. say goodbye...
		
		int a = 3; // a 출생 hi -> 전역변수
		if(x > 3) {
			a = 10;
			int y = 20; // y 출생 hi -> 지역변수( if 안에서 선언했기 때문에)
		} // y 사망...say goodbye
		
		
		int x1 =20;
		if(20 == 20 ) {
			++x1;
		}else {
			x1=x1+x1;
		}
//		x1의 최종값은? 답: 21
		System.out.println(x);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.print("값은?"+num);
		
		
//		문제. 받아온 값이 짝수면 짝수입니다. 홀수면 홀수 입니다.출력하시오.
		
//		int z = 3;
//			if( z %2 ==0) {
//				System.out.println("짝수입니다.");
//			}else {
//				System.out.println("홀수입니다.");
//			} 
		
		if((num %2) == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
	}// 33. a 사망...say goodbye. why? a는 if 밖에서 선언해줬기 때문임.

}
