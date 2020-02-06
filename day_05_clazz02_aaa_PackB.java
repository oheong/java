package com.ssafy.java.day05.clazz02.aaa;

public class PackB { // 같은 패키지의 다른 클래스
	PackB(){
		PackA pa = new PackA();
		System.out.println(pa.a);
		System.out.println(pa.b);
		System.out.println(pa.c); // defalut까지 가능
//		System.out.println(pa.d); // private라 다른 클래스에서는 접근 불가
	}
}
