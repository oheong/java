package com.ssafy.java.day01_01static;

/*
 * static : 정적인 특성 부여
 * 
 * - 클래스가 로딩되는 시점에 결정됨
 * - 객체 생성없이 클래스로만 접근
 *   Class.필드명, Class.메소드명
 *   
 * - static block : 클래스가 로딩될 때 한번만 수행
 * - instance block : 객체가 생성될 때 마다 수행, 생성자보다 먼저 수행, 각 생성자에서 공용으로 처리하는 작업을 할 수 있다.
 * 
 * static 붙은거 	: Class변수
 * static X		: instance변수
 * 
 * 
 */
class Ticket {
	int price; // instance variable, field
	// t객체에는 price정보만 있음 (static X)
	static int totCnt = 10; // class variable
	// 이 변수는 class Area에 있음
	
	static void call() {} // class method
}

public class Test01 {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		// System.out.println(t.totCnt); // X
		System.out.println(Ticket.totCnt); // O => static 붙은 클래스변수라 클래스명.변수명 이렇게 해 줘야함
		Ticket.call();
	}
}
