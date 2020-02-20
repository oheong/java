package com.ssafy.java.day02_05exception;

import java.util.Random;

/*
 * 런타임에 발생하는 예외 확인하고 특징 이해하기
 * 
 * Throwable
 * Exception
 * RuntimeException
 * ClassCastException, ArithmeticException, NullPointerException
 */
public class Test02 {
	public static void main(String[] args) {
		Object o = new Random();
//		ClassCastException
		// 런타임 예외의 대분분은 개발자 실수로 발생한다.  와 개잠와
		String s = (String)o;
		
//		ArithmeticException
		System.out.println(1/0);
		
		String s2 = null;
//		NullPointerException
		System.out.println(s2.length());
	}
}
