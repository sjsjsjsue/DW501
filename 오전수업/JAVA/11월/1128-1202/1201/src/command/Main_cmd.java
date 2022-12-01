package command;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

import DAO.Venture_DAO;
import VO.Venture;

public class Main_cmd {
//	select_all 메소드에서 DB 전부 가져와서 Main_cmd 에서 출력하기
	public static void main(String[] args) {
		Venture_DAO vdao = new Venture_DAO();
		// venture_dao 를 통해 가지고 오기
		List<Venture> list = vdao.select_all();
		
		TreeSet<Venture> sw = new TreeSet();
		TreeSet<Venture> build = new TreeSet();
		
		Iterator<Venture> it = list.iterator();
		while(it.hasNext()) {
			Venture temp = it.next(); // arraylist에 저장된 기업 객체 하나씩 temp 에 저장하겠다.
			if(temp.getCategory().contains("정보처리")) {
				sw.add(temp);
			}
			if(temp.getCategory().contains("건설")) {
				build.add(temp);
			}
			
		}
		// System.out.println(sw);
		
		// treeset 메소드 (검색) - 참고 1201.md
		
		List<Venture> sw_list = new ArrayList<>(sw);
		// 5번 인덱스 있는 회사를 찾음
		System.out.println("5번째 인덱스에 있는 sw 회사는 "+ sw.floor( sw_list.get(5) ) );
		
		// 3번 인덱스보다 작은 회사를 찾음
		System.out.println("3번 인덱스보다 작은 회사는 "+ sw.headSet(sw_list.get(3) ) );
		
		System.out.println( "3번 인덱스보다 작은 객체는  " +sw.headSet(sw_list.get(3) ) );
		System.out.println("10번째 인덱스보다 작은 값은 가진 객체 중 가장 가까운 회사는 "+ sw.lower( sw_list.get(10) ) );
		System.out.println("2번째 인덱스와 4번째 인덱스에 있는 회사는 "+ sw.subSet(sw_list.get(2), sw_list.get(4) ) );
		
		Venture srh = new Venture();
		srh.setCompany("(주)골나");
		// treeSet 검색방법 : 참고 1201.md
		sw.add(srh);
		System.out.println("(주)고 보다 작은 회사는 "+sw.headSet(srh));

		
		
		
//		String a = "hot"; // boy(1) girl(6) hot(7) 
//		String b = "apple";
//		System.out.println(a.compareTo(b));
//		System.out.println(b.compareTo(a)); // _.compareTo() :  _와 ()의 사전적 순서를 보여줌. _쪽에 있는 것의 기준
//		// compareTo : 참고 1201.md 
		
		// list 안에 있는 변수에 vdao.select_all()의 데이터를 넣겠다.
//		for(Venture i : list) {
//			System.out.println(i.getNum()+"  "+i.getCompany()+"   "+i.getAddr()+
//								"   "+i.getCategory()+"   "+i.getBusiness_name()+
//								"   "+i.getProduct()
//					);
//		}// for 문 돌려서 데이터 가져오기
/*		
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
		// 참고 1201.md - HashSet
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
	/*	Venture a = new Venture(
					list.get(0).getNum(),
					list.get(0).getCompany(),
					list.get(0).getAddr(),
					list.get(0).getCategory(),
					list.get(0).getBusiness_name(),
					list.get(0).getProduct()
				);
		Venture b = new Venture(
				list.get(0).getNum(),
				list.get(0).getCompany(),
//				list.get(0).getAddr(),
				"박영주 어그",
				list.get(0).getCategory(),
				list.get(0).getBusiness_name(),
				list.get(0).getProduct()
			);
		
		if(list.contains(b)) { // list 와  b랑 비교
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		if(list.contains(a)) { // list 와 a 비교
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		*/
		
		// 문제 1. 정보처리 집합(sw)과 도소매 집합(retail)의 차집합 구하기(주소 - addr 기준으로)
	/*	HashSet<String> cha = new HashSet<>(); // 차집합
		HashSet<String> gyo = new HashSet<>(); // 교집합
		
	
		HashSet<String> addr = new HashSet<>();
		
		Iterator<String> zip = sw.iterator();
	 
		while(zip.hasNext()) {  // sw 와 retail 의 차집합 구하기
			String name = sw.;
			if(sw.contains(zip)) {
				continue;
			}
			cha.add(name);
		}
		System.out.println("정보처리 집합과 도소매 집합의 차집합은 "+cha+" 입니다");
		
		// teacher
		Set<Venture> cha = new HashSet<>(); // 차집합
		Set<Venture> gyo = new HashSet<>(); // 교집합
		
		Iterator<Venture> gp = sw.iterator();
		// 차집합 만드는 방법 1
		while(gp.hasNext()) {
			Venture temp = gp.next(); // Iterator 빼서 하나하나씩 gp 에 넣겠다.
			if(retail.contains(temp)) {
				continue;
			}
			cha.add(temp); // 배열로 만들어줌
		}
		System.out.println(cha);
		// 차집합 만드는 방법 2
		List<Venture> cha_list = new ArrayList<>(cha);
		
		for(Venture tmp: cha_list) {				
			System.out.println("정보처리 집합과 도소매 집합의 차집합은 "+tmp+" 입니다.");
		}
		
	*/	
		// 문제 2. 정보처리 집합과 도소매 집합의 교집합 구하기(주소 - addr 기준으로)
		/*zip = addr.iterator();
		while(zip.hasNext()) {
			String name = zip.next();
			if(retail.contains(name)) {
				gyo.add(name);
			}
		}
		System.out.println("정보처리 집합과 도소매 집합의 교집합은 "+gyo+" 입니다");
		*/
		/*
		 //teacher
		gp = sw.iterator();
		while(gp.hasNext()) {
			Venture temp = gp.next(); // Iterator 빼서 하나하나씩 gp 에 넣겠다.
			if(retail.contains(temp)) {				
				gyo.add(temp); // 배열로 만들어줌
			}
		}
		System.out.println("정보처리 집합과 도소매 집합의 교집합은 "+gyo+" 입니다");
		*/
			/*if(a.equals(b)) { 
			// 객체의 주소 비교
			// 같은 데이터인지 알고싶다면 venture에 equals 를 넣고 
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		*/
		
		//System.out.println(retail.toString()); - 데이터 조회	
		//System.out.println(sw.size()+"개"); - size == count
		
		// 차집합, 교집합, 합집합 : 참고. 1130.md
		// 주소를 기준으로
		
		/*HashSet<String> name1 = new HashSet<>();
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
		
		*/
	}
	

	
}
