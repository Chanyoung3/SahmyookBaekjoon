package q25314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < in / 4; i++) {
			System.out.print("long ");
		}
		
		System.out.println("int");
	}
}
