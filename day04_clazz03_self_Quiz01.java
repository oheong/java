package com.ssafy.java.day04.clazz03.self;

class Sub01 {
	public int cal(Info info) {
		return info.num1 + info.num2 + info.num3;
	}
}

class Info {
	int num1;
	int num2;
	int num3;
}

public class Quiz01 {
	public static void main(String[] args) {
		Sub01 s = new Sub01();

		Info info = new Info();
		info.num1 = 1000;
		info.num2 = 2000;
		info.num3 = 3000;

		System.out.println(s.cal(info));
	}
}
