package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qz = sc.nextInt();
		
		for(int i = 0; i <= qz; i++) {
			String res = sc.nextLine();
			String[] arr = res.split("");
			if(arr[0].equals("")) continue;
			
			int score = 0, seq = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].equals("O")) {
					seq++;
					score += seq;
				}
				else {
					seq = 0;
				}
			}
			System.out.println(score);
		}
		
		sc.close();
	}
}