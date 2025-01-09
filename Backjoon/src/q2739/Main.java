package q2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(in + " * " + (i+1) + " = " + in * (i+1));
		}
	}

}