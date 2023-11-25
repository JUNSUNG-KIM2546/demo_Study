package ssw.demo.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main30 {
	 public static void main(String[] args) throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int[] list1 = new int[28];	// list1라는 배열에 지정한만큼 할당
	    int[] list2 = new int[30];	// list2라는 list1과 비교 할 배열
	    
	    for(int A=0; A < list2.length; A++) {
	    	list2[A] = A+1;
	    }
	    
	    Arrays.sort(list1);	// list1 오림차순
	    Arrays.sort(list2);	// list1 오림차순
	    String listStr = Arrays.toString(list2);	// int형 배열을 String 배열로 형 변환
	    
	    for(int B=0; B<28; B++) {
	        String S = br.readLine();
	        for(int i=0; i<listStr.length(); i++) {
	        	if(!Arrays.asList(listStr).contains(S)) {
	        		
	        	}
	        }
	    }
	    bw.write(Integer.toString(list2[0]));
		bw.newLine();
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
}

/*
		//for(int tot : list) {
    	//	ma = Math.max(tot, ma);
    	//	mi = Math.min(tot, mi);
	    //}
	    
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//String s = br.readLine();
		//bw.write(co); // 할당
		//bw.write(Arrays.toString(list)); // 리스트 할당
		//bw.newLine(); // 줄바꿈
		//bw.flush(); //출력
		//bw.close(); //종료
		//String li = Arrays.toString(list);	// 정수형 배열을 문자열 배열로 변환
		 * 
		//int B = Integer.parseInt(st.nextToken());
		//list[j] = Integer.parseInt(st.nextToken());
		
		//StringTokenizer st = new StringTokenizer(input, " ");	// 토큰라이저
		//Arrays.sort(list1);	// list1 오림차순 
*/

		/*
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`    |
		||_/=\\__|
		*/