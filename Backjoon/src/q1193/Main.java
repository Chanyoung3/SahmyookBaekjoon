package q1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		sc.close();
		
		int a = 1, b =1, cnt = 1, cnt2 = 1;
		int dir = 0;
		
		while(true) {
			if( cnt == ix ) break;
			
			if(dir == 0) {
				b++;
				cnt++;
			}
			else if (dir == 1) {
				for(int i = 0; i < cnt2; i++) {
					a++;
					b--;
					cnt++;
					if( cnt == ix ) break;
				}
				cnt2++;
			}
			else if (dir == 2) {
				a++;
				cnt++;
			}
			else {
				for(int i = 0; i < cnt2; i++) {
					a--;
					b++;
					cnt++;
					if( cnt == ix ) break;
				}
				cnt2++;
			}
			dir = (dir + 1) % 4;  
		}
		System.out.println(a + "/" + b);
	}
}