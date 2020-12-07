package com.cal02;

import java.util.Calendar;
import java.util.Scanner;

// 달력 만들기
// java.utill.Calendar 사용해서 만들기
//Calendar rightNow = Calendar.getInstance(); 싱글톤 패턴
public class CalendarUseApi {

	public void prn(int year, int month) {

		// Calendar 객체 생성
		// Calendar cal = new Calendar(); x -> singleton'

		Calendar cal = Calendar.getInstance();

		// 달력 윗부분 생성
		System.out.printf("\t \t %d 년 %d 월 \n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// Sets the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH.
		// DAY_OF_MONTH. :///////   Field number for get and set indicating the day of the month.
		
		// month -1 : Calendar 는 0 부터 시작
		cal.set(year, month - 1, 1);
		
		// parameter
		// year - the value used to set the YEAR calendar field.
		// month - the value used to set the MONTH calendar field. Month value is 0-based. e.g., 0 for January.
		// date - the value used to set the DAY_OF_MONTH calendar field.
		
		// 일요일 : 1 월요일 : 2 ...... 토요일 : 7
		//DAY_OF_WEEK : Field number for get and set indicating the day of the week.
		int start = cal.get(Calendar.DAY_OF_WEEK);
		// 요일 만큼 탭을 한다.
		
		// 일요일 : 1 , 월요일 : 2 , .... , 토요일 : 7

		for (int i = 1; i < start; i++) {
			System.out.print("\t");
		}
		
		// Returns the maximum value that the specified calendar field could have, given the time value of this Calendar
		for (int i = 1	; i <= cal.getActualMaximum(Calendar.DATE) ; i++) {
			System.out.printf("%d\t",i);
			if (start %7  == 0) {
				System.out.println();
			}
			start ++;
		}
	}

}
