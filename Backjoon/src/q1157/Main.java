package q1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		sc.close();
		
		sen = sen.toLowerCase();
		String[] s = sen.split("");
		Arrays.sort(s);
		
		int cnt = 0;
		for(int i = 0; i < s.length; i++) {
			for (int j = 0; j < i; j++) {
				if(s[i].equals(s[j])) {
					break;
				}
				else {
					cnt++;
				}
			}
		}
	}
}
	