<<<<<<< HEAD
package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		
		
		/*
		 * for 문 실행순서
		 * 1. int i=0
		 * 2. i<0
		 * 3. 코드실행
		 * 4. i++
		 * */
	
//		for (int i=0; i<10; i++) { // i 탄생			
//		}// i 사망
//		System.out.println(i); <= i 는 이미 for 문 끝날 때 사망했기 때문에 이건 오류!!

		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력해주세요 =>");
		int num = scan.nextInt();
		System.out.println("값은 "+num);
		
		/*
		 * 문제 1. num 에 값을 입력받았을 때 num 을 x 로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 n 을 출력하시오.
		 * ex) num 이 10이라고 가정하면 가장 작은 자연수는 3 입니다.
		 * 제한 사항 : num 은 "3 <= num <=1000" 입니다.
		 * hint : while or for 문을 이용해서 풀어보세요.
		 * */
		
		for(int i=3; i<=1000;i++) {
			if(num%i ==1) {
				System.out.println("가장 작은 자연수는 "+i);
				break;
			}
		}
	
		
		/*
		 * 문제2. 3~6 숫자 총합을 구하시오. 답 18.
		 * */
		
		int sum = 0;
		for ( int i = 3; i<=6; i++) {
			sum = sum + i;
		}
	System.out.println(sum);
		
	}

}
=======
package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		
		
		/*
		 * for 문 실행순서
		 * 1. int i=0
		 * 2. i<0
		 * 3. 코드실행
		 * 4. i++
		 * */
	
//		for (int i=0; i<10; i++) { // i 탄생			
//		}// i 사망
//		System.out.println(i); <= i 는 이미 for 문 끝날 때 사망했기 때문에 이건 오류!!

		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력해주세요 =>");
		int num = scan.nextInt();
		System.out.println("값은 "+num);
		
		/*
		 * 문제 1. num 에 값을 입력받았을 때 num 을 x 로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 n 을 출력하시오.
		 * ex) num 이 10이라고 가정하면 가장 작은 자연수는 3 입니다.
		 * 제한 사항 : num 은 "3 <= num <=1000" 입니다.
		 * hint : while or for 문을 이용해서 풀어보세요.
		 * */
		
		for(int i=3; i<=1000;i++) {
			if(num%i ==1) {
				System.out.println("가장 작은 자연수는 "+i);
				break;
			}
		}
	
		
		/*
		 * 문제2. 3~6 숫자 총합을 구하시오. 답 18.
		 * */
		
		int sum = 0;
		for ( int i = 3; i<=6; i++) {
			sum = sum + i;
		}
	System.out.println(sum);
		
	}

}
>>>>>>> 91cd5fe1796227f390017f337c8c384a4a1df886
