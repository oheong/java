package com.ssafy.java.day01_03interface;

/*
 * 인터페이스에 선언되는 모든 변수는 자동으로 상수로 인식된다. (public static final 키워드가 자동 추가됨)
 * 인터페이스에 선언되는 모든 메소드는 추상메소드로 인식된다. (public abstract 키워드가 자동 추가됨)
 *  - 단, 1.8버전에 추가된 default, static은 제외
 */
interface ServerConfig {
	/* public static final */ String IP = "19.168.0.172";

	//Abstract methods do not specify a body
//	/* public abstract */ void info() {}
	/* public abstract */ void info(); // abstract는 함수 body X
}

public class Test08 {
	public static void main(String[] args) {
		System.out.println(ServerConfig.IP); // static 키워드 확인

		// The final field ServerConfig.IP cannot be assigned
//		ServerConfig.IP = "localhost"; // final 키워드 확인
	}
}
