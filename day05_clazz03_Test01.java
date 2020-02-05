package com.ssafy.java.day04.clazz03;

/*
 * 메서드 : 클래스 안에 있어야 한다
 * 선언,호출
 * Test0? <- 호출
 * Method0?<-선언
 * 
 * 메서드 선언형태
 * 활용제한자 - static, abstract, final, synchronized...
 * 접근제한자 - public, protected, default, private
 * [접근제한자][활용제한자] 반환타입 메서드명([파라미터])//선언부
 * {
 *       메서드의 바디
 * }
 * 
 * 
*/
public class Test01 {

	public static void main(String[] args) {
		Method01 m = new Method01();
		m.m01();
		m.m01(100, 'a');
		m.m01(1.1);
		m.m01(false);
		m.m01(19L); // long => double d 호출
		// long값은 double이 받을 수 있음 (형변환)
		// 큰 타입이 작은 타입을 받는것은 묵시적 형변환임
		int[] arr = new int[1];
		m.m02(arr);

		String[][] arr1 = new String[3][];
		m.m03(arr1[0]);
		
		KiKi k = new KiKi();
		m.m04(k);
	}
}