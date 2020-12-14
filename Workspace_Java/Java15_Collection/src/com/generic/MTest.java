package com.generic;

public class MTest {
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setEmpno(111);
		emp.setEname("홍길동");
		
		System.out.println(emp.getEname() + ":" + emp.getEmpno());
		
		Emp emp2 = new Emp("112a","김선달");
		System.out.println(emp2.getEname() + ":" + emp2.getEmpno());
		
		Emp<String> emp3 = new Emp<String>("113a","이순신");
		System.out.println(emp3.getEname() + ":" + emp3.getEmpno());
		
		
		// Integer 타입을 강제 했기 때문에 "114" String 값으로는 입력이 불가능하다
		Emp<Integer> emp4 = new Emp<Integer>(114,"킹세종");
		System.out.println(emp4.getEname() + ":" + emp4.getEmpno());
	}
}
