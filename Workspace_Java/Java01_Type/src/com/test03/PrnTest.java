package com.test03;

public class PrnTest {
	/*
	*System.out.println("");
	*
	*System.out.print("");
	*
	*System.out.printf();
	*/
	public static void main(String[] args) {
		int i = 100;
		
		System.out.print("1. i : \\" +  i + "\n");
		System.out.println("2. i : \t" + i);
		System.out.printf("3. i : %10d \n",i);
		
		System.out.println("------------------");
		
		// 시험 점수 결과는 100점 이고, 학점은 'A' 가 나왔다.
		// 나의 오늘 감정지수는 90.50(d)% 이다.
		int su = 100;						//10자리
		char ch = 'A';						//5자리
		double d = 90.50d;				// 5자리 (소수점 2자리)
		// 		System.out.printf(); 사용
		
		System.out.printf("시험 점수 결과는 %10d점 이고, 학점은 \'%5c\' 가 나왔다. \n 나의 오늘 감정지수는 %5.2f%% 이다\n",su,ch,d);
		int age = 25;
		String name = "박창희";
		System.out.printf("오늘은 11\\24 입니다. 제 나이는 %d 입니다. 제 이름은 %s 입니다.",age,name);
		
	
	}
}
