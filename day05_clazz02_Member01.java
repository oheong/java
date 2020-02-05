package com.ssafy.java.day04.clazz02;

public class Member01 {
	// 생성자 : 객체 생성시 호출 가능, 생성 후에는 호출이 불가능
	// 생성자에는 반환 타입이 없음 (void도 없음!!!)
	// 생성자는 클래스 이름과 같아야함(국룰)
	Member01(String name) {
		System.out.println("생성자인가요(1)??");
	}
	
	// 일반메서드임 : 객체 생성후 호출이 가능
	// 일반 메소드에는 반환 타입이 있음.
	// 인스턴스 메소드 (static X), 클래스 메소드 (static O)
	void Member01(String name) { // 인스턴스 메소드
		System.out.println("생성자인가요(2)??");
	}
}
