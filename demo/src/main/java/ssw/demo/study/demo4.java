package ssw.demo.study;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		String b = Integer.toString(B);
		String b3 = b.substring(2);
		String b2 = b.substring(1,2);
		String b1 = b.substring(0,1);
		
		int B3 = Integer.parseInt(b3);
		int B2 = Integer.parseInt(b2);
		int B1 = Integer.parseInt(b1);
		
		
		System.out.println( A*B3 );
		System.out.println( A*B2 );
		System.out.println( A*B1 );
		System.out.println( A * B );
	}
	
	public String gcdOfStrings(String str1, String str2) {
		
		String answer = "";
		
		if(str1.length() < str2.length()) {
			for(int i=0; i<str2.length(); i++){
	            if(str2.indexOf(str2.charAt(i)) == i){
	                answer += str2.charAt(i);
	            }
	        }
		}
		
		else {
			for(int i=0; i<str1.length(); i++){
	            if(str1.indexOf(str1.charAt(i)) == i){
	                answer += str1.charAt(i);
	            }
	        }
		}
		
		return answer;
    }
	
}
