package q1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		sc.close();
		
		int inewn;
		if(inum < 10) {
			inewn = inum * 10 + inum;
		}
		else {
 			inewn = (inum % 10) * 10 + (((inum / 10) + (inum %10)) % 10);
		}
		int cnt = 1;
		
		while (true) {
			if( inewn == inum) break;
			
			inewn = (inewn % 10) * 10 + (((inewn / 10) + (inewn %10)) % 10);
			cnt++;
		}
		System.out.println(cnt);
	}
}