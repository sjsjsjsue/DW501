package house;


import java.util.List;
import java.util.Scanner;

public class main__elec {
	
	static List<house_item> list =  null;
	
	public static void init(){
		file f = new file("C:/test/electronic.txt");
		
//		List<house_item> list = f.load(); // file 에 만들어준 list가 return 됨.
//		if( list!=null ) { // 파일 불러오기 성공
//		return list;
//		}
//		else { // 파일 불러오기 실패
//			return null;
		list = f.load();
		// list = f.load(); 오류가 남 
		// List<house_item> list =  null; 여기에 static을 붙여줘야 함
		
				}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		init(); 
		buyer jyj = new buyer();
		
		// init(); 인스턴스 변수와 클래스 변수는 만들어진 시점이 달라서 오타가 남.
		// 오타가 나지 않게 하려면 public static 으로 만들어야 함
//		for(house_item item : list) {
//			System.out.println(item.toString());
//		}
		
	
		
		// 문제) 1. TV 2. 에어컨 3. 컴퓨터 라는 선택할 수 있는 메뉴를 띄우고, 3개 중에서 하나 선택하면 해당 제품들만 출력되게 만들기
		while(true) { // 계속 출력할 수 있게 만듦
		System.out.println("1. TV    2. 에어컨    3. 컴퓨터 을 선택하시오.");
		int select = sc.nextInt(); // console 에 쓸 수 있게 만듦.
		int i=1;
		for(house_item item : list) { // 반복문 돌려
		switch(select) { // 선택하면 나올 수 있게
		case 1: 
			if( item instanceof tv) {
				System.out.println(i+"."+ item.toString() );
			}
			break;
		case 2:
			if(item instanceof aircon) {
				System.out.println(i+"."+ item.toString() );
			}
			break;
		case 3: 
			if(item instanceof computer) {
				System.out.println(i+"."+ item.toString() );
			}
			break;// 반복문 종료

				}
			i++;

			}
		
		// 문제 2. TV 제품을 구매하는데, TV가 아니면 다시 선택하게 만들기
		boolean flag = false; // 구매 제품이 선택한 제품 종류와 일치하는가?
			do {
			flag = false;
			System.out.println("구매할 제품 선택(구매 x : 0) : ");
			int item_num = sc.nextInt();
			if(item_num == 0) {
				continue; // 다시 반복문으로 돌아가기
			}else {
				switch(select) {// 구매 제품이 선택한 제품 종류와 일치하는가?
				case 1:
					if(!( list.get(item_num-1) instanceof tv)) {
						flag = true;
					}
					break;
				case 2:
					if( !(list.get(item_num-1) instanceof aircon)) {
						flag = true;
					}
					break;
				case 3:
					if( !(list.get(item_num-1) instanceof computer)) {
						flag = true;
					}
					break;
					}
				if(flag) continue; // 구매제품이 선택한 제품 종류와 맞지 않다면 다시 처음으로 가기
				jyj.buy(list.get(item_num-1));
				}
			}while(flag);
			// 문제 3. 제품 구매 후에 추가로 구매할 것인지, 의사를 물어보고 계속 구매, 중지 하게 만들기.
			System.out.println("추가 구매 하시겠습니까? (0,1) :");
			int end = sc.nextInt();
			if(end ==0) break;
			
		} // 제품 구매 반복문
		
		// 문제 4. 구매를 더 이상 하지 않는다면 지금까지 구매한 제품들 모두 출력하기.
		jyj.buylist();
		
	}

}
