package q1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		sc.close();
		
		sen = sen.toUpperCase();
		String[] s = sen.split("");
		Arrays.sort(s);
		
		int cnt = 1;
		for(int i = 0; i < s.length -1 ; i++) {
			if(!s[i].equals(s[i+1])) cnt++;
		}
		
		String[] w = new String[cnt];
		w[0] = s[0];
		int wc = 1;
		for(int i = 0; i < s.length -1 ; i++) {
			if(!s[i].equals(s[i+1])) w[wc++] = s[i+1];
		}
		
		int[] col = new int[cnt];
		int ccnt = 0;
		for(int i = 0; i < w.length; i++) {
			for(int j = 0; j < s.length; j++) {
				if(w[i] == s[j]) col[ccnt] = ccnt++;
			}
		}
		
		int max = 0;
		for(int i = 0; i < col.length; i++) {
			if(col[i] > max) max = col[i];
		}
	}
}
	