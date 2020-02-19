package com.ssafy.java.day01_04collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Collection : 객체를 담는 그릇. 배열, Node
 * 		List - ArrayList(검색), LinkedList(변경 - 추가, 삭제)
 * 		Set	 - 중복을 허용하지 않는다.
 * 			 - HashSet, TreeSet(정렬 처리)
 * 				Stack
 *		Map	 - 값의 처리를 위해 (키, 값) 쌍으로 관리
 *			 - 키 값의 중복을 하용하지 않는다.
 *			 - HashMap, TreeMap(키 정렬)
 *
 *
 * List의 주요 메소드
 * E : Element
 * T : Type
 * V : Value
 * K : key
 * N : Number
 * -------------------------------------------------
 * - add(E o) : 데이터 입력
 * - E get(int index) : 데이터 추출
 * - clear() : 모든 데이터 삭제
 * - remove(int index) : 특정 위치의 데이터 삭제
 * - remove(Object o) : 특정 객체를 삭제
 * - boolean contains(Object o) : 특정 객체의 포함 여부 판단
 * - int size() : 리스트의 크기
 * - boolean isEmpty() : 비어있는지 체크
 * - int indexOf(Object o) : 리스트에 특정 객체의 위치를 반환
 * 
 * 기존 리스트의 요소를 다른 리스트에 전체추가
 * - addAll(Collection c)
 * - Iterator iterator() : 순환자를 반환(리스트 조회 객체 반환)
 * -------------------------------------------------
 */
public class Test01 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		List list = new ArrayList();

//		// 1.4에서 쓰던 방식
//		List list = new LinkedList();
//		list.add(100);
//		list.add("a");
//		list.add("b");
//		list.add("c");
////		Object o = list.get(0);
//		String s = (String) list.get(0);

		// 1.5부터 Generic 적용
		// 클래스<파라미터타입> : 파라미터 타입에 해당하는 데이터만 받도록 제한(컴파일시 체크)
		// 1.7 부터 다이아몬드 표현 가능
//		List<String> list = new LinkedList<>();
		List<String> list = new ArrayList<>();
//		list.add(100); // 컴파일시 체크
		list.add("a");
		list.add("b");
		list.add("c");
		String s = (String) list.get(0); // 데이터 추출시 형 변환할 필요가 없어짐

		System.out.println(list.indexOf("a")); // 0
		System.out.println(list.indexOf("d")); // -1
		
		System.out.println(list.contains("d")); // false
		System.out.println(list.contains("a")); // true
		
		list.remove("b"); // b객체를 찾아 삭제
		System.out.println(list.contains("b")); // true
	}
}
