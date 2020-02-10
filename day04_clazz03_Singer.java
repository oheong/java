package com.ssafy.java.day04.clazz03;

public class Singer {
	private String name;
	private int age;

	// setter (세터 메소드)
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("잘못된 라인");
			return;
		}
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// getter (게터 메소드)
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
