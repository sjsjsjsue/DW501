package test1;

import java.util.Arrays;
import java.util.Scanner;


public class study1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Scanner를 사용하려면 import 를 해야한다! Scanner가 빨간색이 뜨면 그 위에 마우스를 올리면 import를 할 수 있다.
		
		/* 클래스 - 사용자 정의 데이터 타입
		 * 자바 기본 데이터 타입
		 * 정수 타입 - byte, short, int, long;
		 * 실수 타입 - float , double;
		 * 문자 타입 - char;
		 * 논리 타입 - boolean;
		 * 
		 * */
		
		/*
		 * int num;
		
		num = sc.nextInt();
		// nextFloat(); float 입력
		byte b = sc.nextByte();
		short s = sc.nextShort();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		boolean bool = sc.nextBoolean();
		char ch = sc.next().charAt(0);
		// sc.next() or sc.nextLine(); 문자열 입력 
		// charAt(인덱스 번호);
		*/
		
		// 문제. 국어, 수학, 영어 점수 입력 받아서 총점과 평균을 출력하시오.
		/*int kor;
		int mat;
		int eng;
		// int kor, mat, eng;
		
		// 점수 입력받기
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		
//		총점과 평균 찾기
		int sum = kor + mat + eng;
		int avg = sum/3; 
		
//		출력하기
		System.out.println("총점은 "+ sum + "점 이고, 평균은"+avg+"점 입니다.");
		*/
		
		/*
		 * 배열
		 * 
		 * 자바스크립트
		 * 1. const array = [] 
		 * or
		 * 2. const array2 = new Array();
		 * 
		 * 자바
		 * 1. 타입 지정을 먼저 해야함
		 * (일반적으로 정수는 int 를 많이 사용)
		 * 2. 타입 뒤에다 []를 붙인다. ex) int []
		 * 3. 타입 [] 배열이름 = new 타입 [배열의 크기(인덱스 번호)];
		 *  - 숫자만큼 배열이 만들어짐.
		 *  - 자바스크립트처럼 push 하면 안되고, 배열이름 뒤에 인덱스를 붙어 배열을 넣어준다. ex) s[0] = 10;
		 *  🌟🌟 배열의 인덱스는 0부터 시작한다. 🌟🌟
		 *    */
		
		// 숫자
		int [] score = new int [5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		// score[5] = 60; // <- 오류
		// ArrayIndexOutOfBoundsExcept... : 잘못된 인덱스를 사용.
		
		System.out.println("score 의 0번 인덱스의 번호는 "+score[0]+ "입니다."); // score 의 0번 인덱스의 값만 나온다.
		for (int i=0; i<score.length; i++) {
			System.out.println("score 의 배열의 값은 "+score[i]+"입니다.");
		}
		
		// 문자열
		String [] name = new String[3];
		
		// 입력한 문자열 하나씩 대입
		for(int i=0; i< name.length;i++) {
			System.out.println("이름 입력 :");
			name[i] = sc.next(); // or sc.nextLine();			
		}
		
		// 입력한 문자열 한번에 출력
		for (int i=0; i<name.length; i++) {
			System.out.println("이름은 "+name[i]+" 입니다.");
		}
		
		
		Arrays.sort(score);
		
		int [] temp = new int[10];
		// arraycopy( 복사 할 배열, 복사 배열 시작 인덱스, 저장되는 배열, 저장 배열 시작 인덱스, 갯수 )
		System.arraycopy(score, 0, temp, 0, score.length);
		System.out.println(Arrays.toString(temp));
	}
}
