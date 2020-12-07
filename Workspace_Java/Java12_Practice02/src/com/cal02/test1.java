package com.cal02;

import java.util.Calendar;

public class test1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2020, 11, 1);
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR);
		int month = cal.get(Calendar.DAY_OF_MONTH);
		int date = cal.get(Calendar.DATE);
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		int day_of_week_Month = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println(day_of_year);	// 설정한 값까지의 날
		System.out.println(month);			// 입력한 달에서의 날
		System.out.println(date);				//  날짜
		System.out.println(day_of_week); 	// 요일
		System.out.println(day_of_week_Month);		// 몇번째 주
		
	}
}
