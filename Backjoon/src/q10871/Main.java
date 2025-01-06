package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int ix = sc.nextInt();
		int[] arr = new int[in];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] < ix) System.out.print(arr[j] + " ");
		}
		
	}
}