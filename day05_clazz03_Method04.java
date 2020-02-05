package com.ssafy.java.day04.clazz03;

public class Method04 {
	public void print() {
		this.print(1, 100);
//		for (int i = 1; i < 101; i++) {
//			System.out.println(i);
//		}
	}

	public void print(int num) {
		this.print(1, num);
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
	}

	public void print(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
}
