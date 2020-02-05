package com.ssafy.java.day04.clazz03;

// 오버로딩 : 메소드의 이름은 같지만 파라미터가 다름
class KiKi{
	void call() {
		System.out.println("성공");
	}
}
public class Method01 {
	void m01() {
		System.out.println("m01");
	}
	void m01(int num, char ch) {
		System.out.println(num + " " + ch);
	}
	void m01(double d) {
		System.out.println(d);
	}
	void m01(boolean flag) {
		System.out.println(4);
	}
	void m02(int[] a) {
		System.out.println(5);
	}
	void m03(String[] s) {
		System.out.println(6);
	}
	void m04(KiKi kiki) {
		kiki.call(); // 결과 : 성공이 출력
	}
}