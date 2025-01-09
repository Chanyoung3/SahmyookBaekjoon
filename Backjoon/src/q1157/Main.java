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
		for(int i = 0; i < s.length - 1; i++) {
			if(s[i] == s[i+1]) cnt++;
		}
	}
}
