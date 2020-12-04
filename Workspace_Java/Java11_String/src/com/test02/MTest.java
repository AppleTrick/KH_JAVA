package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		
		//sTest();
		
		String tt = new String("안녕하세요");
		tt.replace("안", "냥");
		System.out.println(tt);
		System.out.println("==============================");
		sBufferTest();
	}
	// string 을 + 연산으로 연결할 때 내부적으로 StringBuilder 로  더해준다 jdk 1.5
	
	public static void sTest() {
		String s = "안녕하세요. ";
		System.out.println(s.hashCode()); 
		s += "저는";		// 주소값이 바뀌게 됨
		System.out.println(s.hashCode()); 
		s += "~~~ 입니다.";		//해쉬코드 값이 또 바뀌게됨
		
		System.out.println(s);
		System.out.println(s.hashCode()); 
		// 해당 객체를 관리하기 위해서 문자열이 만든 코드
		//	해당 주소를 반환함
		
		// 안녕하세요 -> 하이로 바꿔서 출력;
		
		System.out.println(s.replace("안녕하세요", "하이!"));
		System.out.println(s);
		
		s=s.replace("안녕하세요", "하이!");
		System.out.println(s.hashCode());
		
	}
	
	public static void sBufferTest() {
		// mutable
		
		StringBuffer sb = new StringBuffer();
		sb.append("안녕하세요").append(" 저는 ") .append("  ~~~~~ 입니다.");					// return 타입이 스트링 버퍼
		
		System.out.println(sb.hashCode());		// 주소값이 변하지 않는다.
		System.out.println(sb);
		
		sb.replace(0, 5, "하이");		// 메모리 안에 객체를 만들엇기에 값은 변하지 않는다.
		System.out.println(sb);
		
		// 거꾸로 출력
		sb.reverse();
		System.out.println(sb);
	}
}
