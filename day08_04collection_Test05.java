package com.ssafy.java.day01_04collection;

import java.util.HashMap;
import java.util.Map;

/*
 * Map
 * 
 * 키, 값의 쌍으로 관리
 * key, value
 * 키값의 중복을 허용하지 않는다.
 */
public class Test05 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("id", "hong");
		map.put("name", "홍");

//		String prevId = map.get("id");
//		map.put("id", "kim"); 
		String prevId = map.put("id", "kim");
		// put이 string을 return하기때문에 가능

		System.out.println(prevId);

		System.out.println(map.put("email", "kim@a.com"));
		System.out.println(map);

		System.out.println(map.containsKey("id"));
		System.out.println(map.containsValue("kkk"));

		// 원하는 데이터 추출
//		String id = map.get("id");
//		System.out.println("id -> " + id);
//		String email = map.get("email");
//		System.out.println("email -> " + email);

	}
}
