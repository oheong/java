/**
 * 배열과 클래스를 같이 활용하자~
 * 
 * 코드 작성하고 메모리 그리기 연습
 */
package com.ssafy.java.day04.clazz01;

public class Test02 {
	public static void main(String[] args) {
		Bread[] arr = new Bread[3];

		Bread b = new Bread();
		b.name = "소보로";
		b.price = 1000;
		b.cal = 220;

		arr[0] = b;
		
		//=============================

		arr[1] = new Bread();
		arr[1].name = "단팥빵";
		arr[1].price = 2000;
		arr[1].cal = 300;

		//System.out.println(String.format("%s %d %d", arr[0].name, arr[0].price, arr[0].cal));
		//System.out.println(String.format("%s %d %d", arr[1].name, arr[1].price, arr[1].cal));
	}
}