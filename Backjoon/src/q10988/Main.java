package q10988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String se = sc.nextLine();
		sc.close();
		
		boolean fel = true;
		String[] arr = se.split("");
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals(arr[arr.length - i -1])) {
				fel = false;
				break;
			}
		}
		
		if( fel == false) System.out.println("0");
		else  System.out.println("1");
	}
}
