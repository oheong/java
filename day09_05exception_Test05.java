package com.ssafy.java.day02_05exception;

/*
 * 실행순서 이해하기
 * 
 * try ~ catch ~ finally
 */
public class Test05 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			String s = null;
			System.out.println(s.length()); // NullPointerException
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3); // 1 - 3 - 4 - 5 
//			return; // 1 - 3 - 4
//			System.exit(0); // 1 - 3 // finally를 수행하지 않는다
		} finally {
			// 여기는 무조건 실행해야함 try세트에 포함되어있기때문에 try들어온이상 무조~건 수행하고 종료해야함
			System.out.println(4);
		}
		System.out.println(5);
	}
}
