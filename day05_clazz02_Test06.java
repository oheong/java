package com.ssafy.java.day04.clazz03;

/*
 * Variable LifeCycle(교재제공)
 *  - member variable
 *   1. calss 내에서 정의되는 variable이다
 *   
 * 
 */
public class Test06 {
	int m1 = 100;
	static int m2 = 100;

	public void call() {
		int m1 = 200;
		System.out.println(m1); // 200
		System.out.println(this.m1); // 100
		System.out.println(m2);
	}

	public static void main(String[] args) {
		int i = 100; // 로컬변수
		System.out.println(i);
		int k; // 지역변수라 값 초기화가 발생하지 않음.
		if (i == 100)
			k = i;
		else
			k = 1;
		System.out.println(k);
	}
}
