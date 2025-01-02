package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum1 = sc.nextInt();
		int inum2 = sc.nextInt();
		sc.close();
		
		int itrd, isec, ifst, iresult1, iresult2, iresult3, ifresult;
		itrd = inum2 / 100;
		isec = inum2 % 100 / 10;
		ifst = inum2 % 10;
		
		iresult1 = inum1 * ifst;
		iresult2 = inum1 * isec;
		iresult3 = inum1 * itrd;
		ifresult = inum1 * inum2;
		
		System.out.println(iresult1);
		System.out.println(iresult2);
		System.out.println(iresult3);
		System.out.println(ifresult);
	}
}
