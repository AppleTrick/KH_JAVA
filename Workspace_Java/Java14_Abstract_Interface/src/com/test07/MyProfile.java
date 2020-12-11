package com.test07;

public class MyProfile extends Profile implements Display, Job {
	
	private String loc;

	public MyProfile(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jobLoc(String loc) {
		// TODO Auto-generated method stub
		this.loc = loc;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("주소 : " + loc);
		System.out.println("직종 : " + JOB_ID);
	}

}
