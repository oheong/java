/**
 * 목표
 * 
 * 인스턴스와 인스턴스 변수에 대해서 설명할 수 있다.
 * 자바 런타임시의 메모리 영역을 이해한다.
 */
package com.ssafy.java.day04.clazz01;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * 교재 3 - JVM 메모리 구조 파트에 설명 있음 교재 살펴보자..
		 * 
		 * stack에 b1 변수 공간을 할당한다.(초기화 되지 않음)  ClassLoader에게 Bread 클래스 로딩 요청을 보낸다. 
		 * ClassLoader는 Bread 클래스가 로딩되어 있지 않다면 로딩하고 그 레퍼런스를 캐싱한다. 만약 캐싱정보에 이미 존재한다면 로딩을
		 * 수행하지 않고 기존 레퍼런스를 리턴한다.  로딩된 Bread 클래스 정보를 이용하여 Bread 객체를 생성한다.  Bread 클래스의
		 * 생성자를 수행한다.  생성된 Bread 객체의 레퍼런스를 b1에 저장한다
		 */
		Bread b1 = new Bread();
		// 클래스를 한번 선언하게되면 Class Area(Method Area)에 정보가 올라가있음. 한번 올라가면 계속 로딩해서 사용
		// 누군가 클래스를 사용하려고하면 해당 Area에 접근해서 사용
		// new class를 선언하면 class area -> stack -> heap 순으로 메모리에 올라감
		// class Area : 공유, Heap : 독립
		// Heap에 instance가 만들어짐
		// 인스턴스변수 : static 안붙음, heap(독립)에 할당됨
		// 클래스변수 : static 붙음, class area(공유)에 할당됨
		// static정보는 instance정보에 안올라옴. => 전혀 연관성이 없음!!
		// static정보는 class Area에 올라온 클래스 자체와 연관이 있음

		// class안에 static변수가 있으면 (참조변수.멤버변수) 가 아니라, (클래스이름.멤버변수) 이렇게 만들어야함!

		// 클래스의 인스턴스변수 : 클래스 안의 메소드에 사용되지 않는 변수들 중에서도 static이 붙지 않은것
		// 클래스의 멤버변수 : 클래스 안의 메소드에 사용되지 않는 변수들 중에서도 static이 붙은것
		

		System.out.println(b1.name);
		System.out.println(b1.price);
		System.out.println(b1.cal);

		Bread b2 = new Bread();
		b2.name = "소보로";
		b2.price = 2000;
		b2.cal = 430;

		Bread b3 = b2; // b2와 b3는 같은 공간을 쓰게 됨!!!! 같은 공간을 참조하고있음
		b3.name = "단팥빵";

		System.out.println(b2.name);
		System.out.println(b3.name);

		/*
		Bread[] a = new Bread[3]; // a라는 참조변수가 생기고 3짜리 배열이 만들어짐
								  // a라는 공간에는 null로 초기화됨
								  // 
		a[0].name = "단팥빵";
		
		Bread b4 = a[0];
		System.out.println(b4.name);
		*/
	}
}
