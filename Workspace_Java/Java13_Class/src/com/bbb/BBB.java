package com.bbb;

import com.aaa.AAA;

	// super :  부모 ( 상속 )

public class BBB extends AAA {
	
	private int bcd;
	
	public BBB() {
		// 부모의 기본 생성자 호출됨 super(); 가 생략됨
		System.out.println("BBB 생성");
	}
	
	 public BBB(int abc) {
		 super(abc);	 // 부모 생성자  pulbic AAA (int abc)를 호출
		 bcd = 10;
		 System.out.println("BBB 생성 -> abc : " + abc );
	 }
	 
	 public BBB (int abc , int bcd) {
		 super(abc);
		 this.bcd = bcd;
		 System.out.printf(" BBB 생성 -> abc : %d  bcd : %d\n",abc,bcd);
	 }
	 
	 public int getBcd() {
		 return bcd;
	 }
	 
	 public void setBcd(int bcd) {
		 this.bcd = bcd;
	 }
	 
	 public int getSum() {
		 int sum = super.getAbc() + this.getBcd();
		 
		 return sum;
	}
	 
	 @Override	// 동일 메소드 재정의
	 public void prn() {
		 System.out.println("BBB.prn()");
	 }
}
