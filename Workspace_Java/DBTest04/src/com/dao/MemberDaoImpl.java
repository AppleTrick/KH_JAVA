package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static com.common.JDBCTemplate.*;

import com.dto.MemberDto;

public class MemberDaoImpl implements MemberDao {

	@Override
	public List<MemberDto> selectList() {
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		Connection con = getConnection();
		
		Statement stmt = null;
		ResultSet res = null;
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(SELECT_LIST_SQL);
			
			while (res.next()) {
				MemberDto dto = new MemberDto();
				dto.setM_no(res.getInt(1));
				dto.setM_name(res.getString(2));
				dto.setM_age(res.getInt(3));
				dto.setM_gender(res.getString(4));
				dto.setM_location(res.getString(5));
				dto.setM_job(res.getString(6));
				dto.setM_tel(res.getString(7));
				dto.setM_email(res.getString(8));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(res);
			close(stmt);
			close(con);
		}
		
		return list;
	}

	@Override
	public MemberDto selectOne(int m_no) {
		
		MemberDto selectOne = new MemberDto();
		
		Connection con = getConnection();
		
		PreparedStatement pstm = null;
		ResultSet res = null;
		
		
		try {
			pstm = con.prepareStatement(SELECT_ONE_SQL);
			pstm.setInt(1, m_no);
			res = pstm.executeQuery();
			
			res.next();
			
			selectOne.setM_no(res.getInt("M_NO"));
			selectOne.setM_name(res.getString("M_NAME"));
			selectOne.setM_age(res.getInt("M_AGE"));
			selectOne.setM_gender(res.getString("M_GENDER"));
			selectOne.setM_location(res.getString("M_LOCATION"));
			selectOne.setM_job(res.getString("M_JOB"));
			selectOne.setM_tel(res.getString("M_TEL"));
			selectOne.setM_email(res.getString("M_EMAIL"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstm);
			close(res);
			close(con);
		}
		
		return selectOne;
	}

	@Override
	public int insert(MemberDto dto) {
		
		Connection con = getConnection();
		
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(INSERT_SQL);
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			
			res = pstm.executeUpdate();
			
			if (res > 0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}

	@Override
	public int update(MemberDto dto) {
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(UPDATE_SQL);
			pstm.setInt(8, dto.getM_no());
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
			
			res = pstm.executeUpdate();
			
			if (res > 0) {
				commit(con);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		
		return res;
	}

	@Override
	public int delete(int m_no) {
		
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, m_no);
			
			res = pstm.executeUpdate();
			
			if (res > 0) {
				commit(con);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		
		return res;
	}

}
