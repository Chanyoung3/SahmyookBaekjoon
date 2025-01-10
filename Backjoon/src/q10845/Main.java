package q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		int push, rear = -1;
		
		for (int i = 0; i < in; i++) {
			String cmd = sc.next();
			if (cmd.equals("push")) {
				push = sc.nextInt();
				q.offer(push);
				rear = push;
			} else if (cmd.equals("pop")) {
				if(q.isEmpty() == true) {
					System.out.println("-1");
				}
				else{
					System.out.println(q.poll());
				}
			} else if (cmd.equals("size")) {
				System.out.println(q.size());
			} else if (cmd.equals("empty")) {
				if(q.isEmpty() == true) {
					System.out.println("1");
				}
				else System.out.println("0");
			} else if (cmd.equals("front")) {
				if(q.isEmpty() == true) {
					System.out.println("-1");
				}
				else{
					System.out.println(q.peek());}
			} else if (cmd.equals("back")) {
				if(q.isEmpty() == true) {
					System.out.println("-1");
				}
				else{
					System.out.println(rear);}
			}
		}
		sc.close();
	}

}
