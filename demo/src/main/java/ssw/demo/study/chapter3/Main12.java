package ssw.demo.study.chapter3;

import java.util.*;

public class Main12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long total = 0;
        
        for(int i=1; i<10; i++) {
        	total = A * i;
        	System.out.println(A + " * " + i + " = " + total);
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