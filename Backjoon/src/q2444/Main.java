package q2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < in; i++) {
			for(int j = in - i -1; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for(int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < in ; i++) {
			for(int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for(int l = in - i - 1; l > 1 ; l--) {
				System.out.print("*");
			}
			for(int j = in - i -1; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
