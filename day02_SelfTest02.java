package com.ssafy.java.day02.array;

public class SelfTest02 {
	public static void main(String[] args) {
		String name = "제임스 고슬링";
		int[][][] score = new int[][][] { { { 84, 40, 66 }, { 90, 51, 85 } }, { { 80, 30, 75 }, { 87, 92, 70 } } };

		System.out.println(String.format("** %s ** 학생의 학년별 성적", name));
		for (int hak = 0; hak < 2; hak++) {
			System.out.println(String.format("[[%d 학년]]", hak + 1));
			System.out.println("--------------------------------");
			for (int i = 0; i < 2; i++) {
				int sum = 0;
				System.out.print(String.format("%d학기 : ", i + 1));
				for (int j = 0; j < 3; j++) {
					String sub = "";
					if (j == 0)
						sub = "국어";
					else if (j == 1)
						sub = "영어";
					else
						sub = "자바";
					System.out.print(String.format("%s (%d) ", sub, score[hak][i][j]));
					sum += score[hak][i][j];
				}
				System.out.println(String.format("총점(%d) 평균(%.2f)", sum, (float) sum / 3));
			}
			System.out.println("--------------------------------");
		}
	}
}
