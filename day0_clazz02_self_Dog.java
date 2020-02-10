package com.ssafy.java.day04.clazz02.self;

// 외부 클래스
public class Dog {
	private String name;
	private int age;

	Dog() {
		this("이름모름", 0);
//		this.name = "이름모름";
//		this.age = 0;
	}

	Dog(String name) {
		this(name, 0);
//		this.name = name;
//		this.age = 0;
	}

	Dog(int age) {
		this("이름모름", age);
//		this.name = "이름모름";
//		this.age = age;
	}

	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println(String.format("강아지의 이름은 %s이고 나이는 %d입니다.", name, age));
		//System.out.printf("강아지의 이름은 %s이고 나이는 %d입니다.", name, age);
	}
}
