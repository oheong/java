package com.ssafy.java.day01_02abstract;

/*
 * 추상클래스를 사용할 때 주의사항
 * 
 * - 객체 생성을 할 수 없다 (구현이 안되었으므로)
 * 	 ex) new 추상클래스(); (X)
 * - 객체 변수로 선언이 가능
 * - 객체 변수에 값을 만들기 위해서 자식 클래스를 이용한다.(묵시적 형변환 - 오호~~ㅋㅋㅋㅋㅋㅋㅋㅋㅋ)
 * - 추상 메소드를 자식 클래스에서 강제로 오버라이딩을 해게 만들었음. (안하면 컴파일에러 발생)
 */
abstract class AbsSuper {
	public void test() {

	}

	public abstract void call();
}

class AbsSub extends AbsSuper {
	// 메소드 오버라이딩
	public void call() {
		System.out.println("call() 호출");
	}
}

public class Test06 {
	public static void main(String[] args) {
//		AbsSuper aSuper = new AbsSuper(); // Cannot instantiate the type AbsSuper
//		AbsSuper aSuper = null; // 어떤 값을 주면 aSuper변수가 받을 수 있다.
		AbsSuper aSuper = new AbsSub(); // 어떤 값을 주면 aSuper변수가 받을 수 있다.
		aSuper.test();
		aSuper.call();

	}
}
