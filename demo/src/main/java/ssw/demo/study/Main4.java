package ssw.demo.study;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0) {
        	System.out.println(n + " is even");
        }
        else {
        	System.out.println(n + " is odd");
        }
	}
}
/*
|\_/|
|q p|   /}
( 0 )"""\
|"^"`    |
||_/=\\__|
*/