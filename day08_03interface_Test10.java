package com.ssafy.java.day01_03interface;
/*
 * 인터페이스의 불편한점?
 */
interface AI{
	void work(); // public abstract
	void tell(); // public abstract
	// 1.8버전부터 제공하는 default 메소드 활용하자 : 확장을 하기위해
	// Illegal combination of modifiers for the interface method print; 
	// only one of abstract, default, or static permitted
	/* abstract */ default void print() {
		System.out.println("해당 AI 제품의 print 기능은 추후 업데이트 될 예정입니다.");
	}
	
	// 인터페이스이름.alarm() 만 접근 가능(static)
	static void alarm() {
		System.out.println("10분 뒤 점심 먹자,,");
	}
}

class SsafyAI implements AI{
	public void print() {
		System.out.println("Ssafy 표현함");
	}
	public void work() {
		System.out.println("Ssafy 일함");
	}
	public void tell() {
		System.out.println("Ssafy 말하고 있음");		
	}
}

class KakaoAI implements AI{
	public void work() {
		System.out.println("Kakao 일함");
	}
	public void tell() {
		System.out.println("Kakao 말하고 있음");		
	}
}

public class Test10 {
	public static void main(String[] args) {
		AI.alarm();
		
		AI ai = new SsafyAI();
		ai.print();
		ai.tell();
		ai.work();
		
		ai = new KakaoAI();
		ai.print();
		ai.tell();
		ai.work();
	}
}
