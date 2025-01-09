package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, avr = 0;
		int rec;
		
		for (int i = 0; i < 5; i++) {
			rec = sc.nextInt();
			if(rec < 40) {
				rec = 40;
				total = total + rec;
			}
			else {
				total = rec + total;
			}
		}
		sc.close();
		
		avr = total / 5;
		System.out.println(avr);
	}
}