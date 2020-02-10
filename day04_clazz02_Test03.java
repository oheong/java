/**
 * 목표
 * 
 * 생성자의 역할
 * - 초기에 객체에 필요한 메모리를 만든다.
 * - 초기화 작업 진행(멤버변수의 값 설정, ..)
 */
package com.ssafy.java.day04.clazz02;

public class Test03 {
	public static void main(String[] args) {
		// 100을 변수에 담아야 한다.  어떻게 담을 것인가??
		// 아래의 두가지 상황을 판단해 보자
		int i;
		i = 100;
		
		int j = 100;
		
		Member03 m1 = new Member03();
		m1.setName("김연수");
		m1.setAge(33);
		System.out.println(m1.getName() + ":" + m1.getAge());
		
		Member03 m2 = new Member03("김연수", 33);
		System.out.println(m2.getName() + ":" + m2.getAge());
	}
}











