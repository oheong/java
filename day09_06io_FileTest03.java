package com.ssafy.java.day02_06io;

import java.io.File;

public class FileTest03 {
	public static void main(String[] args) {
		File f = new File("c:/ssafy");
		// 파일 객체의 경로가 디렉토리일 경우 하위 디렉토리와 파일의 이름을 가지고 옴
		File[] names = f.listFiles();
		for(File child : names) {
			String type = "파일 : ";
			String bytes = "";
			if (child.isDirectory()) {
				type = "디렉토리 : ";
			}

			else {
				bytes = " (" + child.length() + "byte)";
			}
			System.out.println(type + child.getName() + bytes);
		}
		
//		String[] names = f.list();
//		for (String name : names) {
//			File child = new File(f, name);
//			String type = "파일 : ";
//			String bytes = "";
//			if (child.isDirectory()) {
//				type = "디렉토리 : ";
//			}
//
//			else {
//				bytes = " (" + child.length() + "byte)";
//			}
//			System.out.println(type + name + bytes);
//		}
	}
}
