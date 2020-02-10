package com.ssafy.java.day04.clazz02;

public class Member04 {
	private String name; // 멤버변수(필드)
	private int age; // 멤버변수(필드)
	
	/*
	 * 변수 - 멤버변수, 지역변수
	 * 
	 * 멤버변수 : 메소드x
	 * 	  ㄴ 인스턴스변수 (static X) => Heap
	 *	  ㄴ 클래스변수 (static O) => Class Area
	 * 
	 * 지역변수 : 메소드
	 */
	
	Member04(/* Member04 this */) {
		// 다른 생성자 호출
		this("이름이 등록되지 않았음", -1);
//		Member04("이름이 등록되지 않았음", -1);
		this.name = "이름이 등록되지 않았음";
		this.age = -1;
	}
	Member04(String name) {
		this(name, -1); // 객체가 만들어지는 시점에만 할 수 있기때문에 생성자 안에서만 this 사용 가능
		//위아래 같은 말임
		/*
		this.name = name;
		this.age = -1;
		*/
	}
	Member04(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
