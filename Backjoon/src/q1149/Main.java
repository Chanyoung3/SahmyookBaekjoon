package q1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[][] arr = new int[in][3];
		int[] rgb = new int[in];
		int min = 0;
		
		for(int i = 0; i < in; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < in; i++) {
			if(arr[i][0] <= arr[i][1]) {
				if(arr[i][0] <= arr[i][2]) {
					min += arr[i][0];
				}
				else {
					min += arr[i][2];
				}
			}
			else {
				if(arr[i][1] <= arr[i][2]) {
					min += arr[i][1];
				}
				else {
					min += arr[i][2];
				}
			}
		}
		
		System.out.println(min);
	}	
}