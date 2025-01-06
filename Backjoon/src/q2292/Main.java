package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		
		in -= 1;
		int i = 1;
		
		if(in > 0) {
			for(int k = 0; in > 0; k++) {
				in = in - (6 * (k + 1));
				i++;
			}
			System.out.println(i);
		}
		else System.out.println("1");
	}
}