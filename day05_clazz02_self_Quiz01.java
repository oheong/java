/*
강아지의 이름은 이름모름이고 나이는 0입니다.
강아지의 이름은 쫑이고 나이는 0입니다.
강아지의 이름은 이름모름이고 나이는 3입니다.
강아지의 이름은 메리이고 나이는 2입니다.
 */
package com.ssafy.java.day04.clazz02.self;

public class Quiz01 {
	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d2 = new Dog("쫑");
		Dog d3 = new Dog(3);
		Dog d4 = new Dog("메리", 2);
		d.info();
		d2.info();
		d3.info();
		d4.info();
	}
}
