package com.ssafy.java.day02_05exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  예외의 간접 처리 방식
 *   throws
 *    - 메소드의 선언부에 사용
 *      : [접근제한자][활용제한자] 반환타입 메소드명([파라미터]) [throws 예외클래스타입, ...]{}
 *    - 선언된 메소드내에 틀정 예외가 발생할 수 있음을 호출하는 쪽으로 전달한다. 호출한 쪽에서는 예외처리를 진행한다.
 *    
 */
public class Test07 {
	private static void call() throws FileNotFoundException {
//	private static void call() throws Exception {
		FileReader fr = new FileReader("a1.txt");
	}

//	private static void call2() throws NullPointerException { // 호출하는쪽에 예외발생정보를 알려준다
	private static void call2() {
		String s = null;
		// NullPointerException
		System.out.println(s.length()); // 런타임에러
	}

	public static void main(String[] args) {
		try {
			call();
			call2(); // 런타임 예외를 던질 경우에는 catch블럭을 선택적으로 구현할 수 있다. (강제x)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
