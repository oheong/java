package com.ssafy.java.day01_01static;

class Sub03 {
	int i = 100;
	static int k = 100;

	// static block은 class정보가 로딩되는 시점에 한번만 수행
	static {
		k = 200;
		System.out.println(1);
	}

	// 생성자 : 객체가 생성될 때 마다
	Sub03() {
		System.out.println(2);
	}

	// instance block : 객체가 생성될 때 마다, 생성자 호출 이전에 실행
	{
		System.out.println(3);
	}
}

public class Test03 {
	public static void main(String[] args) {
		System.out.println("main start");
//		Sub03 s = new Sub03();
//		Sub03 s2 = new Sub03();
		/*
		 * 결과 
		 * main start 
		 * 1 				// class정보가 로딩되는 시점에 한번만 수행
		 * 3 				// instance block 객체 생성될 때마다, 생성자 호출 이전에 실행
		 * 2 				// 생성자 실행
		 * 3 
		 * 2 
		 * main end
		 */
		
		System.out.println(Sub03.k); //★☆Sub03의 k를 사용하겠다는것임. 이때 Sub03이란 정보가 메모리에 올라가있어야하기때문에 1, 200 ~~순서로 찍힘//☆★
		Sub03 s = null; // class를 사용하겠다는것이 아니라, Sub03의 정보들 이 이름으로 쓰겠다는것을 말 하는것임
		System.out.println(4);
		s = new Sub03(); // class 실 사용
		System.out.println(5);
		Sub03 s2 = new Sub03();
		
		System.out.println("main end");
	}

}
