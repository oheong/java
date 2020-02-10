package com.ssafy.java.day04.clazz03;

/*
 * 메소드 반환타입 연습
 * 
 * void
 *  - 호출되는 메서드는 호출한 쪽으로 값을 넘길수 있는데 값을 넘기지 않겠다는것을 의미
 *  - 메소드 내에서  return 문을 선택적으로 사용
 *  - 만약, return 문을 사용하면 return; 값을 설정하면 안됨
 *  
 * return
 *  - 현재 실행중인 메소드를 종료 시킨다.
 *  - 메소드를 호출한 쪽으로  return 값;을 넘긴다.
 *  
 *  호출한 쪽에서는 반환 타입이 void가 아니라면 선택적으로 값을 받아서 사용하면 됨
 *  반환 타입이 void일 경우는 값을 받을 수 ㅇ벗으므로 값을 받으려하면 에러발생
 */
public class Test02 {
	public static void main(String[] args) {
		Method02 m = new Method02();

		m.m01();
		// void일 경우 출력,,
		// System.out.println(m.m01());
		int v = m.m02();
		System.out.println(v);
		String s = m.m03();
		System.out.println(s);

		StringBuffer sb = new StringBuffer();
		sb.append("a").append("b").append("c").append("d");
		System.out.println(sb);
	}
}
