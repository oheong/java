/*
 * 오버라이딩(재정의) 
 *  - 메소드의 다형성 : 오버로딩, 오버라이딩
 *  - 필수조건
 *  	1. 메소드 이름과 파라미터 타입과 갯수가 같아야함.
 *  	2. 접근제한자는 부모의 접근제한자보다 좁으면 안된다. (크거나 같아야 함)
 *  	3. 반환타입은 부모의 	반환타입과 같거나 자식 타입을 설정할 수 있다.
 *  
 *  자바의 모든 클래스들은 java.lang.Object 를 상속받는다.
 *  자바의 클래스간 상속은 단일 상속만 지원한다. (하나의 자식클래스가 두 개의 부모 클래스를 가질 수 없음)
 *  ex) class A extends B, C (X)
 *  => 다중상속의 개념이 필요할 경우, 인터페이스를 이용한다.
 *  toString() 메소드 이해하기
 *  
 *  java.lang : 프로그램 작성시 기본으로 사용되는 클래스들이 모여있는 패키지
 *  		  : 자동 import 된다.
 *  
 *  ☆ 오버라이딩(재정의) : 같은이름, 같은 파라미터
 *  ★ 오버로딩 : 같은이름, 다른 파라미터
 * 
 */

package com.ssafy.java.day05.clazz01;
/*
 * 상속을 받은 클래스를 선언하면 상속해준 모든 클래스들이 메모리에 올라오게 됨
 *  
 * ex) A->B->C->D->E
 * 
 * 		E호출.
 * 
 * 메모리에는 E, D, C, B, A, Object이렇게 올라오게 됨
 * 
 */

import java.util.ArrayList;
import java.util.Date;
// java.lang은 별도로 import하지 않아도 되는 패키지임

// public : 모든 패키지 안에서 다 보고 사용할 수 있음
// default : 같은 패키지 안에서 다 보고 사용할 수 있음
public class Test03 {
	public static void main(String[] args) {
		Dog d = new Dog("메리", 2);
		System.out.println(d);
		System.out.println(d.toString());
		
		
		int[] a = {1};
		System.out.println(a.toString());
		
		String s = new String("a");
		System.out.println(s);
		
		Date d2 = new Date();
		System.out.println(d2);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		System.out.println(list);
	}
}
