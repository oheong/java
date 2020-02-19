package com.ssafy.java.day05.clazz01;

public class Mng02 extends Emp02 { // 관리자

	// 관리하는 사원들의 정보
	private Emp02[] mngList = new Emp02[2];
	private int pos = 0;

	public void addEmp02(Emp02 emp) {
		mngList[pos++] = emp;
	}

	public Mng02() {
	}

	public Mng02(int empNo, String name) { // Emp02에 대한 생성자와 기능이 같음
		super(empNo, name); // super 키워드는 반드시 생성자 안에마 있어야함.
		//this(); => 이거는 안됨!!!
	}

	// 게터 및 세터는 상속받는 Emp02에 있으니까, 굳이 사용할 필요x

	public String info() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.info());
		sb.append("\n관리하는 사원의 정보\n");
		sb.append("---------------------------------\n");
		for (int i = 0; i < pos; i++) {
			Emp02 emp = mngList[i];
			sb.append(emp.info() + "\n");
		}
		sb.append("---------------------------------\n");
		return sb.toString();
	}
}
