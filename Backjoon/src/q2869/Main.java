package q2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int high = sc.nextInt();
		sc.close();

		int fhigh = high - up;
		int day = 1;
		int ud = up - down;
		if(fhigh == 0){
			day = 1;
		}
		else if (fhigh < ud) {
			day += 1;
		} else {
			if (fhigh % ud != 0) {
				day += fhigh / ud + 1;
			} else {
				day += fhigh / ud;
			}

		}

		System.out.println(day);

	}
}