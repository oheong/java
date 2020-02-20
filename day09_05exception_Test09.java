package com.ssafy.java.day02_05exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  직접처리 + 간접처리
 *   (알바) + (사장)
 */
class Boss {
	public void manager() {
		Alba alba = new Alba();
		try {
			alba.work();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Alba {
	public void work() throws Exception { // 간접처리 (사장이 일 함)
		try {
			FileReader fr = new FileReader("a1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
//			throw new Exception(e);
			throw e;
		}

		// 직접처리
//		FileReader fr = new FileReader("a1.txt");
//		try {
//			FileReader fr = new FileReader("a1.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}

public class Test09 {
	public static void main(String[] args) {
		// 편의점 사장
		// 알바생 일 시킴
		// 알바생이 일 하다가 에러가 발생
		// 사장에게 알려야하는가?
		// 스스로 해결해야 하는가?
		// 스스로 해결하고 사장에게도 알려아하는가?
		Boss b = new Boss();
		b.manager();
	}
}
