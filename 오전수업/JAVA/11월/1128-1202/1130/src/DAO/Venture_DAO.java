package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import VO.Venture;

public class Venture_DAO extends Init_DAO {
//	select_all 메소드에서 DB 전부 가져와서 Main_cmd 에서 출력하기
	public List<Venture> select_all(){
		List<Venture> list = new ArrayList<>();
		
		String sql = "select * from venture";
		// sql 조회하는 쿼리문
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				Venture data = new Venture(
						rs.getInt("num"),
						rs.getString("company"),
						rs.getString("addr"),
						rs.getString("category").strip(),
						rs.getString("business_name"),
						rs.getString("product")
						); // sql 문 가져오기
				// strip() : console 에 빈칸 없애기 참고: 1130.md
				list.add(data);
				// 데이터를 list 에 집어넣기
			}
			return list;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	
	
}
