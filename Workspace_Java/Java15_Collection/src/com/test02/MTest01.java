package com.test02;

import java.util.ArrayList;
import java.util.List;

public class MTest01 {
	public static void main(String[] args) {
		// List 순서가 존재 중복도 존재 가능하다.
		
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("김선달");
		list.add("민호");
		list.add("피오");
		list.add("이수근");
		list.add("이수근");	
		
		prn(list);
		transElement(list);
	}

	private static void transElement(List<String> list) {
		// TODO Auto-generated method stub
		// 1. 홍길동의 인덱스를 찾아서 해당 인덱스 값을 김길동으로 바꾸자
		list.set(list.indexOf("홍길동"), "김길동");
		prn(list);
		
		//2 . ~ 신으로 끝나는 객체를 찾아서 만일 있으면 ~ 자로 바꾸자
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).endsWith("신")) {
				list.set(i,list.get(i).replace("신","자"));
			}
		}
		prn(list);
		
		// 3. 끝 글자가 호인 이름을 찾아서 삭제하자.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).endsWith("호")) {
				list.remove(i);
			}
		}
		
	}

	private static void prn(List<String> list) {
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
	}
}
