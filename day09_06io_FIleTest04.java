package com.ssafy.java.day02_06io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FIleTest04 {
	public static void main(String[] args) {
		// 현재 시간 정보를 활용한 디렉토리 생성
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH");
		String str = sdf.format(d);
		System.out.println(str);
		File f = new File("data/io" + str);
		if (f.exists() == false) {
			f.mkdirs();
		}
		System.out.println("끝");
	}
}
