package q10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int icom = sc.nextInt();;
		int top = -1;
		int[] stack = new int[icom];
		
		for (int i = 0; i < icom; i++) {
            String command = sc.next(); // 명령어 입력

            if (command.equals("push")) {
                int value = sc.nextInt(); // 추가할 값 입력
                stack[++top] = value; // top 증가 후 값 추가
            } else if (command.equals("pop")) {
                if (top == -1) {
                    System.out.println("-1"); // 스택이 비었을 경우
                } else {
                    System.out.println(stack[top]); // top 값 출력
                    top--; // top 감소
                }
            } else if (command.equals("size")) {
                System.out.println(top + 1); // 스택 크기 출력
            } else if (command.equals("empty")) {
                if (top == -1) {
                    System.out.println("1"); // 스택이 비어 있음
                } else {
                    System.out.println("0"); // 스택이 비어 있지 않음
                }
            } else if (command.equals("top")) {
                if (top == -1) {
                    System.out.println("-1"); // 스택이 비었을 경우
                } else {
                    System.out.println(stack[top]); // top 값 출력
                }
            }
        }
		
		
		sc.close();
	}
}
