package com.ssafy.java.day04.clazz03;
/*
 * Encapsulation : 은닉성, 캡슐화, 
 * 
 *  - 중요하거나 상세 구현 정보를 숨긴다. (private)
 *  
 * 
 */
public class Test05 {
	public static void main(String[] args) {
		Singer s1 = new Singer();
//		s1.name ="양준일";
//		s1.age = 22;
		s1.setAge(-22);
		s1.setName("양준일");
		
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
	}
}
