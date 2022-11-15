package 코딩테스트_준비;

public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
3. 정수는 할머니께 생신 축하 편지를 쓰려고 합니다. 
할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 
편지를 가로로만 적을 때, 
축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 구하는 로직을 구현하시오.


    String message = "happy birthday!"; //편지 내용
    int result = 0; //가로 길이

		 * */
		String message = "happy birthday!";
		int write = 2;
		int result = 0;
		
		// 15*2
		// 길이 : length
		
		int len = message.length();
		System.out.println(len);
		result = write * len;
		System.out.println("가로길이는 "+result+"cm 입니다.");
		
		
		
		
	
	}

}
