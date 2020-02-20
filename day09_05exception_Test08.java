package com.ssafy.java.day02_05exception;

import java.util.Scanner;

/*
 * 사용자 정의 예외 만들기
 * 
 *  - API에서 인식하지 못하는 예외 상황을 처리할 수 있는 예외클래스를 정의
 *  - 예외 클래스를 상속하면 사용자 정의 예외 클래스가 됨
 *  - 컴파일시 발생 예외 클래스 : RuntimeException 타입 이외의 클래스 상속
 *  - 런파일시 발생 예외 클래스 : RuntimeException 타입 클래스 상속
 *  
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민 번호 입력 : ");
		String juminNo = sc.next();
		try {
			if (juminNo.length() != 13) {
				// 예외 발생시킨다. juminNumberException
				// 강제 예외 발생시키기
				throw new juminNumException(juminNo);
			}
			System.out.println("정상적인 주민번호입니다.");
		} catch (juminNumException e) {
			String errMsg = e.getMessage();
			System.out.println(errMsg);
			e.printStackTrace();
		}
	}
}
