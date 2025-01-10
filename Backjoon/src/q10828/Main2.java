package q10828;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int isize = sc.nextInt();

		for (int i = 0; i < isize; i++) {
			String cmd = sc.next();

			if (cmd.equals("push")) {
				int value = sc.nextInt();
				st.push(value);
			} else if (cmd.equals("pop")) {
				try {
					System.out.println(st.pop());
				} catch (Exception e) {
					System.out.println("-1");
				}
			} else if (cmd.equals("size")) {
				System.out.println(st.size());
			} else if (cmd.equals("empty")) {
				if (st.empty() == true) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (cmd.equals("top")) {
				try {
					System.out.println(st.peek());
				} catch (Exception e) {
					System.out.println("-1");
				}
			}
		}
		sc.close();

	}

}
