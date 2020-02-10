package com.ssafy.java.day06.clazz01;

import static java.lang.Math.*;

public class Test02 {
	public static void main(String args[]) {
		// static
		// 객체의 생성없이 사용하고있기때문에 static으로 선언됨
		// static으로 쓰는 것들은 멤버변수와 연관성 없음
//		System.out.println(Math.PI);
//		System.out.println(Math.abs(-1));
//		System.out.println(Math.ceil(1.1));
//		System.out.println(Math.floor(1.1));
		System.out.println(PI);
		System.out.println(abs(-1));
		System.out.println(ceil(1.1));
		System.out.println(floor(1.1));
		// static을 import했기때문에 객체선언 안해도됨
	}
}
