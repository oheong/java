package com.ssafy.java.day05.clazz02.bbb;

import com.ssafy.java.day05.clazz02.aaa.PackA; // 다른 패키지의 클래스를 사용할때에는 import 해줘야함

public class PackD {
	PackD(){
		PackA pa = new PackA();
		System.out.println(pa.a); // 서로 다른 패키지라 public만 접근 가능
//		System.out.println(pa.b);
//		System.out.println(pa.c);
//		System.out.println(pa.d);
	}
}
