package com.cal;

import java.util.Scanner;

// 달력만들어주세요
// java util calendar 금지 다름 package 도 모두  금지
public class DayOfCalendar {
	public static void main(String[] args) {

		createCalendar();
	}

	public static void createCalendar() {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 년도 입력
		System.out.println("년도를 입력해주세요");
		int year = sc.nextInt();
		
		while (year < 1) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			year = sc.nextInt();
		}
		
		// 달입력
		System.out.println("월을 입력해주세요");
		int month = sc.nextInt();
		
		while (month < 1 || month > 12) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			month = sc.nextInt();
		}
		
		// 윤년 여부 파악
		boolean leapyear = false;
		if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
			leapyear = true;
		} else {
			leapyear =false;
		}
		
		// 입력한 년도 12 / 31일 까지의 날 수를 구함
		int Allday = (year-1)*365 + (year-1)/4 + (year-1)/400 - (year-1)/100;
		
		
		//입력한 이전 월까지의 날
		int day = 0;
		for (int i = 1; i < month; i++) {
			day = day + search_monthday(i, leapyear);
		}
		
		day = (day + Allday +1)%7;
		
		int count = 0;
		
		// 몸체 만들기
		System.out.printf("===== %d 년 %d 월 =======\n",year,month);
		for (int i = 0; i < day; i++) {
			System.out.printf("\t");
			count ++;
		}
		for (int i = 1; i < search_monthday(month, leapyear)+1; i++) {
			System.out.printf("%d\t",i);
			count ++;
			if (count == 7) {
				System.out.println("");
				count = 0;
			}
		}
	}
	public static int search_monthday( int i ,boolean leapyear) {
		int month_day =0;
		
		switch (i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12 :
			month_day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			month_day = 30;
			break;
		case 2:
			if (leapyear = true) {
				month_day = 29; 
			} else {
				month_day = 28; 
			}
			break;
		}
		
		return month_day;
	}
}
