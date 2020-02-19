package com.ssafy.java.day05.clazz01;
/*
 * 상속과 생성자
 * 
 * 클래스가 다른 클래스를 명시적으로 받았을 경우만 아래의 케이스를 생각하자.
 * 
 * ※생성자 정의시 주의사항
 *  - 컴파일 시 생성자 내에 자동으로 처리되는 일
 * 		1. 생성자 내에서 super([파라미터, ...]) || this([파라미터, ...]) 생성자 호출하는 코드를 찾는다.
 * 			=> (생성자 안에서 super, this등의 생성자를 찾는게 아무것도 없으면)
 * 		2. 만약, 찾지 못한 경우 컴파일러는 자동으로 super() 생성자 호출하는 코드를 추가한다.
 * 		
 */
class QParent{
	QParent(){ System.out.println(1); }
	QParent( int i ){ System.out.println(2); }
}
class Qchild extends QParent{
	public Qchild() {
		// 여기에 this, super를 찾는 생성자가 없기때문에, 컴파일러가 자동으로 super()을 생성해서, QParent의 defalut 생성자로 감
		System.out.println(3);
	}
	public Qchild(int i) {
		this();
		System.out.println(5);
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		System.out.println(4);
		new Qchild(100);
	}
}
/*
 * 4
 * 1
 * 3
 * 5
 */
