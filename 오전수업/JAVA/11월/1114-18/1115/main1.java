package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test1.member;
// import package name.class name 이렇게 써야함
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<member> list = new ArrayList<>();
		
		list.add(new member());
		list.get(0).성별 = "남자";
		list.get(0).아이디 = "end";
		
		// int[] a = new int[10];
		/*member[] arr = new member[5];
		// 클래스 타입의 배열을 생성하면 배열의 각 공간은 클래스 타입의 참조변수 공간이다.
		// 아이디에 빨간 줄이 오는 이유? 참조변수만 있는거지 아이디라는 클래스가 없어서 나옴. / 패키지가 달라서 제어가 달라서.
		
		
		
		//arr[0] = new member(); // 인스턴스 생성(객체 생성)
		//arr[0].아이디 = "li";
		//arr[0].성별 = "여자";
		//arr[0].주소 = "대전 서구 둔산동";
		//arr[0].이름 = "윤재영";
		
		// 1번쨰 방법
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = new member();
			System.out.println("아이디 : ");
			arr[i].아이디 = sc.nextLine();
			System.out.println("이름 :");
			arr[i].이름 = sc.nextLine();
			System.out.println("주소 :");
			arr[i].주소 = sc.nextLine();
			System.out.println("성별");
			arr[i].성별 = sc.nextLine();
		}
		
		//2번쨰 방법
//		for(member temp : arr) { }
		
		for(member temp : arr) {
			temp.output();
		}
		
		
		
		
		//final int a = 10;
		// a = 20;//변경 할 수 없으니 빨간줄이 생김
		*/
	}

}
