package com.ssafy.java.day02.array;

public class SelfTest01 {
	public static void main(String[] args) {
		String name = "����";
		int[][] score = new int[][] { { 84, 60, 70 }, { 95, 65, 50 } };
		System.out.println(String.format("** %s ** �л��� 1�г� ����", name));
		System.out.println("--------------------------------");
		for (int i = 0; i < 2; i++) {
			System.out.print(String.format("%d �б� : ", i + 1));
			for (int j = 0; j < 3; j++) {
				String sub = "";
				if (j == 0) sub = "����";
				else if (j == 1) sub = "����";
				else sub = "�ڹ�";
				System.out.print(String.format("%s (%d) ", sub, score[i][j]));
			}System.out.println();
		}
		System.out.println("--------------------------------");
	}
}