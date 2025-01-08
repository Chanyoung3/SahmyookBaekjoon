package q18870;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] arr = new int[in];
		int cnt = 0;
		
		for(int i = 0; i < in; i++) {
			arr[i] =sc.nextInt();
			
			for(int j = 0; j < i; j++) {
				if(arr[i] != arr[j]) continue;
				else {
					cnt++;
					break;
				}
			}
		}
		sc.close();
		
		int[] carr = new int[in - cnt];
		int cr = 0;
		for(int i = 0 ; i < arr.length; i++) {
			int df = 0;
			for(int j = 0; j < i; j++) {
				if(arr[i] != arr[j]) continue;
				else { 
					df++;
					break; 
				}
			}
			if (df == 0) carr[cr++] = arr[i];
		}
		
		Arrays.sort(carr);
		for(int i = 0; i < carr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(carr[i] == arr[j]) arr[j] = i;
			}
		}
		
		for(int i : arr) {
			System.out.print(arr[i] + " ");
		}
	}
}