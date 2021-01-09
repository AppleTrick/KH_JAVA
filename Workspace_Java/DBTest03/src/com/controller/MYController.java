package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MYTestBiz;
import com.dto.MYTestDto;

public class MYController {

	private static Scanner sc = new Scanner(System.in);

	public static int getMenu() {
		StringBuffer sb = new StringBuffer();
		sb.append("1. 전체 출력 \n").append("2. 선택 출력 \n").append("3. 삽     입 \n").append("4. 수     정 \n")
				.append("5. 삭     제 \n").append("6. 종     료 \n").append("input select : ");
		System.out.println(sb);
		int select = sc.nextInt();
		return select;
	}

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		int select = 0;
		MYTestBiz biz = new MYTestBiz();

		do {
			select = getMenu();

			switch (select) {
			case 1:
				// 전체출력
				List<MYTestDto> list = biz.selectList();

				for (MYTestDto dto : list) {
					System.out.printf("%d %10s %10s\n", dto.getMno(), dto.getMname(), dto.getNickname());
				}
				break;
			case 2:
				// 선택출력
				List<MYTestDto> list1 = biz.selectOne();
//				MYTestDto list1 = biz.selectOne();

				for (MYTestDto dto : list1) {
					System.out.printf("%d \t%10s \t %10s\n", dto.getMno(), dto.getMname(), dto.getNickname());
				}
//				System.out.printf("%d \t%10s \t %10s\n", list1.getMno(), list1.getMname(), list1.getNickname());
				break;
			case 3:
				// 삽입
				biz.insert();
				break;
			case 4:
				// 수정
				biz.update();
				break;
			case 5:
				// 삭제
				biz.delete();
				break;
			case 6:
				// 전체출력
				System.out.println("프로그램이 종료 되었습니다.");
				break;

			default:
				break;
			}

		} while (select != 6);
	}
}
