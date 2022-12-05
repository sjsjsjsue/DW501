package Class501;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main_method {

	public static Map<String, Ban_active> map = new HashMap<>();
	
	
	
	public static void init() {
	//	ResourceBundle rb = ResourceBundle.getBundle("ban");
		// ResourceBundle 참고: 1205.md
		// 번들을 이용해 파일을 가져옴
	//	Enumeration key = rb.getKeys(); // prop 파일에서 key 만 가져오겠다
		// desk.html(key) = Class501.Desk(value) :  key and value - 문자열
		
		Properties prop = new Properties();
		try (FileReader fr = new FileReader("C:\\Users\\dw-021\\eclipse-workspace\\JAVASTUDY3\\src\\Class501\\ban.properties")){
			// ban.properties > properties > 경로 찾기
			prop.load(fr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Iterator key = prop.keySet().iterator();
		while(key.hasNext()) {
			String cmd = (String)key.next(); // prop 파일의 key 하나씩 cmd 에 저장
			String val = prop.getProperty(cmd); // 키를 입력하여 value 구하여 val 에 저장
			// 문자열을 클래스화 시키기
			System.out.println(val);
			try {
				Class<?> hclass = Class.forName(val);// Class.forName("Class501.computer");
				// ? : 와일드 카드! 모든지 허용가능
				Ban_active ban =(Ban_active)hclass.newInstance();// computer 객체 생성
				map.put(cmd,ban); // prop의 키를 map의 키로 저장, prop의 value로 저장
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		init();
		System.out.println("이동할 페이지 입력 : ");
		System.out.println("computer   chair   desk   people    moniter");
		String page = new Scanner(System.in).nextLine();
		page += ".html"; // map의 키로 구성하기
		
	
		Ban_active pg = map.get(page); // 키를 입력하여 해당 value 구하기
		
		pg.action(page); 
		
	}

}
// 서로 다른 클래스의 객체를 실행하기 위해 인터페이스로 배열로 만들어 실행시켰다.(주문하는거 만들 때)
// 배열 참고 cafe_main