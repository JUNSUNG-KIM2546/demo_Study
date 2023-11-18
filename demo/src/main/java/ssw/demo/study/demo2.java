package ssw.demo.study;

public class demo2 {

	public static void main(String[] args) {
		String str1;
		String str2;
		
		str1 = "ABCDFE";
		str2 = "ABC";
		
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
	            if(str2.indexOf(str1.charAt(i)) == i){
	                answer += str1.charAt(i);
	            }
	        }
		}
		
		System.out.println(answer);
		
		
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
