package q9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		String ps;
		
		for(int i = 0; i < in; i++) {
			int vps = 0;
			ps = sc.next();
			
			if(ps.length() % 2 != 0) {
				System.out.println("NO");
			}
			else {
				String[] cps = ps.split("");
				for(int j = 0; j < cps.length; j++) {
					if(cps[j].equals("(")) vps++;
					else vps--;
					
					if ( vps < 0) break;
				}

				if(vps != 0) System.out.println("NO");
				else System.out.println("YES");
			}
		}
		sc.close();
	}
}