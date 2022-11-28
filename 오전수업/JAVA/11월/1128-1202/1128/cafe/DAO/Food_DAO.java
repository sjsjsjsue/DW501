package cafe.DAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cafe.VO.food;

public class Food_DAO extends Base_DAO {
	
	public Map<Integer, food> food_list() {
		
		Map<Integer,food> food_map = new HashMap<>();
		
		String sql = "select * from food";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			
			 // 한개 일 때는 if 사용하면 되지만, 여러 데이터(레코드)는 반복문 돌리기!
			while(rs.next()) { 
				food data = new food(rs.getInt("food_seq"), 
									rs.getString("food_name"),
									rs.getInt("cost"),
									rs.getInt("cook_time"),
									rs.getString("cal"),
									rs.getString("allergy"),
									rs.getInt("order_quantity")
									); // food 순서대로 하기
				food_map.put(data.getFood_seq(), data);
			}
			return food_map;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
