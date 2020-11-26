package com.test01;

/**
 * JavaDoc Test <br>
 * Hello, World! 를 출력하는 클래스 class<br><br>
 * 
 * javadoc 만드는 방법 <br>
 * project 우클릭 - export - javadoc - %JAVA_HOME%\bin\javadoc.exe<br>
 * VM 옵션에
 * -locale ko_KR - encoding UTF-8 charset UTF-8 -docencoding UTF-8
 * 추가!
 * 
 * @author arran
 *
 */
public class Type01 {
	public static void main(String[] args) {
		// 주석 : 사람을 위한 설명
		
		/*
		 * 
		 * 여러줄 주석쓸때 사용
		 * 
		 * compile 시 주석은 제거 됨
		 * 
		 */
		
		System.out.println("Hello World");
	}
}
