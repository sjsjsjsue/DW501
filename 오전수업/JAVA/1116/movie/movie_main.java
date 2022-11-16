package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class movie_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <movieVo> list = new ArrayList<movieVo>();
		
		
		String path = "c:/test/movie.txt";
		// 파일의 경로
		
		try (BufferedReader file = new BufferedReader(new FileReader(path));) // 가장 안정적으로 문서 파일을 불러올 수 있음.
		{
//			BufferedReader file = new BufferedReader(new FileReader(path)); // 가장 안정적으로 문서 파일을 불러올 수 있음.
			// 파일 읽어오는거면 무조건 예외처리를 해줘야 함!!
			
//			String line = file.readLine(); // readLine 을 통해 파일을 불러옴
//			System.out.println(line); // 첫번째 줄 가져옴.
//			
//			line = file.readLine();
//			System.out.println(line); // 두번째 줄 가져옴.
			
			// 마지막 나오고 다음 값은 없으니까 null이 나옴.
			
			
			while(true) {
				String line = file.readLine();
				if(line == null)  break; // null 값이 나온 다음 사용해야하니까 readLine 뒤에 써줘야 함
//				System.out.println(line);  // 잘 나오는지 확인
				String[] temp = line.split(" "); // 문자열을 분리시킴. So 문자열임.
				// temp[0] : 제목 / temp[1] : 년도 / temp [2] : 관람등급
				movieVo data = new movieVo(temp[0],
						Integer.parseInt(temp[1]),Integer.parseInt(temp[2])); 
				list.add(data);
				
				
			}
			
			// file.close(); : try 문 {} 안에 사용했다면 무조건 써야함. 만약 try() 안에 사용했다면 사용 ㄴㄴ
			
		}catch(Exception e) {
			// try 내부에 오류가 있다면 catch 문 실행
			System.out.println("파일 없다.");
		}
		
		for(movieVo data : list) {
			System.out.println(data.toString());
		}
		
	
		
		// new movieVo(); 
		// 객체를 생성. 생성자가 존재하지 않아도 생성자가 존재. Why? 기본적으로 "void movieVo(){}"가 있음.
		
		
		
//		List<movieVo> list = new ArrayList<movieVo>();
		/*
		 * 영화 총 4개 입력 하여 출력까지 ! 
		 * */
		// 정답
//		movieVo[] arr = new movieVo[4];
//		
//		arr[0] = new movieVo("블랙 팬서-와칸다 포에버",2022,"12세 관람가");
//		arr[1] = new movieVo("동감",2022,"12세 관람가");
//		arr[2] = new movieVo("데시벨",2022,"12세 관람가");
//		arr[3] = new movieVo("올빼미",2022,"15세 관람가");
//		
//		for(movieVo data : arr) {
//			data.output();
//		}

	

//		movieVo m1 = new movieVo();
//		m1.title = "블랙 팬서-와칸다 포에버";
//		m1.year = 2022;
//		m1.filmRating = "12세 관람가";
//		
//		m1.output();
//		
//		
//		movieVo m2 = new movieVo();
//		m2.title = "동감";
//		m2.year = 2022;
//		m2.filmRating = "12세 관람가";
//		
//		m2.output();
//		
//		movieVo m3 = new movieVo();
//		m3.title = "데시벨";
//		m3.year = 2022;
//		m3.filmRating = "12세 관람가";
//		
//		m3.output();
//		
//		movieVo m4 = new movieVo();
//		m4.title = "올빼미";
//		m4.year = 2022;
//		m4.filmRating = "15세 이상 관람가";
//		
//		m4.output();
		
	}

}

 