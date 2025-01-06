package q1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		if (input.equals(" ")) System.out.println("0");
		else{
			int cnt = 0;
			String set = input.trim(); 
			String[] sarr = set.split(" ");
			
			cnt = sarr.length;
			System.out.println(cnt);
		}
	}
}