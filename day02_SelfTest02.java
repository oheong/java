package com.ssafy.java.day02.array;

public class SelfTest02 {
	public static void main(String[] args) {
		String name = "���ӽ� ����";
		int[][][] score = new int[][][] { { { 84, 40, 66 }, { 90, 51, 85 } }, { { 80, 30, 75 }, { 87, 92, 70 } } };

		System.out.println(String.format("** %s ** �л��� �г⺰ ����", name));
		for (int hak = 0; hak < 2; hak++) {
			System.out.println(String.format("[[%d �г�]]", hak + 1));
			System.out.println("--------------------------------");
			for (int i = 0; i < 2; i++) {
				int sum = 0;
				System.out.print(String.format("%d�б� : ", i + 1));
				for (int j = 0; j < 3; j++) {
					String sub = "";
					if (j == 0)
						sub = "����";
					else if (j == 1)
						sub = "����";
					else
						sub = "�ڹ�";
					System.out.print(String.format("%s (%d) ", sub, score[hak][i][j]));
					sum += score[hak][i][j];
				}
				System.out.println(String.format("����(%d) ���(%.2f)", sum, (float) sum / 3));
			}
			System.out.println("--------------------------------");
		}
	}
}
