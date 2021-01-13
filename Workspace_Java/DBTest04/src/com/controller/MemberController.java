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
//				System.out.printf("%d %10s %10d %10s %10s %10s %10s %10s\n", 
//						listOne.getM_no(), 
//						listOne.getM_name(),
//						listOne.getM_age(),
//						listOne.getM_gender(),
//						listOne.getM_location(),
//						listOne.getM_job(),
//						listOne.getM_tel(),
//						listOne.getM_email()
//						);
				System.out.println(listOne);
				break;
			case 3:
				System.out.println("내용을 추가합니다.");
				System.out.println("1. 이름을 입력해주세요 : ");
				String insertName =sc.next();
				System.out.println("2. 나이를 입력해주세요");
				int insertAge =sc.nextInt();
				System.out.println("3. 성별을 입력해주세요 M or F");
				String insertGender = sc.next();
				System.out.println("4. 지역을 입력해주세요");
				String insertLocation = sc.next();
				System.out.println("5. 직업을 입력해주세요");
				String insertJob = sc.next();
				System.out.println("6. 전화번호를 입력해주세요");
				String insertTel = sc.next();
				System.out.println("7. 이메일을 입력해주세요");
				String insertEmail = sc.next();
				
				MemberDto insertOne = new MemberDto();
				insertOne.setM_name(insertName);
				insertOne.setM_age(insertAge);
				insertOne.setM_gender(insertGender);
				insertOne.setM_location(insertLocation);
				insertOne.setM_job(insertJob);
				insertOne.setM_tel(insertTel);
				insertOne.setM_email(insertEmail);
				
				int insertRes = biz.insert(insertOne);
				
				if (insertRes > 0) {
					System.out.println("추가성공");
				} else {
					System.out.println("추가실패");
				}
				
				break;
			case 4:
				System.out.println("내용을 수정합니다");
				System.out.println("수정할 번호를 선택합니다.");
				int updateNo = sc.nextInt();
				System.out.println("1. 이름을 입력해주세요 : ");
				String updateName =sc.next();
				System.out.println("2. 나이를 입력해주세요");
				int updateAge =sc.nextInt();
				System.out.println("3. 성별을 입력해주세요 M or F");
				String updateGender = sc.next();
				System.out.println("4. 지역을 입력해주세요");
				String updateLocation = sc.next();
				System.out.println("5. 직업을 입력해주세요");
				String updatetJob = sc.next();
				System.out.println("6. 전화번호를 입력해주세요");
				String updateTel = sc.next();
				System.out.println("7. 이메일을 입력해주세요");
				String updateEmail = sc.next();
				
				MemberDto updateDto = new MemberDto();
				updateDto.setM_no(updateNo);
				updateDto.setM_name(updateName);
				updateDto.setM_age(updateAge);
				updateDto.setM_gender(updateGender);
				updateDto.setM_location(updateLocation);
				updateDto.setM_job(updatetJob);
				updateDto.setM_tel(updateTel);
				updateDto.setM_email(updateEmail);
				
				int res = biz.update(updateDto);
				
				if (res > 0) {
					System.out.println("업데이트 성공");
				} else {
					System.out.println("업데이트 실패");
				}
				
				break;
			case 5:
				System.out.println("항목을 삭제합니다.");
				System.out.println("삭제할 번호를 입력해주세요");
				int deleteNo = sc.nextInt();
				
				int deleteRes = biz.delete(deleteNo);
				
				if(deleteRes > 0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				
				break;
			case 6:
				System.out.println("프로그램을 종료합니다");
				break;
				
			}
		}
		
	}
}
