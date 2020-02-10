/**
	실행결과>
	
	2013/07/26
	2016/02/29
	해당월에 29일은 존재하지 않은 날짜입니다. 일자를 1일로 설정합니다.
	2015/02/01
	14월은 존재하지 않는 월입니다. 월을 1월로 설정합니다.
	2015/01/29
	해당월에 33일은 존재하지 않은 날짜입니다. 일자를 1일로 설정합니다.
	2015/01/01
 */
package com.ssafy.java.day04.clazz02.self;

public class Quiz03 {

	public static void main(String[] args) {
		MyDate m1 = new MyDate(2013, 7, 26);
		System.out.println(m1.toString());  // 2013/07/26

		MyDate m2 = new MyDate(2016, 2, 29);
		System.out.println(m2.toString());  // 2016/02/29
		//윤년임

		MyDate m3 = new MyDate(2015, 2, 29);
		System.out.println(m3.toString());  // 2015/02/01
		
		MyDate m4 = new MyDate(2015, 14, 29);
		System.out.println(m4.toString());  // 2015/01/29
		
		MyDate m5 = new MyDate(2015, 1, 33);
		System.out.println(m5.toString());  // 2015/01/01
	}
}
