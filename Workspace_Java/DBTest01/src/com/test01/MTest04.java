package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest04 {

	public static void main(String[] args) {
		//DEPT 테이블 값 저장
		//insert();
		insertForPrepared();
	}
	
	public static void insertForPrepared() {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("지역 입력");
		String loc = sc.next();
		
		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. 계정 연결
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3. 쿼리문 준비
		String sql = " INSERT INTO DEPT "
				   + " VALUES (?,?,?) ";
		
		PreparedStatement pstm = null;
		// 굳이 값을 받지 않고 ??? 로 사용한다.
		try {
			
			// 3.
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, deptno);
			pstm.setString(2, dname);
			pstm.setString(3, loc);
			
			//4.쿼리 실행 및 리턴
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("입력 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5. db 종료
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
	
	public static void insert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("지역 입력");
		String loc = sc.next();
		
		
		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			//con.setAutoCommit(false);
			// connecton 객체가 가지고 있는 autocommit 
			// statement 값을 주면 모든 sql statement를 트랜잭션을 개별적으로 실행
			// then all its sql statement will be executed and as indiviual transaction
			// sql 문을 db에 영구적으로 번영시키는것 commit
			// 반영시키는 걸 뒤로 되돌릴때 rollback 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3. 쿼리 준비
		String sql = " INSERT INTO DEPT " 
					+ " VALUES (" + deptno + ", '"+ dname + "' , '" + loc + "') ";
		
		
		Statement stmt = null;
		//ResultSet rs = null;
		try {
			
			stmt = con.createStatement();
			
			// 4.query 실행 및 리턴
			
			// 4-1 . SELECT 실행시
			// ResultSet rs = stmt.executeQuery(sql);
			// select 일 경우에만 이거 사용한다.
			
			
			// 4-2 . INSERT UPDATE DELETE 
			// int res = stmt.executeUpdate(sql);
			// DML (INSERT UPDATE DELETE) 이거나 DDL 사용할 때 사용한다.
			
			// int 의 의미 DDl( INSERT UPDATE DELETE )실행했을때 결과 row의 갯수
			int res = stmt.executeUpdate(sql);
			
			if(res > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			
			// 5. db 종료
			try {
				stmt.close();
				
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
