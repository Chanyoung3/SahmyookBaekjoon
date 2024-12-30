package q2742;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        for (int i = n; i >= 1; i--){
            System.out.println(i);
        }
        scan.close();
    }
}
