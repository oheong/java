/*
I M N            
모든 픽셀이 흰색(O)으로 칠해진 M X N 이미지를 새로 만든다 

C
모든 픽셀을 흰색(O)으로 칠해서 표를 지운다. 이미지의 크기는 바뀌지 않는다.

L X Y C
(X, Y) 픽셀을 주어진 색(C)으로 칠한다.

V X Y1 Y2 C
X열에 Y1행과 Y2행 (Y1, Y2 포함) 사이에 주어진 색(C)으로 수직 방향 직선을 긋는다.

H X1 X2 Y C
Y행에 X1열과 X2열 (X1, X2 포함) 사이에 주어진 색(C)으로 수평 방향 직선을 긋는다.

K X1 Y1 X2 Y2 C
주어진 색(C)으로 채워진 직사각형을 그린다. (X1, Y1)은 왼쪽 위 끝점, (X2, Y2)는 
오른쪽 아래 끝 점을 의미한다.

F X Y C
R 영역을 주어진 색(C)으로 채우는데 영역 R은 다음과 같이 정의된다. (X,Y)픽셀은 R에 속한다. 
(X,Y) 픽셀과 색이 같고 R에 포함된 픽셀과 맞닿은 부분이 하나라도 있다면 그 픽셀도 
R 영역에 포함된다. 

S NAME
파일명은 입력받은 그대로 출력하고 그 뒤에 현재 이미지의 내용을 출력한다.

X
세션을 종료한다.


출력 >>
S NAME 이라는 명령이 있을 때마다 NAME으로 주어진 파일명을 출력하고 현재 이미지의 내용을 출력한다.
각 행은 각 픽셀의 색을 나타내는 문자로 표시된다. 출력 예를 참고하자
I, C, L, V, H ,K, F, S, X를 제외한 문자로 정의된 명령이 있으면 그 줄 전체를 무시하고
다음 명령으로 넘어간다. 다른 오류에 대해서는 프로그램의 행동을 예측할 수 없다.

제공되는 quiz01.txt 파일의 내용을 이용하여 데이터를 입력받고 아래의 결과가 나오도록 코딩 작성

input>
I 5 6
L 2 3 A
S one.bmp
G 2 3 J
F 3 3 J
V 2 3 4 W
H 3 4 2 Z
S two.bmp
C
K 2 1 4 3 M
S three.bmp
C 
V 1 3 4 W
V 2 3 4 W
H 3 4 1 Z
H 3 4 2 Z
H 3 4 3 Z
F 2 2 J
F 5 6 J
S four.bmp
X

출력결과>
one.bmp
OOOOO
OOOOO
OAOOO
OOOOO
OOOOO
OOOOO
two.bmp
JJJJJ
JJZZJ
JWJJJ
JWJJJ
JJJJJ
JJJJJ
three.bmp
OMMMO
OMMMO
OMMMO
OOOOO
OOOOO
OOOOO
four.bmp
JJZZJ
JJZZJ
WWZZJ
WWJJJ
JJJJJ
JJJJJ
 */
package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelfTest01 {
	static int N, M, X, Y;
	static char C;
	static char[][] map = new char[1][1];
	static int[] dy = { 1, -1, 0, 0 };
	static int[] dx = { 0, 0, 1, -1 };

	static void spread(char[][] map, int y, int x, char state, char c) {
		if (y < 1 || N < y || x < 1 || M < x || map[y][x] != state || map[y][x] == c)
			return;

		map[y][x] = c;
		spread(map, y + dy[0], x + dx[0], state, c);
		spread(map, y + dy[1], x + dx[1], state, c);
		spread(map, y + dy[2], x + dx[2], state, c);
		spread(map, y + dy[3], x + dx[3], state, c);
	}

	static void changeF(char[][] map, int y1, int y2, int x1, int x2, char c) {
		for (int i = y1; i <= y2; i++) {
			for (int j = x1; j <= x2; j++) {
				map[i][j] = c;
			}
		}
	}

	static void changeV(char[][] map, int x, int y1, int y2, char c) {
		for (int i = y1; i <= y2; i++) {
			map[i][X] = c;
		}
	}

	static void makeO(char[][] map) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				map[i][j] = 'O';
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("selftest.txt"));
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.next();
			// System.out.println("s : " + s);
			char choice = s.charAt(0);
			if (choice == 'X')
				break;
			else if (choice == 'I') {
				M = sc.nextInt();
				N = sc.nextInt();
				map = new char[N + 1][M + 1];
				makeO(map);
			}

			else if (choice == 'C') {
				makeO(map);
			}

			else if (choice == 'L') {
				X = sc.nextInt();
				Y = sc.nextInt();
				String d = sc.next();
				C = d.charAt(0);
				map[Y][X] = C;
			}

			else if (choice == 'V') {
				X = sc.nextInt();
				int y1 = sc.nextInt();
				int y2 = sc.nextInt();
				String dd = sc.next();
				C = dd.charAt(0);
				changeV(map, X, y1, y2, C);
			}

			else if (choice == 'H') {
				int x1 = sc.nextInt();
				int x2 = sc.nextInt();
				Y = sc.nextInt();
				String dd = sc.next();
				C = dd.charAt(0);

				for (int j = x1; j <= x2; j++) {
					map[Y][j] = C;
				}
			}

			else if (choice == 'K') {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				String dd = sc.next();
				C = dd.charAt(0);
				changeF(map, y1, y2, x1, x2, C);
			}

			else if (choice == 'F') {
				X = sc.nextInt();
				Y = sc.nextInt();
				String dd = sc.next();
				C = dd.charAt(0);
				spread(map, Y, X, map[Y][X], C);
			}

			else if (choice == 'S') {
				String dd = sc.next();
				System.out.println(dd);
				for (int i = 1; i <= N; i++) {
					for (int j = 1; j <= M; j++) {
						System.out.print(map[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				String dd = sc.nextLine();
			}
		}
	}
}
