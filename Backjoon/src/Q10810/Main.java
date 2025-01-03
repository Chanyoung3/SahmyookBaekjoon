package Q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int im = sc.nextInt();
		int cnt= 0;
		int[] arr = new int[in];
		
		// 배열을 초기화
		for(int x = 0; x < in; x++) {
			arr[x] = 0;
		}
		
		while( cnt < im ) {
			int ii = sc.nextInt();
			int ij = sc.nextInt();
			int ik = sc.nextInt();
			
			for(int i = ii - 1; i < ij; i++) {
				arr[i] = ik;
			}
			cnt++;
		}
		sc.close();
		
		for (int x = 0; x < in; x++) {
			System.out.print(arr[x] + " ");
		}
	}
}