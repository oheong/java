package com.ssafy.java.day05.clazz01;

public class Dog /* extends java.lang.Object */{
	private String name;
	private int age;
	public Dog() {
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 게터와 세터
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
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	} 
	
	// 오버로딩
//	/* defalut */ String toString(int i){
//		return String.format("%s, %d", name, age);
//	}
	//오버라이딩
//	public String toString() {
//		return String.format("%s, %d", name, age);
//	}
	
}
