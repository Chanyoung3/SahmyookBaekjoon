package q2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		sc.close();
		
		// 입력된 숫자만큼 반복
		for (int i = 0; i < inum; i++) {
			// 입력된 숫자부터 1개씩 늘어나게 찍기
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
