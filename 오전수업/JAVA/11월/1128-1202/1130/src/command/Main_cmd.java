package command;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import DAO.Venture_DAO;
import VO.Venture;

public class Main_cmd {
//	select_all 메소드에서 DB 전부 가져와서 Main_cmd 에서 출력하기
	public static void main(String[] args) {
		Venture_DAO vdao = new Venture_DAO();
		// venture_dao 를 통해 가지고 오기
		List<Venture> list = vdao.select_all();
		// list 안에 있는 변수에 vdao.select_all()의 데이터를 넣겠다.
//		for(Venture i : list) {
//			System.out.println(i.getNum()+"  "+i.getCompany()+"   "+i.getAddr()+
//								"   "+i.getCategory()+"   "+i.getBusiness_name()+
//								"   "+i.getProduct()
//					);
//		}// for 문 돌려서 데이터 가져오기
		
		Set<String> category = new HashSet<>();
		// 참고 : 1130.md - set
	
		Iterator<Venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getCategory());
		} // 카테고리별 분류 해놓음
		
//		System.out.println(category);
		Set<Venture> retail = new HashSet<>(); // 도소매업
		Set<Venture> sw = new HashSet<>(); // 정보처리, sw
		Set<Venture> build = new HashSet<>(); // 건설, 운수
		
		it = list.iterator(); // iterator 는 일회용이기때문에 다시 값을 넣어줘야 사용 가능!
		while(it.hasNext()) {
			Venture data = it.next(); // venture 데이터들을 하나씩 data 에 저장하기
			if(data.getCategory().contains("도소매업")) {
				retail.add(data);
			}
			if(data.getCategory().contains("정보처리")) {
				sw.add(data);
			}
			if(data.getCategory().contains("건설")) {
				build.add(data);
			}
			
		}
		//System.out.println(retail.toString()); - 데이터 조회	
		//System.out.println(sw.size()+"개"); - size == count
		
		// 차집합, 교집합, 합집합 : 참고. 1130.md
		// 주소를 기준으로
		
		HashSet<String> name1 = new HashSet<>();
		HashSet<String> name2 = new HashSet<>();
		
		name1.add("김유신"); name1.add("이순신"); name1.add("김춘추");
		name1.add("장영주"); name1.add("김기원"); name1.add("윤재영");
		name1.add("이지현"); name1.add("김지연"); name1.add("최윤도");

		name2.add("김민정"); name2.add("김민서"); name2.add("김춘추");
		name2.add("장영주"); name2.add("이종빈"); name2.add("윤종찬");
		name2.add("이지현"); name2.add("변수정"); name2.add("리정수");
		
		
		HashSet<String> hab = new HashSet<>();
		HashSet<String> cha = new HashSet<>();
		HashSet<String> cha1 = new HashSet<>();
		HashSet<String> gyo = new HashSet<>();
		
		Iterator<String> test = name1.iterator();
		// set 할 때 Iterator 무조건 추가해야함!
//		 set 은 출력하는 데이터가 없기 때문에, Iterator를 하면 있음
		
		// 합집합 찾기
		while(test.hasNext()) { //  name1의 데이터를 hab에 저장
			hab.add(test.next());
		}
		test = name2.iterator();
		while(test.hasNext()) { // name2의 데이터를 hab에 있는지 비교하여 없으면 저장.
			String name = test.next();
			if(hab.contains(name)) { // hab 내부에 name 값이 있는가?
				continue;				
			}
			hab.add(name);
		}
		System.out.println("name1 과 name2 의 있는 사람은 "+hab+" 입니다.");
		
		
		// 교집합 찾기		
		test = name2.iterator();
		while(test.hasNext()) {
			String name = test.next();
			if(name1.contains(name)) {
				gyo.add(name);
			}
		}
		System.out.println("name1과 name2의 둘 다 있는 사람은 "+gyo+" 입니다.");
		
		// 차집합 찾기
		test = name2.iterator();
		while(test.hasNext()) {  // name2 와 name1 의 차집합, name2에만 있는 이름 찾기
			String name = test.next();
			if(name1.contains(name)) {
				continue;
			}
			cha.add(name);
		}
		System.out.println("name2에만 있는 이름은 "+cha+" 입니다");
		
		test = name1.iterator();
		while(test.hasNext()) {
			String name = test.next();
			if(name2.contains(name)) {
				continue;
			}
			cha1.add(name);
		}
		System.out.println("name1에만 있는 이름은 "+cha1+" 입니다.");
		
		
	}
	

	
}
