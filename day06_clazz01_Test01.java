package com.ssafy.java.day06.clazz01;

import java.util.ArrayList;

class Person /*extends java.lang.Objedct*/{
	int age;
	String name;

	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "name : " + name + ", age : " + age;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj)	return true;
		if(obj instanceof Person) {
			Person other = (Person)obj; // 명시적 형변환
			// 묵시적 : 부모가 자식 받을 때
			// 명시적 : 자식이 부모를 받을 때
			if(this.name.equals(other.name) && this.age == other.age) {
				return true;
			}
			else return false;
		}
		else return false;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Person p1 = new Person(11,"홍");
		Person p2 = new Person(12,"홍");
		
		Person p3 = null;
		
		// p1 객체에 equals 메소드가 존재하지 않으면 Object.equals 메소드를 호출
		// 객체의 내용 비교가 아닌 주소 비교를 하게 된다.
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals("aa"));
		
//		String s1 = new String ("hello");
//		String s2 = new String ("hello");
//		System.out.println(s1.equals(s2));
		
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		
//		s1.indexOf("e");
		System.out.println(list.indexOf(p1)); // equals 작업을 한다.
		System.out.println(list.indexOf(p2)); // 몇번째 인덱스에 있노?
	}
}
