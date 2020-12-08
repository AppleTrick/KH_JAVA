package com.bbb;

import com.aaa.AAA;

public class MTest {
	
	public static void main(String[] args) {
		
		// type 변수 = new 생성자();
		AAA myA = new AAA();
		myA.prn();
		System.out.println("abc  :  "  + myA.getAbc());
		
		System.out.println("");
		AAA paramA= new AAA(10);
		paramA.prn();
		
		System.out.println("abc  :  "  + paramA.getAbc());
		
		paramA.setAbc(100);
		System.out.println("abc  :  "  + paramA.getAbc());
		System.out.println("-----------------------------------");
		BBB b1 = new BBB();
		b1.setAbc(10); // 부모클래스에서 상속받은 setAbc 사용
		b1.setBcd(12);
		System.out.println(b1.getSum());
		
		
		System.out.println("========");
		BBB b2 = new BBB(15);
		System.out.println(b2.getSum());
		
		System.out.println("========");
		BBB b3 = new BBB(20,50);
		System.out.println(b3.getSum());
		
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();			// 부모타입으로 자식 타입 객체를 받음
	// BBB a3 = new AAA();  자식타입으로 부모 객체 못받음
		System.out.println("=========");
		a1.prn();
		a2.prn();	//a2 AAA 타입인데 실제로는 BBB 메소드가 나오게 된다.
		// 타입은 AAA 인데 실제 들어간 값은 BBB
		//부모의 메소드를 통해 자식메소드가호출된다
		
	// a2.getbcd(); -> 불가능
		((BBB)a2).getBcd(); // 자식타입으로 형변환 시켜서 사용한다.
		
		

		
		
	}

}

/*
 *  < 생성자 >
 *  1. 클래스 이름과 동일하되 리턴 타입은 없고,  객체 생성시 접근 제한자는 public 
 *  class Test{
 * 	// 기본 생성자 
 * 	public Test(){
 * 
 * 	}
 * }
 * 
 *  2. 생성자는 객체 생성을 하는 new 키워드와 함께 사용되면, 생성시 단 한번만 자동 호출 된다.
 *		// type 변수 = new 생성자 ();
 *		Test t1 = new Test();
 *
 *
 *  3.메서드 처럼 객체 및 클래스 명으로 호출될 수 없다.
 *  t1.Test(); -> 에러
 *  
 *    4. overload 할 수 있다.
 *    class Test{
 *    		public Test(){}
 *    		public Test(){int a}
 *    		public Test(){ int a, int b}
 *    }
 *    
 *    5. 생성자를 명시하지 않으면 기본 생성자가 제공되어 멤버변수(파라미터) 를 초기화 하고
 *    명시된 생성자를 선언하게 되면 명시 생성자만 호출되고 기본 생성자는 제공 되지 않는다.
 *    
 *    class AAA {} // new AAA()
 *    class BBB {
 *   			public BBB(){}	// new BBB()
 *   } 
 *   
 *   class CCC{
 *   	public CCC (int a) {}		// new CCC(); X -> new CCC(10);
 *   }
 *   
 * 	6. 생성자는 상속되지 않는다
 * 
 * 	7. 생성자는 내부 호출 할 수 있으며, 키워드는 this() 로 사용된다.
 * 
 * 	8. 생성자의 목적은 객체 생성 및 필드 초기화에 있다.
 * 
 * 	검사하지 않는 숙제 : 왜 private로 변수를 선언하고 getter setter 를 사용하는가?
 *
 * 
*/