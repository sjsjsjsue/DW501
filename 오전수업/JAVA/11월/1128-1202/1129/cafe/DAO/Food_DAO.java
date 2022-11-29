package cafe.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cafe.VO.Order_list;
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

	public void order_insert(Order_list data) {
		// 매개변수를 Order_list 한 이유는 food_service에서 주문 내용들을 order_list 의
		// 객체에 저장하였기에 DB에 저장하려면 Order_list 객체의 값을 가져와서 저장해야한다.
		// DB에 저장하기 참고 1129.md
		
		String sql = "insert into order_list(food_name,an_order,order_price,memo)"
				+ "values(?,?,?,?)";
		try{
			pt = conn.prepareStatement(sql);
			pt.setString(1, data.getFood_name());
			pt.setString(2, data.getAn_order());
			pt.setInt(3, data.getPrice() );
			pt.setString(4, data.getMemo());
			
			pt.executeLargeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
//	주문내역
	public List<Order_list> order_select(String id){
		List<Order_list> list = new ArrayList<>(); 
		// 주문 내역이 여러개 존재할 수 있기에 배열로 저장하기 위해 ArrayList 를 사용
		
		String sql = "select * from order_list where an_order=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			while(rs.next()) {
				Order_list data = new Order_list(
						rs.getInt("order_seq"), rs.getString("food_name"),
						rs.getString("an_order"),rs.getInt("order_price"),
						rs.getInt("delivery_complete"), rs.getString("memo")
//			DB에서 가져온 데이터들을 order_list 객체로 하나씩 하나씩 생성해주고, Arraylist에 저장하기.
						);
				list.add(data);
			}
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
