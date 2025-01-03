package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int total = 0;
		int dif;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		dif = total - 100;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				else if(dif == arr[i] + arr[j]) {
					arr[i] = 0;
					arr[j] = 0;
					dif = 0;
					break;
				}
			}
			if(dif == 0) break;
		}
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] != 0) System.out.println(arr[i]);
		}
	}
}