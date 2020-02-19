package com.ssafy.java.day01_04collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set
 * -------------------------
 * - 데이터의 중복을 허용하지 않는다
 * - 내부의 데이터를 확인하기 위해서 equals(Object o) + HashCode() 호출결과가 같으면 동일 데이터로 판다
 * - remove(Object o)
 * - 순서가 없으며 인덱스 관리를 하지 않는다.
 * - remove(int i) => X
 * - get(int i) => X
 * 
 */
public class Test04 {
	private static final int TreeSet = 0;

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		System.out.println(set.add("one")); // true
		set.add("two");
		System.out.println(set.add(new String("two"))); // false
		set.add("three");
		System.out.println(set.size()); // 3 (중복 데이터는 허용하지 않는다)

		// Set index로 처리되는 메소드는 지원하지 않음ㅎㅎ
//		set.get(1);
		for (String v : set)
			System.out.println(v);

		// 람다식 - accept 메소드 구현
		set.forEach(v -> System.out.println(v));

		// 6개 1-45 사이의 랜덤한 중복되지 않는 숫자 출력
		Random r = new Random();
		Set<Integer> numbers = new HashSet<>();
		while (numbers.size() < 6) {
			numbers.add(r.nextInt(45) + 1);
		}
		System.out.println(numbers);
	}
}
