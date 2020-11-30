package com.cal;

import java.util.Scanner;

// 달력만들어주세요
// java util calendar 금지 다름 package 도 모두  금지
public class DayOfCalendar {
	public static void main(String[] args) {

		createCalendar();
	}

	public static void createCalendar() {
		int basicyear = 2020;

		int leapyear;

		int year;
		int month;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력해 주세요 : ");
		year = sc.nextInt();

		while (year < 1) {
			System.out.println("잘못된 년도 입니다. 다시 입력해주세요");
			year = sc.nextInt();
		}

		System.out.println("달을 입력해 주세요 : ");
		month = sc.nextInt();

		while (month > 12 || month < 1) {
			System.out.println("잘못된 달 입니다. 다시 입력해주세요");
			month = sc.nextInt();
		}

		int day = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		default:
			day = 30;
			break;
		}

		// day 날짜 계산
		if (month == 2) {
			if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
				// 윤년일 경우
				day = 29;
			} else {
				// 윤년이 아닐 경우
				day = 28;
			}
		}

		if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
			// 윤년일 경우
			leapyear = 1;
		} else {
			// 윤년이 아닐 경우
			leapyear = 0;
		}

		// 탭의 횟수 구하기
		int tabnum = 3;

		// 입력한 년도가 기본년도일 경우
		if (basicyear == year) {
			tabnum = tabnum + dayday(month, leapyear);
			tabnum = tabnum % 7;
		} else if (basicyear > year) {
			// 입력한 년도가 기본년도 보다 작을 경우
			tabnum = tabnum - (int) Math.abs((basicyear - year));
			tabnum = tabnum - (int) Math.abs((basicyear - year) / 4);
			tabnum = tabnum + dayday(month, leapyear);
			tabnum = (int)Math.abs(tabnum) % 7;
		} else if (basicyear < year) {
			// 입력한 년도가 기본년도 보다 클경우
			tabnum = tabnum + 1;					// 2020 년의 윤년을 지낫을때
			tabnum = tabnum + (int) Math.abs((basicyear - year));
			tabnum = tabnum + (int) Math.abs((basicyear - year) / 4);
			tabnum = tabnum + dayday(month, leapyear);
			tabnum = tabnum % 7;
		}

		System.out.println("==========<" + month + "월 >==========");
		for (

				int i = 1; i <= day; i++) {

			// 탭의 횟수
			for (int j = 0; j < tabnum; j++) {
				System.out.printf("\t");
				count++;
			}
			// 탭 초기화
			tabnum = 0;

			System.out.printf("%d \t", i);
			count++;

			if (count == 7) {
				System.out.println();
				count = 0;
			}
		}
		System.out.println();
		System.out.println("============================");
	}

	// 날짜 구하는 함수
	public static int dayday(int month, int leapyear) {
		int day = 0;
		int result = 0;
		for (int i = 1; i < month; i++) {

			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 2:
				if (leapyear ==1) {
					day = 29;
					break;
				} else if (leapyear == 0) {
					day = 28;
					break;
				}
			default:
				day = 30;
				break;
			}
			result = result + day;
		}

		return result;
	}
}
