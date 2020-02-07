package com.ssafy.java.day06.clazz01;

public class Test03 {
	static void call(Object obj) { // 참조형으로써 주소값을 받아옴

	}

	public static void main(String[] args) {
		call("aaa");
		call(new int[] { 1, 2 });
		
		// Wrapper - 기본형에 대한 참조형 클래스
		/*
		 * 	기본형		참조형
		 * 	byte		Byte
		 * 	short		Short
		 * 	int			Integer
		 * 	long		Long
		 * 	float		Float
		 * 	double		Double
		 * 	char		Character
		 * 	boolean		Boolean
		 */
		
		int i = 100;
		// Boxing
		Integer iObj = new Integer(i);
		
		// UnBoxing
		int j = iObj.intValue();
		
		// java 1.5 버전 부터
		// Auto Boxing(기본형 -> 참조형)
		Integer iObj2 = i;
		// Auto UnBoxing(참조형 -> 기본형)
		int k = iObj2;
		
		
		// 이 밑에 놈들은 주소값이 아니라 걍 값임
		call(false);
		call('a');
		call(100);
		call(3.3);
	}
}
