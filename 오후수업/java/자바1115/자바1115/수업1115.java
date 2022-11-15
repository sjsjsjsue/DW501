package 자바1115;

import java.util.ArrayList;
import java.util.List;

class student{
	//필드변수 or 전역변수
	String name;
	int height;
	
	// 문제1. 필드변수에 값을 조기화 할 수 있는 생성자 만들기
	public student() {}
	public student(String name, int height) {
		this.name = name;
		this.height = height;
	}
	// student(String name, int height){
	//	this.name;
//		this.height = height;
	//}
}


public class 수업1115 {
	public static void main(String[] args) {
	
		
		// 문제2. 학생 클래스 3개 만들어서 아래 값 출력하기
		// 이름 : 홍길동, 키 : 179
		// 이름 : 김길동, 키 :185
		// 이름 : 이길동, 키 : 172
		// student s = new student("홍길동", 179);
		student s1 = new student("홍길동",179);
		
		student s2 = new student("김길동",185);
		
		
		student s3 = new student("이길동",172);
	
		
		// 문제3. 학생클래스 ArrayList 에 add 하기
		
		List<student> 학생클래스 = new ArrayList<student>();
		학생클래스.add(s1);
		학생클래스.add(s2);
		학생클래스.add(s3);
		// List<데이터 타입 or class이름> 변수이름 = new ArrayList<데이터 타입 or class이름>();
		// List 와 ArrayList를 쓰려면 import 를 해야함
		
		for(int i=0; i<학생클래스.size();i++) {
			System.out.println("이름 : "+학생클래스.get(i).name+", 키 : "+학생클래스.get(i).height);
		}
		
		for(student i : 학생클래스) {
			System.out.println(i.name+","+i.height);
		}
	
		
		
		
		
		
		
	}
}
