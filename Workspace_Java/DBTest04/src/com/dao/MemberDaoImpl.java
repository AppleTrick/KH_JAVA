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
			pstm.setInt("M_", x);
			res = pstm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return selectOne;
	}

	@Override
	public int insert(MemberDto dto) {
		
		return 0;
	}

	@Override
	public int update(MemberDto dto) {
		
		return 0;
	}

	@Override
	public int delete(int m_no) {
		
		return 0;
	}

}
