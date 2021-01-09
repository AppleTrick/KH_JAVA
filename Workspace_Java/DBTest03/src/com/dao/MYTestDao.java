package com.dao;

import static com.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dto.MYTestDto;

// Data Access Object : db 완 접근하는 객체
// import static : class method 하고 호출할때 class 생략 가능
public class MYTestDao {
	
	Scanner sc = new Scanner(System.in);

	// 전체 출력

	public List<MYTestDto> selectList() {

		// Connection con = JDBCTemplate.getConnection(); -> 위 에 임포트로 저렇게 사용가능
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME " + " FROM MYTEST ";
		Statement stmt = null;
		ResultSet rs = null;
		List<MYTestDto> list = new ArrayList<MYTestDto>();

		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MYTestDto temp = new MYTestDto();
				temp.setMno(rs.getInt("MNO"));
				temp.setMname(rs.getString("MNAME"));
				temp.setNickname(rs.getString("NICKNAME"));

				list.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}

		return list;
	}

	public List<MYTestDto> selectOne() {
//	public MYTestDto selectOne() {
		// Connection con = JDBCTemplate.getConnection(); -> 위 에 임포트로 저렇게 사용가능
		System.out.println("찾을 번호를 입력해주세요");
		int deptno = sc.nextInt();
		Connection con = getConnection();
		String sql = " SELECT MNO, MNAME, NICKNAME " 
					+" FROM MYTEST " 
					+" WHERE MNO = " + deptno;
		Statement stmt = null;
		ResultSet rs = null;

		List<MYTestDto> list = new ArrayList<MYTestDto>();

		try {
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MYTestDto temp = new MYTestDto();
				temp.setMno(rs.getInt("MNO"));
				temp.setMname(rs.getString("MNAME"));
				temp.setNickname(rs.getString("NICKNAME"));

				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}
		return list;
		
//		MYTestDto temp = new MYTestDto();
//        int mno = sc.nextInt();
//
//        Connection con = getConnection();
//
//        String sql = " SELECT MNO, MNAME, NICKNAME "
//                + " FROM MYTEST "
//                + " WHERE MNO = ? ";
//
//        PreparedStatement pstm = null;
//        ResultSet rs = null;
//
//
//        try {
//            pstm = con.prepareStatement(sql);
//            pstm.setInt(1, mno);
//
//            rs = pstm.executeQuery();
//            while (rs.next()) {
//
//                temp.setMno(rs.getInt(1));
//                temp.setMname(rs.getString(2));
//                temp.setNickname(rs.getString(3));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rs);
//            close(pstm);
//            close(con);
//        }
//
//
//        return temp;
	}

	public void insert() {
		MYTestDto temp = new MYTestDto();
		System.out.println("번호를 입력해주세요");
		temp.setMno(sc.nextInt());
		System.out.println("이름을 입력해주세요");
		temp.setMname(sc.next());
		System.out.println("별명을 입력해주세요");
		temp.setNickname(sc.next());
		
		Connection con = getConnection();
		String sql = " INSERT INTO MYTEST "
					+" VALUES(?,?,?) ";
		
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, temp.getMno());
			pstm.setString(2, temp.getMname());
			pstm.setString(3, temp.getNickname());
			
			int res = pstm.executeUpdate();
			
			if (res > 0) {
				System.out.println("입력완료");
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

	public void update() {
		System.out.println("내용을 수정합니다.");
		MYTestDto temp = new MYTestDto();
		System.out.println("수정할 번호를 입력해주세요");
		temp.setMno(sc.nextInt());
		System.out.println("수정된 이름을 입력해주세요");
		temp.setMname(sc.next());
		System.out.println("수정된 별명을 입력해주세요");
		temp.setNickname(sc.next());
		
		Connection con = getConnection();
		String sql = " UPDATE MYTEST "
					+" SET MNAME = ? ,"
					+" NICKNAME = ? "
					+" WHERE MNO = ?";
		
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(3, temp.getMno());
			pstm.setString(1, temp.getMname());
			pstm.setString(2, temp.getNickname());
			
			int res = pstm.executeUpdate();
			
			if (res > 0) {
				System.out.println("입력완료");
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

	public void delete() {
		System.out.println("삭제를 진행합니다.");
		MYTestDto temp = new MYTestDto();
		System.out.println("삭제할 번호를 입력해주세요");
		temp.setMno(sc.nextInt());
		
		Connection con = getConnection();
		String sql = " DELETE "
					+" FROM MYTEST "
					+" WHERE MNO = " + temp.getMno();
		
		
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			
			int res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("입력완료");
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
