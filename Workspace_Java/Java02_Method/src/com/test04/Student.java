package com.test04;

public class Student {
	public static void main(String[] args) {
		int kor, eng, math = 0;
		
		kor = 100;
		eng = 40;
		math = 78;
		
		int sum = 0;
		double  avg = 0;
		
		sum = getSum(kor, eng, math);
		avg = getAvg(sum);
		
		System.out.println(sum);
		System.out.printf("%.2f",avg);
		
		/*
		 * 1. 과목 파라미터 세개를 넣어주면 총점을 리턴하는 getSum 이라는 메서드를 만들자
		 * 2. 총 합 파라미터 한 개를 가진 getAvg  라는 이름의 메서드를 만드는데, 리턴은 평균을 리턴한다.
		 * 3. main 메서드에서 위의 메서드를 호출하여 각각 sum 변수 와 avg 변수에 리턴되는 값을 담고 해당 변수들을 출력하자.
		 * 
		 * 
		 * + 평균은 소수점 둘째짜리 까지만 출력하자
		 */
		}
	public static int getSum(int i, int j, int y) {
		int sum = i + j + y;
		return sum;
	}
	public static double getAvg(int sum) {
		double result = (double)sum/3;
		return result;
		
	}
}
