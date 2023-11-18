package ssw.demo.study;

import java.util.Scanner;

public class demo {

	public String mergeAlternately(String word1, String word2) {
		//Scanner sc = new Scanner(System.in);
        //String a = sc.next();
		//int a,b;
        //a = sc.nextInt();
		//b = sc.nextInt();
        //System.out.println(a + "??!");
        
       //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        
        //if( (-100000<=a && a>=100000) && (-100000<=b && b>=100000) ){
        //    System.out.println("a = " + a);
        //    System.out.println("b = " + b);
        //}
        //else {
        //    System.out.println("입력이 잘못되었습니다.");
        //}
		
        
		String merged = "";
		int j = 0;
		
		if(1 <= word1.length() && word2.length() <= 100) {
			if (word1.length() <= word2.length()) {
				for (int i=0; i < word1.length(); i++) {
					merged += word1.substring(i,i+1) + word2.substring(i,i+1);
					j = i;
				}
				if (j < word2.length()) {
					merged += word2.substring(j+1);
				}
			}
			
			else {
				for (int i=0; i < word2.length(); i++) {
					merged += word1.substring(i,i+1) + word2.substring(i,i+1);
					j = i;
				}
				if (j < word1.length()) {
					merged += word1.substring(j+1);
				}
			}
			return merged.toLowerCase();
		}
		
		else {
			merged = "Not String";
			return merged;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String aa = "";
        
        for (char c: a.toCharArray()) {
        	if (Character.isUpperCase(c)) {
        		c = Character.toLowerCase(c);
        	} else {
        		c = Character.toUpperCase(c);
        	}
        	System.out.print(c);
        }
        
        System.out.println("!@#$%^&*(\\'\"<>?:;");
        ;
        
	}
}
