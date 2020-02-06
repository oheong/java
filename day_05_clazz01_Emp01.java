package com.ssafy.java.day05.clazz01;

public class Emp01 { // 사원
	private int empNo; // 사원 번호
	private String name; // 사원 이름
	// private하면 외부 클래스가 쓸 수 없음. => 캡슐화

	// 생성자
	Emp01() {
	}

	Emp01(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}

	// 세터
	// 궁금한거 세터랑 생성자랑 같은 역할하는거아님,,?ㅠ
	/*
	 * 생성자와 setter는 값을 설정한다는 점에서 같은 역할을 담당할 수 있습니다. 
	 * 다만, 생성자는 "인스턴스 생성 시"라는 시점에 초점이 더 맞춰져 있다고 볼 수 있고, 세터는 시점과 상관 없이 값을 set하는 메소드라고 볼 수 있습니다.
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	// 게터
	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public String info() {
		return String.format("empNo = %d, name = %s", empNo, name);
	}
}
