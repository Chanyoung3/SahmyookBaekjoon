package q3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 1, 2, 2, 2, 8};
		int[] chs = new int[6];
		
		for(int i = 0; i < chs.length; i++) {
			chs[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == chs[i]) chs[i] = 0;
			else chs[i] = arr[i] - chs[i];
		}
		
		for(int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " ");
		}
	}

}
