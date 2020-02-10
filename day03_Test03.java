package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test03 {
	static int N, Si, Sj, P, D;
	static int Ai, Aj;
	static int[] dy = { 0, -1, 0, 1, 0 };
	static int[] dx = { 0, 0, 1, 0, -1 };

	static boolean move(int[][] map, int dir, int how_many, int y, int x) {
		for (int i = 0; i < how_many; i++) {
			y += dy[dir];
			x += dx[dir];
			if (y < 0 || N <= y || x < 0 || N <= x || map[y][x] == 1) {
				Ai = 0;
				Aj = 0;
				return false;
			}
		}
		Ai = y;
		Aj = x;
		return true;
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test03.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			Si = sc.nextInt(); // 출발점의 i좌표
			Sj = sc.nextInt(); // 출발점의 j좌표
			P = sc.nextInt();

			int Pi[] = new int[P]; // 점퍼의 i좌표의 모음
			int Pj[] = new int[P]; // 점퍼의 j좌표의 모음

			for (int k = 0; k < P; k++) { // 점퍼 좌표 받아옴
				Pi[k] = sc.nextInt();
				Pj[k] = sc.nextInt();
			}

			D = sc.nextInt();
			int Dd[] = new int[D]; // 방향 모음
			int Da[] = new int[D]; // 이동 칸수 모음

			for (int k = 0; k < D; k++) {
				Dd[k] = sc.nextInt();
				Da[k] = sc.nextInt();
			}
			int[][] map = new int[N + 1][N + 1];
			for (int k = 0; k < P; k++)
				map[Pi[k]][Pj[k]] = 1;
			Ai = Si;
			Aj = Sj;
			for (int i = 0; i < D; i++)
				if (!move(map, Dd[i], Da[i], Ai, Aj))
					break;
			System.out.println("#" + t + " " + Ai + " " + Aj);
		}
	}
}
