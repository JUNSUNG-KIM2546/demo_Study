package ssw.demo.study;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
        A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println( (A+B)%C );
		System.out.println( ((A%C)+(B%C))%C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C)*(B%C))%C );
		
		
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
