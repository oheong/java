package com.ssafy.java.day05.clazz02.bbb;

import com.ssafy.java.day05.clazz02.aaa.PackA;

public class PackE extends PackA {
	PackE() {
//		PackA pa = new PackA();
		System.out.println(a);
		System.out.println(b); // protected는 상속했기때문에 접근 가능
//		System.out.println(c);
//		System.out.println(d); // private라 다른 클래스에서 접근x
	}
}
