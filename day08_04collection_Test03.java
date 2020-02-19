package com.ssafy.java.day01_04collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test03 {
	public static void main(String[] args) {
		// 데이터 조회
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

//		List<String> list2 = Arrays.asList("a","b","c");

		System.out.println("1. list.toString()");
		System.out.println(list.toString());
		System.out.println(list);

		System.out.println("2. 1.4 반복 활용-------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("3. 1.5 enhanced loop-------------------------------------");
		for (String val : list) {
			System.out.println(val);
		}

		System.out.println("4. 순환자 활용(Iterator)-------------------------------------");
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			String v = ite.next();
			System.out.println(v);
		}

		System.out.println("5. 1.8부터 가능 : 스트림 이용(내부클래스)-------------------------------------");
		list.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println("내부클래스 -> " + t);
			}
		});

		System.out.println("6. 1.8부터 가능 : 스트림 이용(람다표현식)-------------------------------------");
		list.stream().forEach(t -> System.out.println("람다표현식 -> " + t));
		
		System.out.println("7. 1.8(리스트 자체 이용)-------------------------------------");
		list.forEach(t -> System.out.println("람다표현식 -> " + t));

		// 내부클래스 - 익명클래스
		/*
		 * 쿨래스 또는 인터페이스 -> 부모클래스 
		 * new 클래스||인터페이스(){
		 * }
		 */

////		A a = new B();
//		A a= new A() {}; // => 익명 클래스
//		
////		AA aa = new BB();
//		AA aa = new AA() {
//
//			@Override
//			public void call() {
//				// TODO Auto-generated method stub
//				
//			}}; // => 익명클래스
	}
}

class MyConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T t) {
		// TODO Auto-generated method stub
		System.out.println("호출 -> " + t);
	}
	// 인터페이스 상속받으면 무조건 오버라이딩 해야함
}

interface AA {
	void call();
}

class BB implements AA {
	public void call() {

	}
}

class A {
}

class B extends A {
}
