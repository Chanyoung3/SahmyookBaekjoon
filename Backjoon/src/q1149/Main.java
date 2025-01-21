package q1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[][] rgb = new int[in][3];
		int total = 0;

		for (int i = 0; i < in; i++) {
			for (int j = 0; j < 3; j++) {
				int min = 1000000;
				if (i == 0)
					rgb[i][j] = sc.nextInt();
				else {
					for (int k = 0; k < 3; k++) {
						if (j == k)
							continue;
						else if (rgb[i - 1][k] < min)
							min = rgb[i - 1][k];
					}
					rgb[i][j] = sc.nextInt() + min;
				}
			}
		}
		sc.close();

		total = Math.min(Math.min(rgb[in-1][0], rgb[in-1][1]), rgb[in-1][2]);
		System.out.println(total);

	}
}