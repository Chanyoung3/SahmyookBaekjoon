package q2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int high = sc.nextInt();
		sc.close();
		
		int cur = up;
		int cnt = 1;
		while(cur < high) {
			cur = cur + (up - down);
			cnt++;
		}
		
		System.out.println(cnt);
	}
}