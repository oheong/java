package com.ssafy.java.day05.clazz01;

public class Mng01 { // 관리자
	private int empNo;
	private String name;

	// 관리하는 사원들의 정보
	private Emp01[] mngList = new Emp01[2];
	private int pos = 0;

	public void addEmp01(Emp01 emp) {
		mngList[pos++] = emp;
	}

	public Mng01() {
	}

	public Mng01(int empNo, String name) {
		super();
		this.empNo = empNo;
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String info() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("empNo = %d, name = %s", empNo, name));
		sb.append("\n관리하는 사원의 정보\n");
		sb.append("---------------------------------\n");
		for (int i = 0; i < pos; i++) {
			Emp01 emp = mngList[i];
			sb.append(emp.info() + "\n");
		}
		sb.append("---------------------------------\n");
		return sb.toString();
	}
}
