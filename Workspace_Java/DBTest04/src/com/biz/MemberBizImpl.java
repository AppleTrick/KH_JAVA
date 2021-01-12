package com.biz;

import java.util.List;

import com.dao.MemberDao;
import com.dao.MemberDaoImpl;
import com.dto.MemberDto;

public class MemberBizImpl implements MemberBiz {
	
	private MemberDao dao = new MemberDaoImpl();

	@Override
	public List<MemberDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MemberDto selectOne(int m_no) {
		return dao.selectOne(m_no);
	}

	@Override
	public int insert(MemberDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(MemberDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int m_no) {
		return dao.delete(m_no);
	}

}
