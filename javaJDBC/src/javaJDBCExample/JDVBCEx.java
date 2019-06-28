package javaJDBCExample;

import java.sql.*;

public class JDVBCEx {

	public static void main(String[] args) {
		
		// sqldeveloper �� ���� ������ DB_URL�� ��
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String DB_USER = "hyejin";
		String DB_PASS = "wow130";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		// ���� �ۼ�
		String query = "select * from emp";
		
		//
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {	// �ش� �̸�/����� Ŭ������ ���� ��� �ߴ� ����
			e.printStackTrace();
		}
		
		// Ŀ�ؼ� ����
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			// db�� ������ ���� ����
			stmt = conn.createStatement();
			// �����ͺ��̽��� ���� ����� ����
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				// ������ ����� �߿� 2��° column�� �ִ� ��� ��������
				String name = rs.getString(2);
				System.out.println(name);
			}
			
		} catch(Exception e) {}
		// ���� ����: �ʼ� (finally)
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
