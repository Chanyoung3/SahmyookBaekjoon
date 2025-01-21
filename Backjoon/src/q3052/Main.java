package q3052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] rem = new int[10];
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			rem[i] = arr[i] % 42;
		}
		sc.close();
		
		for(int i = 0; i < rem.length; i++) { 
			for(int j = 0; j < rem.length; j++) {
				if(i <= j) continue;
				
				if(rem[i] == rem[j]) rem[j] = -1;
			} 
		}
		
		for(int i = 0; i < rem.length; i++) {
			if(rem[i] != -1) cnt++;
		}
		
		System.out.println(cnt);
	}
}