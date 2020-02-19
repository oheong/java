package com.ssafy.java.day01_01static;

public class Test02 {
	static int data = 100;
	String msg;

	void call() {
		// non-static에서는 static을 볼 수 있다.
		System.out.println(msg);
		System.out.println(data);
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		System.out.println(t.msg); // non-static 변수를 사용하기위해서는 객체를 생성하고 사용해야함.

		// static area에서는 non-static을 볼 수 없다.

		/*
		 * System.out.println(msg); 
		 * call();
		 */
		System.out.println(data);
	}
}
