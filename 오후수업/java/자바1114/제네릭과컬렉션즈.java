package 자바1114;

import java.util.ArrayList;
import java.util.List;

public class 제네릭과컬렉션즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컬렉션즈 : 자료 구조(스텍, 힙, 맵, 셋...)
		
		// 배열
		int[] array = {5,7,6,10}; //배열 사용하는 방법 1
		int [] array1 = new int[4]; // 배열을 사용하는 방법 2
		//1 과 2의 차이점은 2는 길이 제한만 준 것. 1은 값을 정해줌.
		
		// 배열 호출 하는 방법
		System.out.println("배열 호출 하는 방법 : " + array[0]);
		System.out.println("배열 호출 하는 방법 : " + array[1]);
		
		// List 
		// List : 컬렉션즈
		// <> : 제네릭
		
		List<Integer> list = new ArrayList<Integer>();
		// List 안에는 only 클래스만 올 수 있다.
		
		// Integer : 정수형을 담는 list
		list.add(10);
		list.add(20);
		
		// list 호출하는 방법
		System.out.println("0번째 값 : "+list.get(0));
		System.out.println("1번째 값 : "+list.get(1));
		
		// list 길이 호출 하는 방법
		System.out.println("list 길이 호출 하는 방법 : "+list.size());
		
		// list 1번째 요소 삭제
		list.remove(1);
		System.out.println("list 길이 삭제 :  "+list.size());
		
		
		//문제 : 5의 배수를 출력하시오
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(7);
		numberList.add(13);
		numberList.add(15);
		
		// numberList %5 == 0
		// get, remove, size 🌟🌟		
		// 1번째 방법
		for(int i=0; i<numberList.size(); i++) {
			if(numberList.get(i) %5 == 0) {
				System.out.println("5의 배수는 : " + numberList.get(i));
			}
		}
		
		//2번째 방법(향상된 for 문(혹은 for each 문이라고 함)을 이용한 로직 구현)
		// for 문에서 길이만큼 알아서 i 에 리스트 인덱스를 대입함
		for(int i : numberList) { 
			if(i%5 ==0) {
				System.out.println("for each : "+i);
			}
		}
		
		
	
		// 문제 : numberList 안에 있는 요소 총 합 구하고, 100 이상인 요소가 몇 개 인지도 출력
		// 조건 : for each 문으로 풀기
		numberList = new ArrayList<Integer>();
		numberList.add(50);
		numberList.add(100);
		numberList.add(300);
		numberList.add(99);
		
		int sum = 0;
		int count = 0;
		// 총 합 구하는 for 문
		
		for(int i : numberList) {
			if(i>=100) {
				count++; 
//				++count;
			}
		}
		System.out.println("100 이상의 요소는 "+count+"개 입니다.");
		
		// 100 이상인 요소 구하는 for 문
		for(int i :numberList) {
			sum = sum+ i;
//			sum +=i;
		}
		System.out.println("총합은 : "+sum);

		// 문자를 담은 List
		List<String>wordList = new ArrayList<String>();
		wordList.add("아이스아메리카노");
		wordList.add("카페라떼");
		wordList.add("카페모카");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		
		int count1 = 0;
		for(String item : wordList) {
			System.out.println("메뉴는 "+item+"입니다.");
			if(item.equals( "아이스아메리카노")) {
				count1++;
			}
		}
		System.out.println("아이스아메리카노는 "+count1+"개 있습니다.");
		// 문자열에서 == 를 쓰면 안됨. 문자를 비교하려면 equals 를 사용해야 함.
		
		버거킹 골드와퍼 = new 버거킹(); // 버거킹 메소드 호출
		골드와퍼.버거종류 = "치즈버거";
		골드와퍼.버거가격 = 9000;
		
		버거킹 기네스와퍼 = new 버거킹();
		기네스와퍼.버거종류 = "프리미엄";
		기네스와퍼.버거가격 = 8000;
		
		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>();
		버거킹선화점.add(골드와퍼);
		버거킹선화점.add(기네스와퍼);
		
		// 문제 : 버거킹 선화점에 있는 모든 메뉴를 출력하시오.
		for( int i =0; i<버거킹선화점.size();i++) {
			System.out.println("선화점의 버거 종류는 : "+버거킹선화점.get(i).버거종류);
			// 버거킹선화점.get(i) : 버거킹의 골드와퍼, 기네스와퍼를 가리킴
		}
		
		for(버거킹 선화점:버거킹선화점) {
			System.out.println("선화점의 버거 종류는 : "+선화점.버거종류);
		}
		
		
		
	}

}
