package com.ssafy.java.day02_05exception;

//public class juminNumException extends Exception { // 컴파일 시점 체크 예외
public class juminNumException extends RuntimeException { // fjs파일 시점 체크 예외
	public juminNumException(String msg) {
		super("주민번호는 13이어야합니다. (" + msg + ")");
	}
}
