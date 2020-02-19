package com.ssafy.java.day01_03interface;
/*
 * 인터페이스
 * 
 * ----------------------------------
 * - 완벽한 추상화된 클래스(추상메소드만 선언가능 - 1.8 버전 부터 default, static 메소드 선언 가능)
 * - 구현된 메소드(X) + 추상메소드
 * - 클래스 선언시 "class 이름" 대신에 "interface 이름"을 사용하면 인터페이스로 인식
 * - 추상클래스와의 차이점 : 다중 상속 가능, 클래스 간의 상속은 단일 상속만 가능
 * - 상속
 *   class -> class : extends, 단일 상속만 가능, extends A, B(X) extends A(O)
 *   interface -> interface : extends, 다중 상속 가능, extends A, B, C(O)
 *   class -> interface : implements, 다중 상속 가능, implements A, B, C(O)
 *   interface -> class : 불가능
 */
interface Inter01{}
interface Inter02{}
interface Inter03 extends Inter01{}
interface Inter04 extends Inter01, Inter02{} // 다중 상속 가능
class Class01{}
class Class02{}
class Class03 extends Class01{}
//class Class04 extends Class01, Class02{} // 다중 상속 불가능
class Class05 implements Inter01, Inter02{} // 다중 상속 가능
class Class06 extends Class01 implements Inter01, Inter02{} // 순서 바뀌면 안됨!!!!!!! extends -> implements
public class Test07 {
	public static void main(String[] args) {
		
	}
}
