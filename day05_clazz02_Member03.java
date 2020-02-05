/**
 *   
 *   필드(멤버변수)
 *   생성자
 *   일반메서드
 *   메인메서드
 *   
 */
package com.ssafy.java.day04.clazz02;

public class Member03 {
	private String name;
	private int age;
	
	Member03() {
		// 이 생성자로 생성하게되면
		// name은 null
		// age는 0으로 초기화됨
	}
	Member03(String name, int age) {
		// Member03() + setName + segAge
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}