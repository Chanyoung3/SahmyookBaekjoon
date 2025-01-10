package q10828;

public class CYStack {
	private int[] stack;
	private int top;

	public CYStack(int size) {
		stack = new int[size];
		top = -1;
	}

	public void push(int value) {
		stack[++top] = value;
	}

	public void pop() {
		if (top == -1) {
			System.out.println("-1");
		} else {
			System.out.println(stack[top]);
			stack[top] = 0;
			top--;
		}
	}

	public void size() {
		System.out.println(top + 1);
	}

	public void empty() {
		if (top == -1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void top() {
		if (top == -1) {
			System.out.println("-1");
		} else {
			System.out.println(stack[top]);
		}
	}

}
