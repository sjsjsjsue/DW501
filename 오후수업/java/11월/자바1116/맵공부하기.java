package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> x = new HashMap<String, Integer>();
		// Map<key, 데이터> 변수이름 = new HashMap<key, 데이터>();
		// MAP 데이터 추가
		// add == put
		x.put("one", 1);
		x.put("two", 2);
		x.put("three", 3);
		// x.put(key,value);
		
		// 데이터 가져오기
		// key 를 이용해 가져오기
		// x.get("one");
		System.out.println(x.get("one"));
		
		Map<String,Object> map = new HashMap<String,Object>();
		
//		object 는 int, String, boolean 모든 데이터 타입을 받을 수 잇다.
		map.put("empno", 7844);
		map.put("ename", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 1500);
		map.put("empno",7839); // key 는 중복될 수 없다.
		
		// 문제. empno 와 sal 출력하기
		System.out.println("사원번호 : "+map.get("empno"));
		System.out.println("급여 : "+map.get("sal"));
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map);
		
	}

}
