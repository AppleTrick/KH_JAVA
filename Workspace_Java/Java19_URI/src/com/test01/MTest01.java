package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		
		URI u = new URI ("http://localhost:8787/Java19_URI_Web/res.jsp?name=%EB%B0%95%EC%B0%BD%ED%9D%AC&addr=%EC%86%A1%ED%8C%8C%EA%B5%AC");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());		// 호스트
		System.out.println(u.getPort());		// 접속하는 곳
		System.out.println(u.getPath());		// 만들어놓은 웹 어플리케이션 위치
		System.out.println(u.getQuery());		// query 내용
	}
}
