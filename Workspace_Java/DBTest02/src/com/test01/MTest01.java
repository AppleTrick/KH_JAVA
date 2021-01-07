package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택");
		System.out.println("1: 전체선택 \n2: 특정 부서 선택 \n3: 부서 추가 \n4: 부서 수정 \n5: 부서 삭제 \n6: 종료");
		int select = sc.nextInt();
		
		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(select) {
		 case 1:
		   selectList();
		   break;
		 case 2:
		   selectOne();
		   break;
		  case 3:
		    insert();
		    break;
		  case 4:
		    update();
		    break;
		  case 5:
		    delete();
		    break;
		  default:
		    System.out.println("종료");
		}
	}

	public static void selectList() {
		
		// 2. 꼐
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
		
		
		String sql = " SELECT * FROM DEPT ";
		
		Statement stmt = null;
		try {
			stmt = con.createStatement(); 
		} catch (Exception e) {
			
		}
		
		ResultSet res = null;
		
		try {
			res = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while(res.next()) {
				System.out.println(res.getInt("DEPTNO") + " \t " + res.getString(2) + "\t" + res.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void selectOne() {
		
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호를 입력하세요 : ");
		int deptno = sc.nextInt();
		
		String sql = " SELECT DEPTNO, DNAME, LOC "
					+" FROM DEPT "
					+" WHERE DEPTNO = " + deptno;
		
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ResultSet res = null;
		try {
			res = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(res.next()) {
				System.out.println(res.getInt(1) + " \t " + res.getString(2) + "\t" + res.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void insert() {
		System.out.println("부서를 추가합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 입력 : ");
		String dname = sc.next();
		System.out.println("지역 입력");
		String loc = sc.next();
		
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
		
		String sql = " INSERT INTO DEPT "
					+" VALUES (?,?,?) ";
		
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, deptno);
			pstm.setString(2, dname);
			pstm.setString(3, loc);
			
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("입력 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void update() {
		System.out.println("수정할 부서 내용을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서번호 입력해주세요 : ");
		int deptno = sc.nextInt();
		System.out.println("수정된 부서 이름 입력 : ");
		String dname = sc.next();
		System.out.println("수정된 지역 입력");
		String loc = sc.next();
		
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
		
//		String sql = " UPDATE DEPT "
//					+" SET DNAME = " + dname
//					+" LOC = " + loc
//					+" WHERE DEPTNO = " + deptno;
		
		String sql = " UPDATE DEPT "
					+" SET DNAME = ? ,"
					+" LOC = ?"
					+" WHERE DEPTNO = ?";
		
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dname);
			pstm.setString(2, loc);
			pstm.setInt(3, deptno);

			
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("입력 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void delete() {
		System.out.println("삭제할 부서 내용을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서번호 입력해주세요 : ");
		int deptno = sc.nextInt();
	
		
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
		
		
		String sql = " DELETE "
					+" FROM DEPT"
					+" WHERE DEPTNO = " + deptno;

		
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			int res = stmt.executeUpdate(sql);
			if (res > 0) {
				System.out.println("실행 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
