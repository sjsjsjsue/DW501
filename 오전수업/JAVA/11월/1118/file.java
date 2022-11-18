package house;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class file {
	
	private String path;
	
	public file() {}
	public file(String path) {
		this.path = path;
	
	}
	public void save(List<house_item>list ) {}
	public List<house_item> load() {
		
		List<house_item> list = new ArrayList<>();
		
		try (BufferedReader bfr = new BufferedReader(new FileReader(path))){
			
			while(true) {
			String line = bfr.readLine();
			if( line == null ){ // 더이상 가져올 것이 없을 때 
				break; // 그만 작동!
				}
				String[] temp = line.split(" "); // split 안에 있는 것으로 나눠라!
				switch(temp[0]) { // 
				case "tv":
					list.add (new tv(temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3])));
					// Integer.parseInt(temp[2]) 하는 이유? 생성자 메소드중에 temp2,3은 정수이기 때문에 정수로 변경해줘야 함
					
					break;
				case "에어컨":
					list.add(new aircon(temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3])));
					break;
				case "컴퓨터":
					list.add(new computer(temp[1],Integer.parseInt(temp[2]),temp[3]));
					break;
				
				}
			}
			return list;
			
		}catch(Exception e){
			e.printStackTrace(); // 오류메세지를 보여줌
		}
		
		return null;
	}
}
