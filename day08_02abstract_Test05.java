package com.ssafy.java.day01_02abstract;
/*
 * 추상클래스 - 구체화 되지 않은 것??? 구현이 안된것
 * - 키워드 : abstract
 * - abstract 사용가능 위치 : 클래스(o), 내부 클래스(o), 메소드(o), 필드(x)
 *   abstract int i;(X)
 *   abstract int call()(X)
 *   abstract class Test(X)
 *   
 * - abstract class
 * 	  : 추상클래스(abstract 적용된 클래스)
 * 	  : 추상메소드를 포함하는 클래스는 //☆★반드시 추상클래스//☆★로 선언해야함.
 * 	  : 구현된 메소드 + 추상 메소드 둘 다 가질 수 있음.
 * 
 * 
 * - abstract method
 *    : 추상메소드(abstract 적용된 메소드)
 *    : 메소드의 선언만 있고 구현부가 없음({} => 메소드 바디가 없어야함)
 */
abstract class Sub05{
	void test() {} // => 구현된 메소드 (메소드 바디가 있음)
//	void call(); // => 뻑나는이유? 구현되지 않았음에도 abstract 키워드가 없음 //☆★컴파일에러
	abstract void call(); // => 추상메소드 (메소드바디가 없음)
//	abstract void call() {} // => 구체화되었기때문에 추상메소드가 아님
}
public class Test05 {
	public static void main(String[] args) {
		
	}
}
