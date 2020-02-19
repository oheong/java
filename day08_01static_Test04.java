package com.ssafy.java.day01_01static;

import java.util.Random;

/*
 *  final 
 *  
 *  내가마지막이야!!!!!!!
 *  
 *  - 변수 : 상수 적용
 *  - 메소드 : 오버라이딩 금지
 *  - 클래스 : 상속 금지
 */

/*final : 상속 금지*/ class Parent {
	public /* final : 오버라이딩 금지 */ void call() {

	}

	public void print() {

	}
}

class Child extends Parent {
	public void call() {

	}
}

class Sub04 {
	final int i;

	Sub04() {
		i = 89; // final 멤버변수를 선언만 해 놓고 값지정을 안해줬을때에는 생성자에서 지정해줘야함
	}

	public void call() {
		final int k;
		k = 100;
		System.out.println(k);
	}
}

//class MyString extends String{ // String은 final class임
class MyRandom extends Random { // API class도 상속할 수 있다!
	public int nextint(int num) {
		return super.nextInt(num) + 1;
	}
}

public class Test04 {
	public static void main(String[] args) {
		/* final 값의 할당은 한번만 */ int i = 100;
		i = 120;

//		Random r = new Random();
		Random r = new MyRandom();
//		int num = r.nextInt(45) + 1;
		int num = r.nextInt(45);
	}
}
