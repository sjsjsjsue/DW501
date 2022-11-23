package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Member_DAO {
	
	private Connection conn = null; // 데이터베이스 연결정보를 저장.
	private Statement st = null; // SQL 질의문을 데이터 베이스에 전달
	private PreparedStatement pt = null; // SQL 질의문을 데이터 베이스에 전달
	private ResultSet rs = null; // SQL 질의문 조회 결과를 저장.
	
	
	public Member_DAO() { // 기본생성자 메소드
		DriverLoad();
		connect();
		table_check();
	}
	
	public boolean member_insert(String id, String name, String tel, String email) {
		String sql = "insert into member(id,name,tel,email) values(?,?,?,?)";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
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
	
	private void connect() {
		// DB 주소 : jdbc:mysql:// 데이터베이스 서버주소:mysql-port/DB명
		String url ="jdbc:mysql://localhost:3306/dw_501";
		String user = "root"; // mysql 계정명
		String pass = "polo75312";//mysql 계정 비번
		try {
			conn = DriverManager.getConnection(url,user,pass);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("접속 실패");
		}
	}
	
	private void DriverLoad() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} 
		// com.mysql.cj.jdbc.Driver : MySQL 이라서 저렇게 씀.
		
		
		// Class.forName("cafe.control.order.0");
		// 드라이버 로드 : 참고 1123.md
		
	}
	
	
}
