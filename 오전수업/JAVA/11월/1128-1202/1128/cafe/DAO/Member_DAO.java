package cafe.DAO;


import java.sql.SQLException;


import cafe.VO.Member;
import cafe.main.cafe_main;



public class Member_DAO extends Base_DAO{
	

	
	
	public Member_DAO() { // 기본생성자 메소드
	
		table_check();
	}
	//로그인
	public boolean login(String id, String pw) {
		String sql = "select * from member where id=? and tel=?";
		// member 테이블에서 id and tel 일치 하는지 확인
		try {
			pt = conn.prepareStatement(sql);
			
			// ? 인 값이 무엇인가?
			pt.setString(1, id);
			pt.setString(2, pw);
			
			rs = pt.executeQuery();
			if(rs.next()) { // id 와 tel 이 일치하는 정보라면, 로그인 성공
				cafe_main.user = new Member(rs.getString(2), 
								rs.getString(3),
								rs.getString(4),
								rs.getString(5),
								rs.getInt(6),
								rs.getString(7)
								);
								// rs.getString 7 추가
				// rs.getString(1) : 컬럼순서를 잘 기억하자!!
				return false; 	
			} 
			
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
		
		return true; // 아이디 비번이 잘못되어서 로그인 실패
		
	}
	// 아이디 이메일 중복 확인
	public boolean id_check(String id, String email) {
		String sql = "select * from member where id=? or email=?";
		// member 테이블에서 id 또는 email 이 있는가 조회
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, email);
			
			rs = pt.executeQuery();
			if(rs.next()) {// id or email 이 있다면 rs.next()에는 값이 있다. 그럼 중복
				return true;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return false; //rs에 값이 없다면 가입하지 않은 id or email 가입
	}
	
	public boolean member_insert(String id, String name, String tel, String email,String allergy) {
		String sql = "insert into member(id,name,tel,email,allergy) values(?,?,?,?,?)";
		//allergy and ? 추가
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.setString(5, allergy);
		
			pt.executeUpdate(); // query - select - 조회   , update - 변경, 추가, 삭제
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	private void tablemake() {
		String sql = "create table member(member_seq int auto_increment primary key,"
				+ "id varchar(50) not null, name varchar(20) not null,"
				+ "tel varchar(20) not null, email varchar(255) not null)";
		
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("member 테이블 생성");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	private void table_check() {
		String sql = "select COUNT(*) as cnt from information_schema.tables ";
		sql += "where table_schema='dw_501' and table_name='member'";//mysql 기준
		
		try {
			st = conn.createStatement();  // 접속 정보로 질의문 저장 할 수 있는 객체 생성.
			rs = st.executeQuery(sql); // 만들어놓은 질의문을 저장해서 연결된 데이터베이스에 전달.
			// select 를 쓰기 때문에, executeQuery 를 사용함. 
			if(rs.next()) { // rs.next() : rs의 결과값이 있는가? 확인하고 rs 에서 값 가져오기해야한다.
				int cnt = rs.getInt("cnt");
				if(cnt ==0) {
					tablemake();
				}
			}
			rs.close();
			st.close();
//			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 발생할 수 있는 오류에 대해 출력
		}
	}

	

	
	
}
