/*
 * 명시적 형변환
 * 
 * 자식  = 부모 : 컴파일 에러
 * 자식  = (타입)부모 : 형변환 연산자를 이용한 변환
 * 
 * 부모 객체 자리에 올 수 있는 것은 묵시적 형변환이 된 객체만 가능하다!!!!
 */
package com.ssafy.java.day05.clazz03;

class Fruit{}
class Apple extends Fruit{}
public class Test02 {
	public static void main(String[] args) {
//		Fruit f = new Fruit();
//		Apple a = f; // Apple(자식) = Fruit(부모), 컴파일 에러 발생
//		Apple a = (Apple)f; // 컴파일에러는 안남! 하지만 실행시킬때 메모리에는, f라는 객체에는 Apple이라는 클래스 정보가 없기때문
		
		Fruit ff = new Apple(); // ff 객체는 묵시적 형변환이 되어있음. ff에는 Apple 클래스 정보도 포함되어있음
		Apple aa = (Apple)ff; 
		// 이거 왜 하는거임? 하위객체가 가지고 있는 기능을 다 써야할 때
	}
}
