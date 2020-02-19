/*
 * 접근제한자
 * public		: 모든 패키지 클래스들
 * protected	: defalut 접근 영역 + 다른 패키지의 상속 클래스
 * defalut		: 같은 패키지에서 접근
 * private		: 자기 클래스만 접근
 * 

 * 
 * public => 다른 패키지에서도 접근 가능
 * protected => 같은 패키지는 접근 가능. 다른 패키지는 상속관계가 있을때만 접근 가능
 * defalut => 같은 패키지에서만 접근 가능
 * private => 내 클래스에서만 접근 가능 (캡슐화, Encapsulation)

 * 
 * class, 멤버 변수(member variable). 메소드(Method) 다 따진다,,
 * class : pulic, defalut 만 선언 가능( 내부 클래스 제외 ) => 클래스안의 클래스 : 내부클래스
 * 멤버 변수(member variable). 메소드(Method) : 4가지 모두 다 선언
 * 
 */
package com.ssafy.java.day05.clazz02.aaa;

public class PackA {
	public 		int a; // 모든 패키지에서 접근 가능
	protected 	int b; // A를 상속받은 패키지는 접근 가능
	/*defalut*/	int c; // 같은 패키지에서 접근 가능
	private 	int d; // A클래스 안에서만 접근 가능
	
	
	//private PackA() {}
}

