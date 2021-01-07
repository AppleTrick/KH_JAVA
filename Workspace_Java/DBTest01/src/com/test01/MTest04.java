package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest04 {

	public static void main(String[] args) {
		//DEPT 테이블 값 저장
		insert();
	}
	
	public static void insert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("지역 입력");
		String loc = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			//con.setAutoCommit(false);
			//
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.
		//4.
		String sql = " INSERT INTO DEPT " 
					+ " VALUES (" + deptno + ", '"+ dname + "' , '" + loc + "') ";
		
		Statement stmt = null;
//		ResultSet rs = null;
		try {
			
			//3 .
			stmt = con.createStatement();
			
			//4.
			int res = stmt.executeUpdate(sql);
			if(res > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			// 5
			try {
				stmt.close();
				
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
