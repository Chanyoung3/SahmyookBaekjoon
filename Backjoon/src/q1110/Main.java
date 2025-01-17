package q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		sc.close();
		
		int plusc;
		if(inum < 10) {
			plusc = inum * 10 + inum;
		}
		else {
			plusc = (inum % 10) * 10 + (((inum / 10) + (inum %10)) % 10);
		}
		int cnt = 1;
		
		while (true) {
			if( plusc == inum ) break;
			
			plusc = (plusc % 10) * 10 + (((plusc / 10) + (plusc %10)) % 10);
			cnt++;
		}
		System.out.println(cnt);
	}
}