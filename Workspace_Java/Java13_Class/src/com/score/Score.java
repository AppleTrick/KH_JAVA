package com.score;

public class Score {
	// field
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//constructor
	// 객체 생성 필드 초기화
	public Score() {
		
	}
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
	}
	
	// getter , settter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	//getSum , getAvg, getGrade,
	public int getSum() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return (double)(kor+eng+math)/3;
	}
	
	public String getGrade() {
		String grade = null;
		// 100 90 : a
		/* 89 80 : b
		 * 79 70 : c
		 * 69 60 : d
		 * 59  0  : f
		 * 
		 */
		if (getAvg() >= 90) {
			grade = "A";
		} else if(getAvg() < 90 &&  getAvg() >= 80) {
			grade = "B";
		}else if(getAvg() < 80 &&  getAvg() >= 70) {
			grade = "C";
		}else if(getAvg() < 70 &&  getAvg() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		
		return grade;
	}
	
	@Override
	public String toString() {
		
		return "이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math +
				"\n총점 : " + getSum() + " 평균 : " + getAvg() + " 등급  : " + getGrade();
						
	}
}
















