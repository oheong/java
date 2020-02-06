/*
 * 객체의 형변환
 * 
 *  - 객체 객체변수= new 객체, 좌변과 우변의 객체타입이 다를 때 발생
 *  - 조건 : 상속관계가 있어야 함.
 *  
 *  - 묵시적 형변환 (자동으로 변환 됨, 큰게 작은거 받을 때)
 *    부모 = 자식
 *  
 *  - 명시적 형변환 (형변환 연산자 필요, 작은게 큰거 받을 때)
 *    자식 = (자식을 받을 수 있는 타입) 부모
 *    
 *    
 *    
 * 묵시적 형변환 연습.
 *  - 형변환된 객체는 자신 클래스에 선언된 변수와 메소드를 사용할 수 있다.
 *  - 단, 자식 클래스에 부모 클래스의 메소드를 오버라이딩 했을 경우에는 자식 클래스의 메소드가 호출된다.
 */
package com.ssafy.java.day05.clazz03;

class Animal {
	String name = "Animal";
	public void info() {
		System.out.println("동물 입니다.");
	}
}

class Cat extends Animal {
	String name = "Cat";
	String house = "민성하우스";
	public void info() {
		System.out.println("고양이 입니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {
		// Animal a = new Animal();
		Animal a = new Cat(); // 묵시적 형변환
		System.out.println(a.name);
		//System.out.println(a.house);
		a.info(); 
	}
}
