package com.compare;
import java.util.HashSet;
import java.util.Set;

public class MTest03 {

	
	// Set : 순서 x ,  중복 x
	public static void main(String[] args) {
		Set<String> set =new HashSet<String>();	// Hashset : hashtable 기준으로 정렬을 한다.
		
		// list 는 내가 넣어준 순서대로 됨
		// set 은 주머니 같은느낌 -> 절대 정렬 안됨
		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("4");
		set.add("6");
		set.add("7");
		set.add("8");
		set.add("10");
		set.add("3");
		// set.add(null); // <- null 때문에 java.lang.NullPointerException 오류 발생함
		// null 값은 저장은 가능하나 사용하면 NullPointException 발생하게 됨
		
		for (String string : set) {
			System.out.print(string + " ");
		}
		System.out.println(); 
		
		findElement(set,"3");
		deleteElement(set,"3");
		
	}
	public static void deleteElement(Set<String> set, String delete) {
		// list 와 set 의 차이 list는 중복이 가능하기 때문에 뒤에 있는 것도 삭제해야된다.
		for (String string : set) {
			if (string.equals(delete)) {
				set.remove(string);
				System.out.println(delete + " 지웠다");	//java.util.ConcurrentModificationException
				break;
			}
		}
		System.out.println(set);
	}

	public static void findElement(Set<String> set, String find) {
		// TODO Auto-generated method stub
		// set은 순서의 개념이 없기 때문에 사용할 수 가 없다
//		for (int i = 0; i < set.size(); i++) {
//			
//		}
		
		for (String s : set) {
			if (s.equals(find)) {
				System.out.println(find + "찾았다.");
			}
		}
		// java.lang.NullPointerException <- 앞으로 가장 많이보게될 에러
	}
}
