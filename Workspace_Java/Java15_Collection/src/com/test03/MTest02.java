package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.score.Score;

public class MTest02 {

	public static void main(String[] args) {
		// Score 객체 3개 만들자
		// 이름은 홍길동 이순신니 김선달 점수는 알아서
		Score s1 = new Score();
		s1.setName("홍길동");
		s1.setKor(50);
		s1.setEng(20);
		s1.setMath(100);
		
		Score s2 = new Score("김선달",15,31,55);
		Score s3 = new Score("이순신", 100, 100, 100);
		
		// score 객체를 관리할 수 있는 set 객체를 만들자
		// set tpye/ 에 hashset으로 만들자
		
		Set<Score> set = new HashSet<Score>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(new Score("머쉬베",100,100,100));
		
		//printCollection(set);
		transElement(set,"홍길동",10);
	}
	
	public static void transElement(Set<Score> set, String target, int kor) {
		// set 에서 홍길동 을 찾아서 국어점수를 10점으로 바꾸고 전체 출력
		// 찾을때 iterator 를 사용하자
		Iterator<Score> itr = set.iterator();
		while (itr.hasNext()) {
			/*
			if (itr.next().getName() == target) {
				itr.next().setKor(kor);
			}
			*/
			
			Score temp = itr.next();
			if (temp.getName().equals(target)) { // == 이 매우 위험하다.
				temp.setKor(kor);
			}
		}
		// 출력
		Iterator<Score> ir = set.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
	}

	public static void printCollection(Set<Score> set) {
		// 1. foreach 문을 통한 출력
		for(Score sc : set) {
			System.out.println(sc);
		}
		System.out.println("---------------");
		
		//2. Object 배열 출력 -> 부모클래스를 형 변환 시켜서 출력시킴
		Object[] oArr = set.toArray();	// Set 이란 객체를 오브젝트로 변경
		for(int i = 0; i<oArr.length;i++) {
			//System.out.println(oArr[i]);
			//System.out.println(oArr[i].getName()); Object type 이라 불가능
			System.out.println(((Score)oArr[i]).getName() + "\t" + ((Score)oArr[i]).getAvg());
		}
		System.out.println("---------------");
		//3. Iterator : 컬렉션 저장 요소를 읽어오는 표준화된 방법 list 와 set 에 있는 값을 표준적인 방법으로 꺼낼수 잇음
		// 
		// set 에 있는 것을 순서대로 배치 
		//iterator 에 있는 cursor ,, next 를 통해 하나씩 넘기면서 출력 
		Iterator<Score> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
