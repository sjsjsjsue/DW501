package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.control.Exit;
import cafe.control.event;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		order o = new order();
//		login l = new login();
//		event e = new event();
//		// 패키지가 다르다면 import 해줘야한다.
		
		menu_able[] menu = {new order(), new login(), new event(), new signin(), new Exit()};
		// interface 상속된 애들 가져오기
		
		while(menu[main_menu()-1].menu_active()) {
			
//			menu[main_menu()-1].menu_active();
//			switch(main_menu()) {
//			case 1: // 주문		break;
//			case 2: // 로그인 	break;
//			case 3 : // 이벤트 확인	break;
//			case 4: // 회원가입		break;
//			case 5: // 종료	return;
// 다형성을 안햇다면 switch 문이 필요하지만, 다형성을 해서 switch 문이 필요 없고, 코드가 간결해짐
//			다형성을 하면 코드가 복잡해지지않고, 간결해짐
			}
		}
		
		
	
	
	public static int main_menu() { // class method - 클래스 메소드 안에서만 사용가능.
		
		int select =0;
			try {
				System.out.println("1. 주문");
				System.out.println("2. 로그인");
				System.out.println("3. 이벤트");
				System.out.println("4. 회원가입");
				System.out.println("5. 종료");
				System.out.println("선택 : ");
				select =  sc.nextInt();
				
			if(select < 1 || select > 5)  
				throw new InputMismatchException("잘못입력했습니다.");
			
			}catch(Exception e) {
				System.out.println( e.getMessage() );
				sc.nextLine();// 문자를 입력했을 때 오류 잡아줌
				// 없을 때 문자열을 썼을 때 오류가 나는 이유는 버퍼메모리에 있는 enter 때문임. 
				// So nextLine 을 사용하면 enter가 버퍼메모리에 사라짐
				select = main_menu();
				
			}
			return select;
	}
	

}
