package com.cal;

import java.util.Scanner;

public class DayOfCalendar1 {

	/// 함수는 윤년 확인
	
	//  
	public static boolean isLeapYear(int year) {
		boolean isLeap = false;

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			isLeap = true;
		}
		
		return isLeap;
	}
	
	// 년도랑 월에 따른 날짜 수
	public static int getDates(int year, int month) {
		//4년 2월
		// 1년 1월
		int result = 0;

		if (isLeapYear(year)) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				result = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = 30;
				break;
			case 2:
				result = 29;
				break;
			}
		} else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				result = 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				result = 30;
			} else if (month == 2) {
				result = 28;
			}
		}

		return result;
	}

	
	// 요일을 구분하는 함수
	public static String dayCharacter(int day) {
		switch (day) {
		case 0:
			return "일요일";
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";
		}
		return null;
	}

	// 메인 메소드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" 연도 입력");
		int year = sc.nextInt();

		System.out.println("월 입력 : ");
		int month = sc.nextInt();

		System.out.println("일 입력 : ");
		int day = sc.nextInt();
		
		// 요일을 구하려면 어떻게해야되는가 ?
		// 주가 7일이니까
		// 처음시작되는 날부터 입력한 값의 날 수 를 더한다음에 7 로 나누면 되지 않을까
		// 이러면 시작된다.
		
		
		// sum 합이다 = 모든 날짜의 합 0 인 이유는 아직 날짜를 안 더햇으니까
		int sum = 0;

		
		
		for (int i = 1; i < year; i++) {	
			// 처음 년도 부터 입력한 년도 전 까지 반복을 한다.
			
			for (int j = 1; j <= 12; j++) {
				// 1 월 부터 12 월까지 무언가를 반복반다.
				
				// 입력한 년도 전년 마지막월 까지 
				sum += getDates(i, j);

			}
		}
		
		// 입력한 전년도 12월 31일까지의 날짜를 더한다.

		// 입력한년도 , 달의 한달전까지의 날짜를 더함 
		for (int k = 1; k < month; k++) {
			sum += getDates(year, k);
		}

		
		// 입려한 년도 달의 날까지를 더함
		sum = sum + day;

		
		// 7로 나눠서 나머지에 따라 요일이 나온다.
		System.out.printf("%d 년 %d 월 %d 일은 %s 입니다", year , month , day , dayCharacter( sum %7));
	}
}




