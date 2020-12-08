package com.test01;

public class MTest {
	public static void main(String[] args) {
		
		AA a = new AA();
		Super s = a; // Super s = new AA();	// Super s 에다가 a 가 가진 new AA() 한 " instance" 의 주소 값 대입

		
		//BB b = (BB) s; -> 오류 발생				// s 에 담긴 AA instance 를 BB로 형변환
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		
		// 두개의 해쉬코드 값이 같다는 같은 객체이다?
	}
}
