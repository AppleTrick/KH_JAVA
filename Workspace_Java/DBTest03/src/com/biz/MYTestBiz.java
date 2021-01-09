package com.biz;

import java.util.List;

import com.dao.MYTestDao;
import com.dto.MYTestDto;

public class MYTestBiz {
	
	//Biz : Business Logic -> 연산처리
	private MYTestDao dao = new MYTestDao();
	
	public List<MYTestDto> selectList(){
		return dao.selectList();
	}
	public List<MYTestDto> selectOne(){
		return dao.selectOne();
	}
//	public MYTestDto selectOne(){
//		return dao.selectOne();
//	}
	
	public void insert() {
		dao.insert();
	}
	public void update() {
		dao.update();
	}
	public void delete() {
		dao.delete();
	}
}

// 
