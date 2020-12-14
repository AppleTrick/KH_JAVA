package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest01 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for (int i = 111; i < 116; i++) {
			// map.put(k,v)
			map.put(i, i+"abc");
		}
		System.out.println(map);
		map.put(111, "115abc");
		System.out.println(map);
		
		// key 값을 통해 값에 접근이 가능하다. 순서가 없다. 
		// ( 키는 중복 되지 않는다. Value 는 중복 가능하다.)
		
		prn(map);
	}
	
	public static void prn (Map<Integer, String> map) {
		Collection<String> values = map.values();	// values 값만 따로 가지고 온다.
		System.out.println(values);
		
		Set<Integer> keys = map.keySet();			// key 값만 따로 가지고 온다.
		System.out.println(keys);
		//Entry <K,V> 라는 객체들을 Set으로 관리하겟음
		//Map 은 k를 통해서 v를 가지고 올수 있음 (map.get(k) -> value)
		//Entry 는 k 와 v 를 각각 가지고 올 수 있음 (entry.getKey(),entry.getValue())
		
		// Entry : Key 와 Value 를 같이 관리
		Set<Map.Entry<Integer, String>> entrySet =map.entrySet();
		
		for (Entry<Integer , String> entry : entrySet) {
			System.out.printf("%d : %s\n" , entry.getKey(),entry.getValue());
		}
	}
}
