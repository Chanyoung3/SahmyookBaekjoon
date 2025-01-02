package q10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int icom = sc.nextInt();
		String push, pop, size, empty;
		int top = -1;
		int[] stack = new int[icom];
		for(int i = 0; i < icom; i++) {
			if(sc.next().equals("push")) {
				stack[++top] = sc.nextInt();
				System.out.println(stack[top]);
			}
			else if(sc.next().equals("pop")) {
				System.out.println(stack[top]);
				stack[top--] = 0;
			}
			else if(sc.next().equals("size")) {
				
			}
			else if(sc.next().equals("empty")) {
				if(top == -1) System.out.println("1");
				else System.out.println("0");
			}
			else if(sc.next().equals("top")) {
				
			}
		}
		
		
		sc.close();
	}
}
