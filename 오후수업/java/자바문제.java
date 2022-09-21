package 자바0913;

public class 자바문제 {

	public static void main(String[] args) {


		String name[] = {"Brian" , "Kim"};
		/*
		 * 문제. 배열 name 에 있는 원소(element) 중 "kim"의 위치를 찾아
		 * 		kim은 x 에 있습니다. 출력이 나오게 로직 구현하기.
		 * 
		 * 정답) Kim은 배열 1번째에 있으므로 "kim은 1번에 있습니다." 정답입니다.
		 * HINT  오늘 배운 equals 와  for 문을 이용해서 푸시오.
		 * */
		
//		방법1
		for(int i=0; i<name.length; i++){
			boolean isCheck = name[i].equals("Kim");
		//			System.out.println(isCheck); 
//			if 를 못풀었듬...
			if(isCheck ==true){
				System.out.println("Kim은"+i+"번에 있습니다");
			}
		}
		
		
//		방법2
		for(int i=0; i<name.length;i++) {	
			if(name[i].equals("Kim") ) {
				System.out.println("Kim은"+i+"번에 있습니다");
				break;
			}
		}
		
		/*
		 * 문제. 홍길동의 번호는 010-3333-9999입니다. 
		 * 		길동이는 개인번호 유출을 생각해 핸드폰 번호를 010-****-***으로 보이게 하고 싶습니다.
		 * 		010-3333-9999 -> 010-****-****로 변경하고 싶어요.
		 * 		HINT. 오늘 배운 spilt 와 for 문을 이용해서 풀 것.
		 * */
		String num = "010-3333-9999";
		
		
		String 배열[] = num.split("-");
		System.out.println(배열[0]);
		System.out.println(배열[1]);
		System.out.println(배열[2]);
		 
//		int num1=0;
//		int num2 = 0;
//		for( int i=0;i<3;i++) {
//			if(배열[i] = "3333") {
//				
//			}
//		}
		
//		방법1.
		String array[] = num.split("-");
		for(int i=1; i<=2; i++) {
			array[i] = "****";
			System.out.println("확인 -> "+array[i]);
		}
		String 결과 = array[0]+"-"+array[1]+"-"+array[2];
		System.out.println(결과);
		

		
		
		
		
		
		
			}
		}
		
		
		

		

		
	


