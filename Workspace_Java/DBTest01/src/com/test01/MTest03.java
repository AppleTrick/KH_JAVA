package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest03 {
	public static void main(String[] args) {
		// deptno 를 입력받아서 , 부서테이블의 해당 부서 모든 정보 출력
		// SELECT DEPTNO, DNAME, LOC
		// FROM DEPT
		// WHERE DEPTNO = ??
		try {
			selectOne();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectOne() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호를 입력하세요 : ");
		int deptno = sc.nextInt();
		// 1.driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2.계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		// 3. query 준비
		String sql = " SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT "
				+ " WHERE DEPTNO = " +deptno ;

		Statement stmt = con.createStatement();

		// 4. query 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt("DEPTNO") + " \t " + rs.getString("DNAME") + "\t" + rs.getString("LOC"));
		}

		// 5. db 종료
		rs.close();
		stmt.close();
		con.close();

	}
}
