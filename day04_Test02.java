package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test02 {
	static long Answer;
	static int N, S;

	static int[] dy = { 0, 1, 0 };
	static int[] dx = { 0, 0, 1 };

	static void move(int[][] map, int me, int y, int x, int dir) {
		map[y][x] = me;
		for (int i = 3; 0 < i; i--) {
			for (int count = 0; count < i; count++) {
				y += dy[dir];
				x += dx[dir];
				if (y < 0 || N <= y || x < 0 || N <= x)
					return;
			}
			if (map[y][x] != 0) {
				Answer = me;
				return;
			}
			map[y][x] = me;
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test02.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// �׽�Ʈ ���̽� ��

		for (int t = 1; t <= T; t++) {
			N = sc.nextInt(); // �迭�� ũ�� NxN
			int[][] lake = new int[N][N];

			S = sc.nextInt();// �ұ�����(Strider)��
			int[][] strider = new int[S][3];
			for (int k = 0; k < S; k++) {
				strider[k][0] = sc.nextInt();// ����ġ
				strider[k][1] = sc.nextInt();// ����ġ
				strider[k][2] = sc.nextInt();// ����(1:��,2:��)
			}

			for (int i = 0; i < S; i++)
				move(lake, i + 1, strider[i][0], strider[i][1], strider[i][2]);

			System.out.println("#" + t + " " + Answer);
			Answer = 0;
		}
	}
}
