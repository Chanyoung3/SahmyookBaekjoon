package q10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int icom = sc.nextInt();;
		int top = -1;
		int[] stack = new int[icom];
		
		for (int i = 0; i < icom; i++) {
            String command = sc.next();

            if (command.equals("push")) {
                int value = sc.nextInt();
                stack[++top] = value;
            } 
            else if (command.equals("pop")) {
                if (top == -1) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[top]);
                    stack[top] = 0;
                    top--;
                }
            } 
            else if (command.equals("size")) {
                System.out.println(top + 1);
            } 
            else if (command.equals("empty")) {
                if (top == -1) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } 
            else if (command.equals("top")) {
                if (top == -1) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[top]);
                }
            }
        }
		sc.close();
	}
}
