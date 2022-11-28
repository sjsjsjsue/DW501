package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base_DAO {

	protected Connection conn = null;
	protected Statement st = null;
	protected PreparedStatement pt =null;
	protected ResultSet rs = null;
	
	public Base_DAO() {
		DriverLoad();
		Connect();
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
	private void Connect() {
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
}
