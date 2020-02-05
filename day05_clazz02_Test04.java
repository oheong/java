/**
 * 목표
 * 
 * this의 활용
 * 실행중인 객체의 필드 : this.필드명
 * 실행중인 객체의 메서드 호출 : this.메서드()
 * 실행중인 객체의 다른 생성자 호출 : this([매개변수값, ..])
 * 
 * ***실행중인 객체의 다른 생성자 호출시 주의점 ***
 * 1. 생성자를 호출하는 위치는 생성자내에서만 가능하다.
 * 2. 생성자내에서 첫번째 실행구문이 되어야 한다.
 */
package com.ssafy.java.day04.clazz02;

public class Test04 {
	public static void main(String[] args) {
		Member04 m1 = new Member04();
		//		스택			힙
		System.out.println("이름 : " + m1.getName());  // 여기서 실행되는 메서드안에서의 this는 m1
		System.out.println("나이 : " + m1.getAge());

		Member04 m2 = new Member04("김혜원");
		System.out.println("이름 : " + m2.getName());  // 여기서 실행되는 메서드안에서의 this는 m2
		System.out.println("나이 : " + m2.getAge());
		
		Member04 m3 = new Member04("노가리", 22);
		System.out.println("이름 : " + m3.getName());  // 여기서 실행되는 메서드안에서의 this는 m3
		System.out.println("나이 : " + m3.getAge());
	}
}












