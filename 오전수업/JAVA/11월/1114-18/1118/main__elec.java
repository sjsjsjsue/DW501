package house;


import java.util.List;

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
		
		init(); 
		// init(); 인스턴스 변수와 클래스 변수는 만들어진 시점이 달라서 오타가 남.
		// 오타가 나지 않게 하려면 public static 으로 만들어야 함
		for(house_item item : list) {
			System.out.println(item.toString());
		}
	}

}
