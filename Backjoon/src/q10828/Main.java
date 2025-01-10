package q10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int isize = sc.nextInt();

		CYStack cs = new CYStack(isize);

		for (int i = 0; i < isize; i++) {
			String cmd = sc.next();

			if (cmd.equals("push")) {
				int value = sc.nextInt();
				cs.push(value);
			} else if (cmd.equals("pop")) {
				cs.pop();
			} else if (cmd.equals("size")) {
				cs.size();
			} else if (cmd.equals("empty")) {
				cs.empty();
			} else if (cmd.equals("top")) {
				cs.top();
			}
		}
		sc.close();
	}
}
