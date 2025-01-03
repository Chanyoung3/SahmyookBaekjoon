package q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String set = sc.nextLine();
		sc.close();

		int cnt = 0;
		String[] sarr = set.split(" ", set.length());
		for(int i = 0; i < sarr.length; i++) {
			cnt++;
		}
		
		if(sarr[0] == "") {
			cnt--;
		}
		if(sarr[cnt] == "") {
			cnt--;
		}
		
		System.out.println(cnt);
	}
}