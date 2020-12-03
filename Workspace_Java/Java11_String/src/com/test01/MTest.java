package com.test01;

public class MTest {
	
	private static String str = "The String class represents character strings.";
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		System.out.println(s + 1 + 2);	// Hello12
		System.out.println(1 + 2 + s);	// 3Hello
		System.out.println(s);					//Imutable 속성에 의해
		
		String h = "Hello";
		System.out.println(h);
		
		
		System.out.println(h==s);
		
		String newS = new String("Hello");
		System.out.println(newS);
		
		System.out.println(s == newS);
		
		System.out.println("----------------------");
		
		//1. str 의 길이 출력
		test01();
		
		//2. str 전체 대문자 출력
		test02();
		
		//3. str 전체 소문자 출력
		test03();
		
		//4. str 에서 첫번째로 나오는 c의 위치(인덱스)
		test04();
		
		//5. class 단어를 찾아서 java 로 바꿔서 출력
		test05();
		
		//6 . character 단어를 찾아서 대문자로 변환후 전체 출력
		test06();
		
		//7. str을 char[] 로 출력하되 , 'c' 만 출력하자
		//그리고 c  의 갯수를 출력
		test07();
		
		//8 str 을 char[] 로 출력하되, 대문자만 출력하자
		// 그리고 대문자의 갯수를 출력
		test08();
		
		//9 str 사이의 공백을 제거후 출력
		test09();
		
		// 10. 전체를 역순으로 출력
		test10();
	}

	private static void test10() {
		// TODO Auto-generated method stub
		// 10. 전체를 역순으로 출력
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.printf("%c",str.charAt(i));
		}
		System.out.println();
		
		int arrIndex = 0;
		
		char [] ch = new char[str.length()];
		for (int i = str.length()-1; i >= 0; i--) {
			ch[i] = str.charAt(arrIndex);
			arrIndex++;
		}
		System.out.println(ch);
	}

	private static void test09() {
		// TODO Auto-generated method stub
		//9 str 사이의 공백을 제거후 출력
		System.out.println(str.replaceAll(" " ,""));
		
		//trim 사용
		System.out.println(str.trim());
		// 문자열의 앞이나 뒤에있는것을 없애준다.
		// 중간의 공백은 남게 된다.
		
		System.out.println(str.replace(" " ,""));
		System.out.println(str.replaceAll(" " ,""));
		// replace all  regex => 정규식%s*g$ 사용가능
		// regular express
	}

	private static void test08() {
		// TODO Auto-generated method stub
		//8 str 을 char[] 로 출력하되, 대문자만 출력하자
		// 그리고 대문자의 갯수를 출력
//		int count = 0;	
//		String filter = new String(str.replaceAll(" ", ""));
//		Character[] ch = new Character[filter.length()];
//		for (int i = 0; i < filter.length(); i++) {
//			ch[i] = filter.charAt(i);
//			if (ch[i].equals(Character.toUpperCase(ch[i]))) {
//				System.out.printf("%c",ch[i]);
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("대문자의 갯수 는 " + count);
		

		char[] ch1 = str.toCharArray();
		int count = 0;
		
		for (int i = 0; i < ch1.length; i++) {
			// ch1[i] -> char - > isUpperCase();
			if (Character.isUpperCase(ch1[i])) {
				System.out.printf("%c ",ch1[i]);
				count ++;
			}
		}
		System.out.println();
		System.out.println("대문자의 의 갯수 는 " + count);
	}

	private static void test07() {
		// TODO Auto-generated method stub
		//7. str을 char[] 로 출력하되 , 'c' 만 출력하자
		//그리고 c  의 갯수를 출력
		//char at
//		int count = 0;
//		char[] ch = new char[str.length()];
//		for (int i = 0; i < str.length(); i++) {
//			ch[i] = str.charAt(i);
//		}
//		
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i]=='c') {
//				System.out.printf("%c",ch[i]);
//				count ++;
//			}
//		}
//		System.out.println();
//		
//		System.out.println("c 의 갯수 는 " + count);
		
		char[] ch1 = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch1.length; i++) {
//			System.out.printf("%c",ch1[i]);
			if (ch1[i] == 'c' || ch1[i] == 'C') {
				System.out.printf("%c ",ch1[i]);
				count ++;
			}
		}
		System.out.println();
		System.out.println("c 의 갯수 는 " + count);
	}

	private static void test06() {
		// TODO Auto-generated method stub
		//6 . character 단어를 찾아서 대문자로 변환후 전체 출력
		//System.out.println(str.replaceAll("character", "character".toUpperCase()));
		
		// character 찾아서
		String target= "character";
		int start = str.indexOf(target);
		int end = start + target.length();
		
		String upper = str.substring(start , end);
		// 대문자 변환
		upper = upper.toUpperCase();	// 대입하지 않으면 바꾸지 않는 값이 그대로 있게된다.
		
		// 전체 출력
		System.out.println(str.replace(target, upper));
	}

	private static void test05() {
		// TODO Auto-generated method stub
		//5. class 단어를 찾아서 java 로 바꿔서 출력
		System.out.println(str.replace("class", "java"));
	}

	private static void test04() {
		// TODO Auto-generated method stub
		//4. str 에서 첫번째로 나오는 c의 위치(인덱스)
		System.out.println(str.indexOf('c'));
	}

	private static void test03() {
		// TODO Auto-generated method stub
		//3. str 전체 소문자 출력
		System.out.println(str.toLowerCase());
	}

	private static void test02() {
		// TODO Auto-generated method stub
		//2. str 전체 대문자 출력
		System.out.println(str.toUpperCase());
	}

	private static void test01() {
		// TODO Auto-generated method stub
		//1. str 의 길이 출력
		System.out.println(str.length());
	}
}
