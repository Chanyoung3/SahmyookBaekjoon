package q2638;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		int iy = sc.nextInt();
		
		int[][] arr = new int[ix][iy];
		for(int i = 0; i < ix; i++) {
			for (int j = 0; j < iy; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		// 미완성
	}
}