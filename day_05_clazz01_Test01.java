package com.ssafy.java.day05.clazz01;

public class Test01 {
	public static void main(String[] args) {
		Emp01 e1 = new Emp01();
		e1.setEmpNo(1);
		e1.setName("김지석");
		
		Emp01 e2 = new Emp01(2, "정윤호");
		
		Mng01 m = new Mng01(3, "손영길");
		m.addEmp01(e1);
		m.addEmp01(e2);
		System.out.println(m.info());
		
//		System.out.println(e1.info());
//		System.out.println(e2.info());
	}
}
