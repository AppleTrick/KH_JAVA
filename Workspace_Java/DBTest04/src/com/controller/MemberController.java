package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBiz;
import com.biz.MemberBizImpl;
import com.dto.MemberDto;

public class MemberController {

	
	private static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("*************\n")
		  .append("1. 전체출력  \n")
		  .append("2. 선택출력  \n")
		  .append("3. 추    가  \n")
		  .append("4  수    정  \n")
		  .append("5. 삭    제  \n")
		  .append("6. 종    료  \n")
		  .append("*************\n")
		  .append("input select : ");
		System.out.println(sb);
		select = sc.nextInt();
		
		return select;
		  
		  
	}
	
	public static void main(String[] args) {
	
		int select = 0;
		MemberBiz biz = new MemberBizImpl();
		
		while(select != 6) {
			select = getMenu();
			
			switch(select) {
			case 1:
				System.out.println("전체를 출력합니다");
				
				List<MemberDto> list = biz.selectList();
				
				for (MemberDto Dto : list) {
					System.out.printf("%d %10s %10d %10s %10s %10s %10s %10s\n", 
							Dto.getM_no(), 
							Dto.getM_name(),
							Dto.getM_age(),
							Dto.getM_gender(),
							Dto.getM_location(),
							Dto.getM_job(),
							Dto.getM_tel(),
							Dto.getM_email()
							);
				}				
				break;
			case 2:
				System.out.println("부분을 출력합니다.");
				System.out.println("출력할 번호를 입력해주세요");
				int selectNo = sc.nextInt();
				
				MemberDto listOne = biz.selectOne(selectNo);
				System.out.printf("%d %10s %10d %10s %10s %10s %10s %10s\n", 
						listOne.getM_no(), 
						listOne.getM_name(),
						listOne.getM_age(),
						listOne.getM_gender(),
						listOne.getM_location(),
						listOne.getM_job(),
						listOne.getM_tel(),
						listOne.getM_email()
						);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
				
			}
		}
		
	}
}
