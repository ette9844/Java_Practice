package javaJDBCExample;

import java.sql.*;

public class JDVBCEx {

	public static void main(String[] args) {
		
		// sqldeveloper 의 세부 설정이 DB_URL이 됨
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String DB_USER = "hyejin";
		String DB_PASS = "wow130";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		// 쿼리 작성
		String query = "select * from emp";
		
		//
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {	// 해당 이름/경로의 클래스가 없을 경우 뜨는 예외
			e.printStackTrace();
		}
		
		// 커넥션 생성
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			// db를 연결해 놓은 상태
			stmt = conn.createStatement();
			// 데이터베이스의 쿼리 결과값 저장
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				// 가져온 결과값 중에 2번째 column에 있는 결과 가져오기
				String name = rs.getString(2);
				System.out.println(name);
			}
			
		} catch(Exception e) {}
		// 연결 끊기: 필수 (finally)
		finally {
			try {
				rs.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
