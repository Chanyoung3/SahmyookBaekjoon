package q2440;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < inum; i++) {
			for(int j = inum; j > i ;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}