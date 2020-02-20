/**
   복사 프로그램 만들기
 */
package com.ssafy.java.day02_06io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest04 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data/io/test.mp4");
			FileOutputStream fos = new FileOutputStream("data/io/testcopy.mp4");

			System.out.println("복사 시작하기..."); // 26342 - 버퍼 사용 전, 109 - 버퍼 사용 후, 3 - 사용자 버퍼

			byte[] buffer = new byte[1024 * 128];
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
			long s = System.currentTimeMillis();

			while (true) {
//				int ch = fis.read();
//				int ch = bis.read();
				int ch = fis.read(buffer);
				if (ch == -1)
					break;
//				fos.write(ch);
//				bos.write(ch);
				fos.write(buffer);
			}
			System.out.println(System.currentTimeMillis() - s);
//			bis.close();
//			bos.close();
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}