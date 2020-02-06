package com.ssafy.java.day05.clazz03;

class Type {
	public void print() {
		System.out.println("Type 기본제공 메소드");
	}
}

class Type1 extends Type {
	public void print() {
		System.out.println("Type1 호출됨");
	}
}

class Type2 extends Type {
	public void print() {
		System.out.println("Type2 호출됨");
	}

	public void test() {
		System.out.println("Type2의 특별한 기능");
	}
}

class Type3 extends Type {

}

public class Test03 {
//	static void call(Type1 t) {
//		t.print();
//	}
//	static void call(Type2 t) {
//		t.print();
//	}
	static void call(Type t) {
		t.print();
		if (t instanceof Type2) {
			Type2 t2 = (Type2) t;
			t2.test();
		}
	}

	public static void main(String[] args) {
		Type1 t1 = new Type1();
		call(t1);
		Type2 t2 = new Type2();
		call(t2);
		// 부모와 자식간에 메소드를 똑같이 정의해 줬기 때문에 자식클래스에 있는 메소드가 출력됨
	}
}
